package com.example.filmes;

import android.annotation.SuppressLint;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.widget.EditText;

import java.util.ArrayList;
import java.util.List;

public class LoginDAO {
    private SQLiteDatabase db;
    private DBHelper DBHelper;
    private ArrayList<Login> logins;
    private Login login1;

    public LoginDAO(Context context) {
        DBHelper = new DBHelper(context);
        db = DBHelper.getWritableDatabase();
    }

    public void criarUser(String nome, String password) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("nome", nome);
        contentValues.put("password", password);
        db.insert("login", null, contentValues);
    }

    public Boolean checkutilizador(String nome){
        Cursor c = db.rawQuery("SELECT * FROM login WHERE nome = '" + nome + "'", null);
        if(c.getCount() > 0){
            return true;
        }
        else
        {
            return false;
        }
    }

    public  Boolean checkutilizadorPass(String nome, String password)
    {
        Cursor c = db.rawQuery("SELECT * FROM login WHERE nome = '" + nome + " and password ='" + password + "''", null);
        if(c.getCount() > 0){
            return true;
        }
        else
        {
            return false;
        }
    }

    public void alterapassword(String password,Login login){
        ContentValues contentValues=new ContentValues();
        contentValues.put("password",password);
        db.update("login",contentValues,"nome = ?",new String[]{login.getNome().toString()});
    }
    public void alteranome(String nome,Login login){
        ContentValues contentValues=new ContentValues();
        contentValues.put("nome",nome);
        db.update("login",contentValues,"nome = ?",new String[]{login1.getNome().toString()});
    }
    public void eliminauser(int id){

        db.delete("login","_id=" + id,null);
    }


    public ArrayList<Login> getLogins() {
        String strSql = "select * from login";
        logins = new ArrayList<Login>();
        SQLiteDatabase db = DBHelper.getReadableDatabase();
        Cursor c = db.rawQuery(strSql, null);
        if (c.moveToFirst()) {
            do {
                Login login = new Login();
                login.setId(c.getInt(c.getColumnIndexOrThrow("_id")));
                login.setNome(c.getString(c.getColumnIndexOrThrow("nome")));
                login.setPassword(c.getString(c.getColumnIndexOrThrow("password")));
                logins.add(login);
            } while (c.moveToNext());
        }
        c.close();
        return logins;
    }

    public Login getLoginPeloNome(String nome) {
        String strSql = "select * from login where nome="+nome;
        logins = new ArrayList<Login>();
        SQLiteDatabase db = DBHelper.getReadableDatabase();
        Cursor c = db.rawQuery(strSql, null);
        Login login = new Login();;
        if (c.moveToFirst()) {
            do {
                login.setId(c.getInt(c.getColumnIndexOrThrow("_id")));
                login.setNome(c.getString(c.getColumnIndexOrThrow("nome")));
                login.setPassword(c.getString(c.getColumnIndexOrThrow("password")));

            } while (c.moveToNext());
        }
        c.close();
        return login;
    }

    public boolean verificacaologin(String nome, String pass) {

        boolean certo=false;

        String strSql = "select * from login where nome= '"+nome+"' and password= '"+pass + "'";
        db = DBHelper.getReadableDatabase();
        Cursor c = db.rawQuery(strSql, null);
        if (c.moveToFirst()) {
            do {
                certo = true;

            } while (c.moveToNext());
        }
        c.close();

        return certo;


    }
}
