package com.example.kontak;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listview = findViewById(R.id.listview);

        List<String> list = new ArrayList<>();
        list.add("Brian");
        list.add("Habibi");
        list.add("Genta");
        list.add("Hilal");
        list.add("Rapli");



        ArrayAdapter arrayAdapter = new ArrayAdapter(getApplicationContext(), android.R.layout.simple_list_item_1,list);
        listview.setAdapter(arrayAdapter);

        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position==0){

                    startActivity(new Intent(MainActivity.this,Brian.class));

                }else if(position==1){

                    startActivity(new Intent(MainActivity.this,Habibi.class));

                }else if(position==2){

                    startActivity(new Intent(MainActivity.this,Genta.class));

                }else if(position==3){

                    startActivity(new Intent(MainActivity.this, Hilal.class));

                }else if(position==4){

                    startActivity(new Intent(MainActivity.this,Rapli.class));

                }else{

                }



            }
        });
    }
}