package com.github.daemontus;

import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.github.daemontus.renderer.ArActivity;


public class MainActivity extends AppCompatActivity {

    String[] objectArray = {"jet", "ship", "myler", "cube", "teapot", "tree"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ArrayAdapter adapter = new ArrayAdapter<String>(this, R.layout.activity_listview,
                R.id.label, objectArray);

        GridView listView = (GridView) findViewById(R.id.mobile_list);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(MainActivity.this, ArActivity.class);
                TextView data = (TextView) view.findViewById(R.id.label);
                intent.putExtra("3DModel", data.getText());
                startActivity(intent);
            }
        });
    }
}
