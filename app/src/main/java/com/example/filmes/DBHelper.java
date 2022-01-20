package com.example.filmes;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

public class DBHelper extends SQLiteOpenHelper {
    private static final String DATABASE_NAME = "bd_mrfilmes";
    public static final String TABLE_LOGIN = "login";
    private static final int DATABASE_VERSION = 1;

    public static final String TableLogin= "create table login"
            + "(_id integer primary key autoincrement not null,"
            + " nome text not null,"
            + " password text not null)";
    public DBHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }
    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(TableLogin);
        Log.i("bd", "Bd criada com sucesso");
    }
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        //db.execSQL("DROP TABLE IF EXISTS " + TableLogin);
        //onCreate(db);
    }
}
