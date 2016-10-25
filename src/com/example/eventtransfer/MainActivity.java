package com.example.eventtransfer;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.Button;

public class MainActivity extends Activity {

public void onCreate(Bundle savedInstandceState){
	
	super.onCreate(savedInstandceState);
	setContentView(R.layout.activity_main);
	MyButton myButton=(MyButton) this.findViewById(R.id.Mybtn);
	myButton.setOnTouchListener(new OnTouchListener() {
		
		@Override
		public boolean onTouch(View v, MotionEvent event) {
			// TODO Auto-generated method stub
			return false;
		}
	});
	
}
      public boolean onTouchEvent(MotionEvent event){
    	  System.out.println("MainActivity中的触摸事件触发了！");
			return false;
}
}
