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
    Button btn_tost;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("Custome Toast");
        setSupportActionBar(toolbar);
        btn_tost = findViewById(R.id.btn_tost);
        btn_tost.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               /* LayoutInflater inflater = getLayoutInflater();
                View view = inflater.inflate(R.layout.custome_toast_layout, (ViewGroup) findViewById(R.id.main_ll));
                TextView txt_toast = view.findViewById(R.id.txt_toast);
                ImageView img_toast = view.findViewById(R.id.img_toast);
                txt_toast.setText("An Android Toast is a small message displayed on the screen, similar to a tool tip or other similar popup notification.");
                img_toast.setImageResource(R.drawable.custometoast);
                Toast toast = new Toast(MainActivity.this);
                toast.setDuration(Toast.LENGTH_LONG);
                toast.setView(view);
                toast.show();*/
                CustomeToasterMessage message = new CustomeToasterMessage(MainActivity.this);
                message.ToastMesaage("An Android Toast is a small message displayed on the screen, similar to a tool tip or other similar popup notification.", R.drawable.custometoast);
            }
        });
    }
}
