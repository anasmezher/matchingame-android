package com.example.mtchinggame;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Map;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

import android.app.ActionBar.LayoutParams;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

public class Playlayout extends Activity implements OnClickListener {
	LinearLayout playground;
	MediaPlayer buttonSound;
	int hitcount = 0, misscount = 0;
	TextView myTime, hittext, misstext, mscore,mislabel,hitlabel;
	int result;
	String type;
	float maxx, maxy;
	private Timer myTimer;
	long starttime;
	String score;
	int firstplyerscore=0,secondplyerscore=0,firstplyerhit=0,firstpluermiss=0,secndplyerhit=0,scndplyermiss=0;
	int player=0;
	int[] myImageList;
	LinearLayout playlayouttaskbar;
	String mession;
	int totalcounter=0;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		setContentView(R.layout.activity_playlayout);
		mislabel=(TextView)findViewById(R.id.misstextinpaylayout);
		hitlabel=(TextView)findViewById(R.id.hittextinpaylayout);
		playlayouttaskbar = (LinearLayout) findViewById(R.id.elapsedtimelayout);
		myImageList = new int[] { R.drawable.img1, R.drawable.img2, R.drawable.img3, R.drawable.img4, R.drawable.img5,
				R.drawable.img6, R.drawable.img7, R.drawable.img8, R.drawable.img9, R.drawable.img10, R.drawable.img11,
				R.drawable.img12, R.drawable.img13, R.drawable.img14, R.drawable.img15, R.drawable.img16,
				R.drawable.img17, R.drawable.img18, R.drawable.img19, R.drawable.img20, R.drawable.img21,
				R.drawable.img22, R.drawable.img23, R.drawable.img24, R.drawable.img25, R.drawable.img26,
				R.drawable.img27, R.drawable.img28, R.drawable.img29, R.drawable.img30, R.drawable.img31 };
		
		playground = (LinearLayout) findViewById(R.id.layoutplaground);
		myTime = (TextView) findViewById(R.id.timeinl1easy);
		hittext = (TextView) findViewById(R.id.hitinl1easy);
		misstext = (TextView) findViewById(R.id.missinl1easy);
		mscore = (TextView) findViewById(R.id.scoreinl1easy);
		misstext.setText(misscount + " ");
		hittext.setText(hitcount + " ");
		Bundle mydata = getIntent().getExtras();
		 mession = mydata.getString("mession");
		  type = mydata.getString("value");
		starttime = System.currentTimeMillis();
		
		myTimer = new Timer();
		myTimer.schedule(new TimerTask() {
			@Override
			public void run() {
				TimerMethod();

			}

		}, 0, 100);
		if (mession.equals("against")) {
			playlayouttaskbar.setVisibility(View.VISIBLE);

		} else {

			playlayouttaskbar.setVisibility(View.GONE);

		}
		// backGroundSound = MediaPlayer.create(getApplicationContext(),
		// R.raw.back2);
		// backGroundSound.start();

		int matrixvalue = 3;
		switch (type) {
		case "33":
			matrixvalue = 3;
			break;
		case "44":
			matrixvalue = 4;
			break;
		case "55":
			matrixvalue = 5;
			break;
		case "66":
			matrixvalue = 6;
			break;
		}
		Toast.makeText(getApplicationContext(), "wellcome ^_^... will start in 15 seconds", Toast.LENGTH_LONG).show();
		
		if (mession.equals("against")) {
			LoadImagesToplay(matrixvalue);
			PlayAgainsttime();
		} else if (mession.equals("multi")) {
			LoadImagesToplay(matrixvalue);
			hitlabel.setText("1st Player");
			mislabel.setText("2nd Player");
			
		} else {
			LoadImagesToplay(matrixvalue);
			PlayFree();
		}

		super.onCreate(savedInstanceState);
	}

	private void PlayFree() {
		// TODO Auto-generated method stub

	}

	private void PlayMultiplayer() {
		// TODO Auto-generated method stub

	}

	private void PlayAgainsttime() {
		// TODO Auto-generated method stub

	}

	int rpicked = 0;
	int picked_images_counter = 0;
	int matched_picked_images = 0;
	int picked_image_name = 0;
	ArrayList<ImageView> pickedimages = new ArrayList<ImageView>();
	ArrayList<ImageView> myaddeddimages = new ArrayList<ImageView>();

	private void LoadImagesToplay(final int matrixvalue) {
		// TODO Auto-generated method stub
		Random numb = new Random();

		int cc = 0;

		final ArrayList<Integer> myimages = new ArrayList<Integer>();
		ArrayList<Integer> myimagesappearence = new ArrayList<Integer>();
		for (int r = 0; r < matrixvalue; r++) {
			cc = numb.nextInt(30);
			myimages.add(myImageList[cc]);
			///////////////////////////////////////////////////////////////////////
			///////////////////////////////////////////////////////////////////////////////////////////////////////////////
			myimagesappearence.add(1);///////////////////////////////////////////////////////////////////////////////////////
			///////////////////////////////////////////////////
			/////////////////////////////////////////////////////
			/////////////////////////////////////////////////////////
		}
		for (int i = 0; i < matrixvalue; i++) {
			LinearLayout.LayoutParams param = new LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT,
					LayoutParams.MATCH_PARENT, 1.0f);
			LinearLayout innerlayout = new LinearLayout(getApplicationContext());
			innerlayout.setLayoutParams(param);
			for (int j = 0; j < matrixvalue; j++) {
				final ImageView image = new ImageView(getApplicationContext());

				image.setLayoutParams(param);
				myaddeddimages.add(image);
				image.setEnabled(false);
				int imagetoget = numb.nextInt(matrixvalue);
				final int bbb = imagetoget;
				for (int p = 0; p < matrixvalue; p++) {
					if (myimagesappearence.get(imagetoget) > 0) {
						image.setBackgroundResource(myimages.get(imagetoget));
						// ⁄œ«œ «·’Ê— «·„Œ «—… + ⁄œ«œ «·’Ê— «·„ÿ«»ﬁ… + „ ÕÊ·
						// ÌÕ›Ÿ ﬁÌ„… «·’Ê—… «·„Œ «—… + ·Ì”  ·Õ›Ÿ «·’Ê—
						// «·„Œ «—…„‰‘«‰ «—Ã⁄ «Œ›ÌÂ‰ «Ê Õÿ ’Õ ⁄·ÌÂ‰
						int picked = 0;
						final int innerpicked = picked;

						image.setOnClickListener(new OnClickListener() {

							@Override
							public void onClick(View v) {
								// TODO Auto-generated method stub
								/// ⁄—÷ «·’Ê—… «··Ì  Õ «
								totalcounter++;
								if(totalcounter==(matrixvalue*matrixvalue)){
									Toast.makeText(getApplicationContext(), "ALL Images Are Picked ^_^... will restart in 15 seconds", Toast.LENGTH_LONG).show();
	
													Handler mHandler2 = new Handler();
													mHandler2.postDelayed(new Runnable() {

														@Override
														public void run() {
															Intent x = new Intent(getApplicationContext(), Playlayout.class);
															x.putExtra("mession", mession);
															x.putExtra("value", type);
															finish();
															startActivity(x);	
														}

													}, 15000L);
					
								}else{
								if (innerpicked == 0) {
									image.setBackgroundResource(myimages.get(bbb));
									
									rpicked = 1;
									if (picked_images_counter == 1) {
										// testmatch
										if (bbb == picked_image_name) {
											hitcount++;
											if(player==0){
												firstplyerhit++;
											}else{
												secndplyerhit++;
											}
										} else {
											misscount++;
											if(player==0){
												firstpluermiss++;
											}else{
												scndplyermiss++;
											}
										}
										picked_images_counter = 0;
										image.setEnabled(false);
										if(mession.equals("multi")){
											if(player==0){
												Toast.makeText(getApplicationContext(), "second Palyer Turn", Toast.LENGTH_SHORT).show();
												player=1;
												ComputeResultmulty(firstpluermiss,firstplyerhit,scndplyermiss,secndplyerhit,0);
											}else{
												Toast.makeText(getApplicationContext(), "First Palyer Turn", Toast.LENGTH_SHORT).show();
												player=0;
												ComputeResultmulty(firstpluermiss,firstplyerhit,scndplyermiss,secndplyerhit,1);
												
											}
											
										}
										else if(mession.equals("free")){
											ComputeResultfree(hitcount, misscount);
										}
									} else if (picked_images_counter == 0) {
										picked_image_name = bbb;
										picked_images_counter++;
									}
								}
							}}
						});
						picked = rpicked;
						int b = myimagesappearence.get(imagetoget);
						int y = b--;
						myimagesappearence.set(imagetoget, y);
						p = matrixvalue;
					} else {
						imagetoget = numb.nextInt(matrixvalue);
					}
				}

				innerlayout.addView(image);
			}
			playground.addView(innerlayout);
		}
		/////hide all the images after 9 seconds.
		Handler mHandler1 = new Handler();
		mHandler1.postDelayed(new Runnable() {

			@Override
			public void run() {
    for(int c=0;c<myaddeddimages.size();c++){
    	ImageView x = myaddeddimages.get(c);
    	x.setBackgroundResource(R.drawable.ic_launcher);
    	x.setEnabled(true);
   
    }
 	if(mession.equals("multi")){
		Toast.makeText(getApplicationContext(), "First Palyer Turn", Toast.LENGTH_SHORT).show();
	}else{
		Toast.makeText(getApplicationContext(), "Start", Toast.LENGTH_LONG).show();
	}
				
			}

		}, 15000L);

	}

	private void TimerMethod() {
		// This method is called directly by the timer
		// and runs in the same thread as the timer.

		// We call the method that will work with the UI
		// through the runOnUiThread method.
		this.runOnUiThread(Timer_Tick);
	}

	private Runnable Timer_Tick = new Runnable() {
		public void run() {

			// This method runs in the same thread as the UI.

			// Do something to the UI thread here
 if(mession.equals("against")){
			long millis = System.currentTimeMillis() - starttime;
			int seconds = (int) (millis / 1000);
			int minutes = seconds / 60;
			seconds = seconds % 60;
			myTime.setText(minutes + ":" + seconds + ":" + (millis - seconds * 1000));
			score = ComputeResultwithtime(millis, hitcount, misscount);
			

		}}
	};

	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onBackPressed() {
		AlertDialog.Builder builder = new AlertDialog.Builder(this);
		builder.setMessage("You Really Want To Cancel? ").setCancelable(true)
				.setPositiveButton("I'm Sure", new DialogInterface.OnClickListener() {
					public void onClick(DialogInterface dialog, int id) {
						// do things
						finish();
					}
				}).setNegativeButton("canel", null);
		AlertDialog alert = builder.create();
		alert.show();
	}

	public String ComputeResultwithtime(long millis, int hitcount, int misscount) {
		int result = 0;
		result = (int) (millis * (hitcount) - misscount * 50 / 3);
		mscore.setText(result+ " ");
		hittext.setText(""+hitcount);
		misstext.setText(""+misscount);
		return result + " ";

	}
	public String ComputeResultfree( int hitcount, int misscount) {
		int result = 0;
		result = (int) ( (hitcount) - misscount );
		mscore.setText(result+ " ");
		hittext.setText(""+hitcount);
		misstext.setText(""+misscount);
		return result + " ";

	}
	public String ComputeResultmulty(int fmis, int fhit,int spleymis, int spleyhit, int i) {
		int result = 0;
		int x=fhit-fmis;
		int y =spleyhit-spleymis;
		mscore.setText("1st : "+(x)+" 2nd :"+(y));
		if(x>y){
			hittext.setText("Winner");
			misstext.setText("Loser");
		}else if(x==y){
			hittext.setText("EVEN");
			misstext.setText("EVEN");
			
		}else {
			hittext.setText("Loser");
			misstext.setText("Winner");
		}
		return result + " ";

	}



}
