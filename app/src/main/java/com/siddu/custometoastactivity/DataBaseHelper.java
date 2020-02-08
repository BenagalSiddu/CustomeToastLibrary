package com.siddu.custometoastactivity;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DataBaseHelper extends SQLiteOpenHelper {

    public static final String db_name = "student.db";
    public static final String table_name = "student_tbl";
    public static final String col_1 = "ID";
    public static final String col_2 = "NAME";
    public static final String col_3 = "ADDRESS";


    public DataBaseHelper(Context context) {
        super(context, db_name, null, 1);

    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table " + table_name + "( ID INTEGER PRIMARY KEY  AUTOINCREMENT,NAME TEXT,ADDRESS TEXT)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + table_name);
        onCreate(db);
    }

    public boolean insert_data(String name, String add) {
        SQLiteDatabase database = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(col_1, name);
        values.put(col_2, add);
        long res = database.insert(table_name, null, values);

        if (res == -1) {
            return false;
        } else {
            return true;
        }

    }

    public Cursor getAll() {
        SQLiteDatabase database = this.getWritableDatabase();
        Cursor cursor = database.rawQuery("select * from " + table_name, null);
        return cursor;
    }
}
