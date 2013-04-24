package com.example.babycare;


import com.example.babycare.SlideShow;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageButton;

public class BabyCare extends Activity implements OnClickListener {
	Button b1,b2,b3,b4,b5,b6,b7,b8;
	ImageButton b9;

	

	
@Override
	public boolean onKeyDown(int keyCode, KeyEvent event)  {
	    if (keyCode == KeyEvent.KEYCODE_BACK && event.getRepeatCount() == 0) {
	    	
	    	mainmenu();
	        return true;
	    }

	    return super.onKeyDown(keyCode, event);
	}
	

public  void show()

{
	setContentView(R.layout.slideshow); 

    Intent intent=new Intent(BabyCare.this,SlideShow.class);
    startActivity(intent);
	
	
	
}

	public  void mainmenu()
	{
		setContentView(R.layout.baby1); 
		
		 b1=(Button) findViewById(R.id.button03);
		 b2=(Button) findViewById(R.id.exit);
		 b3=(Button) findViewById(R.id.Vaccination);
		 b5=(Button) findViewById(R.id.faid);
		 b4=(Button) findViewById(R.id.Button01);
		 b6=(Button) findViewById(R.id.show);
		 b7=(Button) findViewById(R.id.main);
		 b8=(Button) findViewById(R.id.bdiet);
		 

		 b8.setOnClickListener(this);

		 b7.setOnClickListener(this);

		 b6.setOnClickListener(this);

		 b5.setOnClickListener(this);
		 b1.setOnClickListener(this);
		 b2.setOnClickListener(this);
		 b3.setOnClickListener(this);
		 b4.setOnClickListener(this);
		 
	}
	

	public  void mom_diet()
	{
		setContentView(R.layout.dietmom); 
		b1=(Button) findViewById(R.id.button1);
		b1.setOnClickListener(this);
		 
	}
	public  void preg()
	{
		setContentView(R.layout.facts); 
	
		 b1=(Button) findViewById(R.id.button1);
	
		 b1.setOnClickListener(this);
	
	}
	public  void vacc()
	{
		setContentView(R.layout.vacc); 
		
		b1=(Button) findViewById(R.id.button1);
		
		 b1.setOnClickListener(this); 
		 
	}
	public  void bdiet()
	{
		setContentView(R.layout.bdiet); 
		 b1=(Button) findViewById(R.id.button1);
	        b1.setOnClickListener(this);
	}       
	        
	public  void credit()
	{
		setContentView(R.layout.main); 
		 b1=(Button) findViewById(R.id.button1);
	        b1.setOnClickListener(this);
		 
		 
	}
	public  void aid()
	{
		setContentView(R.layout.firstaid); 
		 b1=(Button) findViewById(R.id.button1);
	        b1.setOnClickListener(this);
		 
		 
	}


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_baby_care);
        b9=(ImageButton) findViewById(R.id.img);
        b9.setOnClickListener(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_baby_care, menu);
        return true;
    }
	public void onClick(View v) {
		int id =v.getId();
		switch (id)
		{
		case R.id.button1 :
			mainmenu();break;
		case R.id.img :
			mainmenu();break;
	    case R.id.Button01:
	    	preg();break;
	    case R.id.Vaccination:
	    	vacc();break;
	    case R.id.button03:
	    	mom_diet();break;
	    case R.id.main:
	    	credit();break;
	    case R.id.faid:
	    	aid();break;	
	    case R.id.show:
	    	show();break;
	    case R.id.bdiet:
	    	bdiet();break;
	    case R.id.exit:
	    	finish();break;	
	    	
		}
				
		
	}
}
