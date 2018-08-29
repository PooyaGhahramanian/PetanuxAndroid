package com.ghahramanian.petanuxandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class NewsFeedActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news_feed);

        String[] arraySpinnerCategory = new String[] {
                "Fruits", "Car", "Book", "Clothing", "Tools"
        };
        Spinner sCategory = (Spinner) findViewById(R.id.spinnerCategory);
        ArrayAdapter<String> adapterCategory = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, arraySpinnerCategory);
        adapterCategory.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        sCategory.setAdapter(adapterCategory);

        String[] arraySpinner = new String[] {
                "Cost", "Distance", "Discount"
        };
        Spinner sSort = (Spinner) findViewById(R.id.spinnerSort);
        ArrayAdapter<String> adapterSort = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, arraySpinner);
        adapterSort.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        sSort.setAdapter(adapterSort);
    }
}
