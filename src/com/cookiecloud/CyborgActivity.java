package com.cookiecloud;

import com.cookiecloud.cyborgdemo.R;

import android.app.Activity;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class CyborgActivity extends Activity {

	ImageView cyborgImage;
	AnimationDrawable cyborgAnimationYes;
	AnimationDrawable cyborgAnimationNo;
	
	@Override
    public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.cyborg);
		cyborgImage = (ImageView)findViewById(R.id.cyborg_image);
	}
	
	public void onClick(View view) {
		switch(view.getId()) {
		case R.id.cyborg_yes_button:
			animateYes();
			break;
		case R.id.cyborg_no_button:
			animateNo();
			break;
		}
	}
	
	private void animateYes() {
		cyborgImage.setImageResource(R.drawable.cyborgno);
		cyborgImage.setImageResource(R.drawable.cyborgyes);
		cyborgAnimationYes = (AnimationDrawable)cyborgImage.getDrawable();
		cyborgAnimationYes.start();
	}
	
	private void animateNo() {
		cyborgImage.setImageResource(R.drawable.cyborgyes);
		cyborgImage.setImageResource(R.drawable.cyborgno);
		cyborgAnimationNo = (AnimationDrawable)cyborgImage.getDrawable();
		cyborgAnimationNo.start();
	}
}
