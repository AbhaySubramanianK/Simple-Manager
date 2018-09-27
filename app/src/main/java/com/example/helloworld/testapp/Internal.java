package com.example.helloworld.testapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class Internal extends AppCompatActivity implements AdapterView.OnItemClickListener {

    private DatabaseHandler databaseHandler=new DatabaseHandler(this,1);

        private List<String> names = new ArrayList<>();//Array List to store names
        private ListView name_list; //Layout Resource to display the above ArrayLists

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.internal); //Set layout Student_details

            name_list = (ListView) findViewById(R.id.NameList);
            names.addAll(databaseHandler.getAllNamesAndPercentage());
            ArrayAdapter<String> list = new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item, names);
            name_list.setAdapter(list);
            name_list.setOnItemClickListener(this);
        }


        @Override
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long l)
        {
            Intent intent=new Intent(this,AttendanceDetails.class);
            Bundle b=new Bundle();
            String a= names.get(i);
            Log.d("Value of a",""+a);
            b.putString("id",a.substring(0,3));
            intent.putExtras(b);
            startActivity(intent);

        }

        @Override
        public void onBackPressed() {
            Intent i=new Intent(this,Test.class);
            finish();
            startActivity(i);
        }
    }


