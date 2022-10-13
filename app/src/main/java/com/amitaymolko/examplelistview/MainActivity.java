package com.amitaymolko.examplelistview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    CustomAdapter listAdapter;
    ArrayList<MyItem> items = new ArrayList<MyItem>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        listView = (ListView) findViewById(R.id.listview);

        items.add(new MyItem(R.drawable.alligator_48, "alligator", "alligators are long"));
        items.add(new MyItem(R.drawable.ant_48, "ant", "ants are small"));
        items.add(new MyItem(R.drawable.bear_48, "bear", "bears like to party"));
        items.add(new MyItem(R.drawable.chicken_48, "chicken", "kukuriku!"));
        items.add(new MyItem(R.drawable.cow_48, "cow", "cow are fat"));
        items.add(new MyItem(R.drawable.crab_48, "crab", "autch!!"));
        items.add(new MyItem(R.drawable.wolf_48, "wolf", "night animal"));
        items.add(new MyItem(R.drawable.wasp_48, "wasp", "what is that?"));
        items.add(new MyItem(R.drawable.giraffe_48, "giraffe", "giraffe touchs the sky"));
        items.add(new MyItem(R.drawable.gorilla_48, "gorilla", "hoom hoom hoom"));
        items.add(new MyItem(R.drawable.duck_48, "duck", "little and cute"));
        items.add(new MyItem(R.drawable.bumblebee_48, "bumblebee", "dangerous"));

        listAdapter = new CustomAdapter(this, items);
        listView.setAdapter(listAdapter);
    }
}
