package com.example.mtchinggame;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;

public class Multiplyer extends Activity implements OnClickListener {
ImageView multi33,multi44,multi55,multi66,back;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_multiplyer);
		multi33 = (ImageView) findViewById(R.id.btnmulti33);
		multi44 = (ImageView) findViewById(R.id.btnmulti44);
		multi55 = (ImageView) findViewById(R.id.btnmulti55);
		multi66 = (ImageView) findViewById(R.id.btnmulti66);
		back = (ImageView) findViewById(R.id.bbackmulti);
		multi33.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent x = new Intent(getApplicationContext(), Playlayout.class);
				x.putExtra("mession", "multi");
				x.putExtra("value", "33");
				startActivity(x);
			}
		});
		multi44.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent x = new Intent(getApplicationContext(), Playlayout.class);
				x.putExtra("mession", "multi");
				x.putExtra("value", "44");
				startActivity(x);
			}
		});
		multi55.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent x = new Intent(getApplicationContext(), Playlayout.class);
				x.putExtra("mession", "multi");
				x.putExtra("value", "55");
				startActivity(x);
			}
		});
		multi66.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent x = new Intent(getApplicationContext(), Playlayout.class);
				x.putExtra("mession", "multi");
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
