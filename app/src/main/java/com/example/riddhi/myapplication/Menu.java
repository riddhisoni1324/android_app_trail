package com.example.riddhi.myapplication;

/**
 * Created by riddhi on 16-Jan-16.
 */
import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Menu extends ListActivity{
    String classes[]={"MainActivity","Textplay","Email","Camera","Data","Opened"};
    Class c;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        setListAdapter(new ArrayAdapter<String>(Menu.this,android.R.layout.simple_list_item_1,classes));
    }
    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        // TODO Auto-generated method stub
        super.onListItemClick(l, v, position, id);
        String s1=classes[position];

        //	Intent i=new Intent("com.example.my.MENU");
        //	startActivity(i);
        try {
            c=Class.forName("com.example.riddhi.myapplication."+s1);
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        Intent i=new Intent(Menu.this,c);
        startActivity(i);

    }



}

