package com.example.helloandroid;

//import android.app.Activity;
//import android.os.Bundle;

import processing.core.*;

/*
public class HelloAndroidProcessing extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }
}
*/

public class HelloAndroidProcessing extends PApplet {
	
	public static void main(String args[]) {
	    PApplet.main(new String[] { "--present", "something.whatever" });
	  }
	
	//@Override
	//public String sketchRenderer() {
	//    return P2D;
	//}
	
	PFont f;
	String message = "this text is spinning";
	float theta;
	
	@Override
	public void setup() {    
		size(200,200);
		f = createFont("Arial", 20, true);
	}

	@Override
	public void draw() {
		background(255);
		fill(0);
		textFont(f);
		translate(width/2,height/2);
		rotate(theta);
		textAlign(CENTER) ;
		text(message,0,0); 
		theta += 0.05; 
	}
}