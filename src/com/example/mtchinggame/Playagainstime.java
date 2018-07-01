package com.example.mtchinggame;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;

public class Playagainstime extends Activity implements OnClickListener {
	ImageView against33,against44,against55,against66,back;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_playagainstime);
		against33 = (ImageView) findViewById(R.id.btnagains33);
		against44 = (ImageView) findViewById(R.id.btnagains44);
		against55 = (ImageView) findViewById(R.id.btnagains55);
		against66 = (ImageView) findViewById(R.id.btnagains66);
		back = (ImageView) findViewById(R.id.backinagainst);
		against33.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent x = new Intent(getApplicationContext(), Playlayout.class);
				x.putExtra("mession", "against");
				x.putExtra("value", "33");
				startActivity(x);
			}
		});
		against44.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent x = new Intent(getApplicationContext(), Playlayout.class);
				x.putExtra("mession", "against");
				x.putExtra("value", "44");
				startActivity(x);
			}
		});
		against55.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent x = new Intent(getApplicationContext(), Playlayout.class);
				x.putExtra("mession", "against");
				x.putExtra("value", "55");
				startActivity(x);
			}
		});
		against66.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent x = new Intent(getApplicationContext(), Playlayout.class);
				x.putExtra("mession", "against");
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
