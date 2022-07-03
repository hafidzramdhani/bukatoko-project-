package com.bukatoko.id;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;

public class SplashJava extends AppCompatActivity{
	
	ImageView splashLogo;
	Animation anim;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.splash_layout);
		
		splashLogo = findViewById(R.id.bukatokoIcon);
		anim = AnimationUtils.loadAnimation(this,R.anim.fade_in);
		splashLogo.startAnimation(anim);
		
		new Handler().postDelayed(new Runnable(){
			@Override
			public void run(){
				Intent splash = new Intent(SplashJava.this,MainActivity.class);
				startActivity(splash);
				finish();
			}
		}, 2000);
	}
}