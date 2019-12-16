package com.siddu.custometoastactivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.siddu.custometoastlibrary.CustomeToasterMessage;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("Custome Toast");
        setSupportActionBar(toolbar);
        CustomeToasterMessage message = new CustomeToasterMessage(MainActivity.this);
        message.ToastMesaage("An Android Toast is a small message displayed on the screen, similar to a tool tip or other similar popup notification.", R.drawable.custometoast);

    }
}
