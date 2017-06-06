package com.example.afrasali.spinnerassignment;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Spinner dept,year;
    EditText name;
    String[] depts={"IT","MECHANICAL","ECE","EEE"};
    String[] years={"1ST","2ND","3RD","4TH"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name=(EditText)findViewById(R.id.GetName);
        dept=(Spinner)findViewById(R.id.dept);
        year=(Spinner)findViewById(R.id.year);
        SpinnerAdapter s=new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,depts);
        dept.setAdapter(s);
        SpinnerAdapter s1=new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,years);
        year.setAdapter(s1);
    }

    public void SS(View view){

        if (name.getText().toString().isEmpty()){

            Toast.makeText(this, "fill compuslory first", Toast.LENGTH_SHORT).show();
        }
        else{
            Toast.makeText(this, "Registerd Successfully", Toast.LENGTH_SHORT).show();
        }
    }

}
