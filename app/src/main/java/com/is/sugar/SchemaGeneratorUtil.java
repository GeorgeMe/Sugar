package com.is.sugar;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import com.orm.SchemaGenerator;

/**
 * Created by George on 2016/5/19.
 */
public class SchemaGeneratorUtil extends SchemaGenerator {

    public SchemaGeneratorUtil(Context context) {
        super(context);
    }

    @Override
    public void createDatabase(SQLiteDatabase sqLiteDatabase) {
        super.createDatabase(sqLiteDatabase);
    }

    @Override
    public void doUpgrade(SQLiteDatabase sqLiteDatabase, int oldVersion, int newVersion) {
        super.doUpgrade(sqLiteDatabase, oldVersion, newVersion);
    }

    @Override
    public void deleteTables(SQLiteDatabase sqLiteDatabase) {
        super.deleteTables(sqLiteDatabase);
    }

    @Override
    protected String createTableSQL(Class<?> table) {
        return super.createTableSQL(table);
    }
}
