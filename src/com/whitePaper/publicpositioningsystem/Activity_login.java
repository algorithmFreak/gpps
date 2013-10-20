package com.whitePaper.publicpositioningsystem;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Activity_login extends Activity {

	private Button button;
	private Button createNew_button; 
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.login);
		addListenerOnButton();
		
	}

	public void addListenerOnButton() {

		final Context context = this;

		button = (Button) findViewById(R.id.login);
		createNew_button=(Button)findViewById(R.id.createNew);

		   button.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				final TextView username =(TextView)findViewById(R.id.username);
        		final TextView password =(TextView)findViewById(R.id.password);
        		String uname = username.getText().toString();
        		String pass =  password.getText().toString();

        		if(uname.equals("pratik") && pass.equals("pratik")){
				Intent intent = new Intent(context, MapX.class);
				startActivity(intent);
        		}
        		else{
        			Toast.makeText(Activity_login.this,"Invalid UserName or Password", Toast.LENGTH_LONG).show();
        		}

			}
			
		});
		
		createNew_button.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				Intent intent = new Intent(context, SignUp.class);
				startActivity(intent); 
			}
		});

	}

}
