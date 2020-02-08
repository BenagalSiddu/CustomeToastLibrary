package com.siddu.custometoastactivity;

import android.database.Cursor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Sqlite_Database extends AppCompatActivity {
    Button btn_save, btn_get;
    DataBaseHelper baseHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sqlite__database);
        btn_get = findViewById(R.id.btn_get);
        btn_save = findViewById(R.id.btn_save);
        baseHelper = new DataBaseHelper(this);
        btn_save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean isInserted = baseHelper.insert_data("SIDDU", "BNGLR");

                if (isInserted == true)
                    Toast.makeText(Sqlite_Database.this, "Data Inserted", Toast.LENGTH_LONG).show();
                else
                    Toast.makeText(Sqlite_Database.this, "Data not Inserted", Toast.LENGTH_LONG).show();

            }
        });
        btn_get.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Cursor res = baseHelper.getAll();
                while (res.moveToNext()) {
                    Log.d("DATA", res.getString(0) + "  " + res.getString(1));
                }
            }
        });

    }
}
