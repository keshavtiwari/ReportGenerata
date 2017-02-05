package com.example.android.reportgenerata;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class addItemActivity extends AppCompatActivity  {
    EditText tv;
    ArrayList<EditText> t;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_item);
        ArrayList<String> s=new ArrayList<String>();
        s.add("Name");
        s.add("Class");
        s.add("Roll No.");
        t=new ArrayList<>();
        LinearLayout ll = (LinearLayout)findViewById(R.id.activity_add_item);
        for(int i=0;i<s.size();i++){
         tv= new EditText(this);
         tv.setHint(s.get(i));
         tv.setPadding(5,5,5,5);
         tv.setMaxLines(1);
         
         t.add(tv);

        ll.addView(t.get(i));}
    }
}
