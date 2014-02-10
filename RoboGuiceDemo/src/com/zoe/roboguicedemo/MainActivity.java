package com.zoe.roboguicedemo;

import roboguice.activity.RoboActivity;
import roboguice.inject.InjectResource;
import roboguice.inject.InjectView;
import android.app.NotificationManager;
import android.graphics.drawable.Drawable;
import android.location.LocationManager;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.inject.Inject;

public class MainActivity extends RoboActivity {

	@InjectView(R.id.text1) TextView textView;
	@InjectView(R.id.button1) Button button;
	@InjectView(R.id.imageView1) ImageView imageView;
	@InjectResource(R.string.app_name) String name;
	@InjectResource(R.drawable.ic_launcher) Drawable ic_launcher;
	@Inject LocationManager locationManager;
	@Inject LayoutInflater inflater;
	@Inject NotificationManager notificationManager;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		imageView.setImageDrawable(ic_launcher);
		button.setOnClickListener(new OnClickListener() {
			int i = 0;
			@Override
			public void onClick(View v) {
				i++;
				textView.setText("点击的次数："+i);
			}
		});
	}

}
