package com.example.android.justjava;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {

    int qty = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void submitOrder(View view)
    {
        String priceMessage="Total : $"+ qty *5 +"\n Thank You! ";
        displayMessage(priceMessage);
//        displayPrice(qty*5);
    }

    private void display(int i) {
        TextView text_qty =(TextView)findViewById(R.id.text_qty);
        text_qty.setText("" + i);
    }

//    private void displayPrice(int number) {
//        TextView text_price = (TextView) findViewById(R.id.text_price);
//        text_price.setText(NumberFormat.getCurrencyInstance().format(number));
//    }
    private void displayMessage(String message) {
        TextView text_price = (TextView) findViewById(R.id.text_price);
        text_price.setText(message);
    }

    public void increment(View view)
    {
        qty = qty + 1;
        display(qty);
    }
    public void decrement (View view)
    {
        qty = qty - 1;
        display(qty);
    }
}
