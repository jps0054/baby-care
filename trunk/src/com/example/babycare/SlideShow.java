package com.example.babycare;


import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.KeyEvent;
import android.widget.ImageView;
import android.widget.TextView;

public class SlideShow extends Activity{
    private TextView txtStatus;
    private ImageView imageView;
    int i=0;
    int imgid[]={R.drawable.s9,R.drawable.s5,R.drawable.b3,R.drawable.d7,R.drawable.d1,R.drawable.d2,R.drawable.d3,R.drawable.d4,R.drawable.d5,R.drawable.d6,R.drawable.s1,R.drawable.s2,R.drawable.s3,R.drawable.s8,R.drawable.s9,};
    RefreshHandler refreshHandler=new RefreshHandler();
    
    class RefreshHandler extends Handler{
        @Override
        public void handleMessage(Message msg) {
            // TODO Auto-generated method stub
            SlideShow.this.updateUI();
        }
        public void sleep(long delayMillis){
            this.removeMessages(0);
            sendMessageDelayed(obtainMessage(0), delayMillis);
        }
    };
    
    
    public void updateUI(){
        int currentInt=Integer.parseInt((String)txtStatus.getText())+10;
        if(currentInt<=1000){
            refreshHandler.sleep(3000);
            
            if(i<imgid.length){
                imageView.setImageResource(imgid[i]);
                
                // imageView.setPadding(left, top, right, bottom);
                i++;
               if(i>=imgid.length)
                {i=0;
                }
                }
            }
        }
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        setContentView(R.layout.slideshow);
        this.txtStatus=(TextView)this.findViewById(R.id.textView1);
        this.imageView=(ImageView)this.findViewById(R.id.imageView);
        updateUI();
    }

}