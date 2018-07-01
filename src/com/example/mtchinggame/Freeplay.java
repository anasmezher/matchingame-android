package com.example.mtchinggame;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;

public class Freeplay extends Activity implements OnClickListener {
	ImageView free33, free44, free55, free66, back;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_freeplay);
		free33 = (ImageView) findViewById(R.id.btnfree33);
		free44 = (ImageView) findViewById(R.id.btnfree44);
		free55 = (ImageView) findViewById(R.id.btnfree55);
		free66 = (ImageView) findViewById(R.id.btnfree66);
		back = (ImageView) findViewById(R.id.backinfree);
		free33.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent x = new Intent(getApplicationContext(), Playlayout.class);
				x.putExtra("mession", "free");
				x.putExtra("value", "33");
				startActivity(x);
			}
		});
		free44.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent x = new Intent(getApplicationContext(), Playlayout.class);
				x.putExtra("mession", "free");
				x.putExtra("value", "44");
				startActivity(x);
			}
		});
		free55.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent x = new Intent(getApplicationContext(), Playlayout.class);
				x.putExtra("mession", "free");
				x.putExtra("value", "55");
				startActivity(x);
			}
		});
		free66.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent x = new Intent(getApplicationContext(), Playlayout.class);
				x.putExtra("mession", "free");
				x.putExtra("value", "66");
				startActivity(x);
			}
		});
		back.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				finish();
			}
		});

	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub

	}
}
