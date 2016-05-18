package com.example.masa.block02;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView listViewAnimals = (ListView) findViewById(R.id.listView);
        ArrayAdapter<CharSequence> adapterAnimals = ArrayAdapter.createFromResource(this,
                R.array.animalsArray,
                android.R.layout.simple_list_item_1);
        listViewAnimals.setAdapter(adapterAnimals);

    }
}
