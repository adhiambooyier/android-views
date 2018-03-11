package com.example.user.crashcourse;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;


public class ListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        String countryList[] = {"India", "China", "australia", "Portugle", "America", "NewZealand"};
        View simpleList = findViewById(R.id.simpleListView);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(ListActivity.this, R.layout.activity_list_view, R.id.textView, countryList);
        simpleList.setAdapter(arrayAdapter);
    }
}

