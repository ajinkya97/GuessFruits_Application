package com.example.aj.fragletters;

import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import layout.Fragmentfour;
import layout.Fragmentone;
import layout.Fragmentthree;
import layout.Fragmenttwo;

public class MainActivity extends AppCompatActivity implements Fragmentone.OnFragmentInteractionListener,Fragmenttwo.OnFragmentInteractionListener,Fragmentthree.OnFragmentInteractionListener,Fragmentfour.OnFragmentInteractionListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Fragmentone obj=new Fragmentone();
        android.support.v4.app.FragmentManager fm = getSupportFragmentManager();
        android.support.v4.app.FragmentTransaction ft=fm.beginTransaction();
        ft.replace(R.id.activity_main,obj);
        ft.commit();
    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }

    public void imageclick(View view)
    {
        if(view == findViewById(R.id.apple1))
        {
            Toast.makeText(this, "Right Answer", Toast.LENGTH_SHORT).show();
        }
        else if(view == findViewById(R.id.banana2))
        {
            Toast.makeText(this, "Right Answer", Toast.LENGTH_SHORT).show();
        }
        else if(view == findViewById(R.id.mango3))
        {
            Toast.makeText(this, "Right Answer", Toast.LENGTH_SHORT).show();
        }
        else if(view == findViewById(R.id.orange4))
        {
            Toast.makeText(this, "Right Answer", Toast.LENGTH_SHORT).show();
        }
        else
        {
            Toast.makeText(this, "Wrong Answer", Toast.LENGTH_SHORT).show();
        }


    }

    public void nextbtn(View view) {
        if (view == findViewById(R.id.next1)) {
            Fragmenttwo obj = new Fragmenttwo();
            android.support.v4.app.FragmentManager fm = getSupportFragmentManager();
            android.support.v4.app.FragmentTransaction ft = fm.beginTransaction();
            ft.replace(R.id.activity_main, obj);
            ft.commit();
        } else if (view == findViewById(R.id.next2)) {
            Fragmentthree obj = new Fragmentthree();
            android.support.v4.app.FragmentManager fm = getSupportFragmentManager();
            android.support.v4.app.FragmentTransaction ft = fm.beginTransaction();
            ft.replace(R.id.activity_main, obj);
            ft.commit();
        }
        else if(view == findViewById(R.id.next3))
        {
            Fragmentfour obj = new Fragmentfour();
            android.support.v4.app.FragmentManager fm = getSupportFragmentManager();
            android.support.v4.app.FragmentTransaction ft = fm.beginTransaction();
            ft.replace(R.id.activity_main, obj);
            ft.commit();
        }
    }

    public void backbtn(View view)
    {
        if (view == findViewById(R.id.back2))
        {

            Fragmentone obj=new Fragmentone();
            android.support.v4.app.FragmentManager fm = getSupportFragmentManager();
            android.support.v4.app.FragmentTransaction ft=fm.beginTransaction();
            ft.replace(R.id.activity_main,obj);
            ft.commit();
        }
        else if (view == findViewById(R.id.back3))
        {

            Fragmenttwo obj=new Fragmenttwo();
            android.support.v4.app.FragmentManager fm = getSupportFragmentManager();
            android.support.v4.app.FragmentTransaction ft=fm.beginTransaction();
            ft.replace(R.id.activity_main,obj);
            ft.commit();
        }
        else if(view == findViewById(R.id.back4))
        {
            Fragmentthree obj=new Fragmentthree();
            android.support.v4.app.FragmentManager fm = getSupportFragmentManager();
            android.support.v4.app.FragmentTransaction ft=fm.beginTransaction();
            ft.replace(R.id.activity_main,obj);
            ft.commit();
        }
    }

}
