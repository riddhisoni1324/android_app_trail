package com.example.riddhi.myapplication;

/**
 * Created by riddhi on 16-Jan-16.
 */
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class New extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hiii);

        Thread timer=new Thread(){
            public void run(){
                try{

                    sleep(5000);
                }
                catch(InterruptedException e){}
                finally{
                    Intent i=new Intent("com.example.riddhi.myapplication.MENU");
                    startActivity(i);

                }

            }


        };
        timer.start();
    }


}

