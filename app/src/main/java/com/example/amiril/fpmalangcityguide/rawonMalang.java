package com.example.amiril.fpmalangcityguide;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

public class rawonMalang extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rawon_malang);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

    }

    public void showMapRawon(View v){
        String geoLocationRawon = "-7.982557, 112.633872";
        Intent showLocRawonIntent = new Intent(Intent.ACTION_VIEW);
        showLocRawonIntent.setData(Uri.parse("geo:" + geoLocationRawon));
        if (showLocRawonIntent.resolveActivity(getPackageManager()) != null) {
            startActivity(showLocRawonIntent);
        }
    }

    public void callRawon(View v){
        TextView tv = (TextView) findViewById(R.id.nmr_telp_rawon);
        String phoneNumber = tv.getText().toString();
        Intent callRawonIntent = new Intent(Intent.ACTION_DIAL);
        callRawonIntent.setData(Uri.parse("tel:" + phoneNumber));
        if (callRawonIntent.resolveActivity(getPackageManager()) != null) {
            startActivity(callRawonIntent);
        }

    }

}
