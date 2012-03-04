package com.cookiecloud;

import com.cookiecloud.cyborgdemo.R;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }
    
    public void onStartButtonClicked(View view) {
    	Intent cyborgIntent = new Intent(this, CyborgActivity.class);
    	startActivity(cyborgIntent);
    }
}