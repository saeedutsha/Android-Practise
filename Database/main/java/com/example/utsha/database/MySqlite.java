package com.example.utsha.database;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import static android.R.attr.id;


public class MySqlite extends SQLiteOpenHelper {

    private static final String DATABASE_NAME = "mydatabase.db";
    private static final String TABLE_NAME = "mytable";
    private static final String COLUMN1 = "SERIAL";
    private static final String COLUMN2 = "TYPE";
    private static final String COLUMN3 = "DATE";
    private static final String COLUMN4 = "AMOUNT";
    private static final String COLUMN5 = "DESCRIPTION";


    public MySqlite(Context context) {
        super(context, DATABASE_NAME, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String quary;
        quary = "CREATE TABLE "+TABLE_NAME+"("+COLUMN1+" INTEGER PRIMARY KEY, "+COLUMN2+" TEXT, "+COLUMN3+" TEXT, "+COLUMN4+" INTEGER, "+COLUMN5+" TEXT "+")";
        db.execSQL(quary);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS "+TABLE_NAME);
        onCreate(db);
    }

    public void addToTable(String serial, String type, String date, String amount, String description){
        SQLiteDatabase sqLiteDatabase = getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(COLUMN1,serial);
        contentValues.put(COLUMN2,type);
        contentValues.put(COLUMN3,date);
        contentValues.put(COLUMN4,amount);
        contentValues.put(COLUMN5,description);
        sqLiteDatabase.insert(TABLE_NAME,null,contentValues);
    }

    public Cursor display() {
        SQLiteDatabase sqLiteDatabase = getReadableDatabase();
        Cursor res = sqLiteDatabase.rawQuery("SELECT * FROM "+TABLE_NAME, null);
        return res;
    }

    public boolean updateOfData(String id, String email, String fname, String lname){
        SQLiteDatabase sqLiteDatabase = getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(COLUMN1,id);
        contentValues.put(COLUMN2,email);
        contentValues.put(COLUMN3,fname);
        contentValues.put(COLUMN4,lname);
        sqLiteDatabase.update(TABLE_NAME,contentValues," ID = ? ",new String[] {id});
        return true;
    }

    public int deleteAnyData(String id){
        SQLiteDatabase sqLiteDatabase = getWritableDatabase();
        return sqLiteDatabase.delete(TABLE_NAME," ID = ? ",new String[] {id});
    }

    public void deleteAllData(){
        SQLiteDatabase sqLiteDatabase = getWritableDatabase();
        sqLiteDatabase.delete(TABLE_NAME,null,null);
    }


}
