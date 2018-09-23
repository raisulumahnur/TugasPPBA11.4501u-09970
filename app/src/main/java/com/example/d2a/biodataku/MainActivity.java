package com.example.d2a.biodataku;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showmap(View view) {
        Uri uri = Uri.parse("geo:0,0?q=-6.894163, 110.636234");
        Intent it = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(it);
    }
    public void openurl(View view) {
        Uri uri = Uri.parse("http://instagram.com/raisulumahnur");
        Intent it = new Intent(Intent.ACTION_VIEW,uri);
        startActivity(it);
    }
    public void callnumber(View view) {
        Uri uri = Uri.parse("tel:085200441198");
        Intent it = new Intent(Intent.ACTION_DIAL, uri);
        startActivity(it);
    }
}
