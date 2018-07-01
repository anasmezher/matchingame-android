package com.example.mtchinggame;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity  implements OnClickListener{
	//ﬁ”„ «· ⁄«—Ì›
	Button btnfree,btnagainst,btnmulti;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main_activity);
	//ﬁ”„ «·«‘ ﬁ«ﬁ
		btnagainst=(Button)findViewById(R.id.btnagainsttime);
		btnfree=(Button)findViewById(R.id.btnfreeplay);
		btnmulti=(Button)findViewById(R.id.btnmultyplyer);
	//«·«” Œœ«„
		btnagainst.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
			//start new activity
				Intent x = new Intent(getApplicationContext(), Playagainstime.class);
				startActivity(x);
				//we can close this actvivty but we want to back here
				//finish();
			}
		});
		btnfree.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
			//start new activity
				Intent x = new Intent(getApplicationContext(), Freeplay.class);
				startActivity(x);
				//we can close this actvivty but we want to back here
				//finish();
			}
		});
		btnmulti.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
			//start new activity
				Intent x = new Intent(getApplicationContext(), Multiplyer.class);
				startActivity(x);
				//we can close this actvivty but we want to back here
				//finish();
			}
		});
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
	}
}
