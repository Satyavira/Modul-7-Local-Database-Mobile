package com.satyavira.modul7localdatabasemobile.database

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import com.satyavira.modul7localdatabasemobile.database.DatabaseContract.HomeworkColumns
import com.satyavira.modul7localdatabasemobile.database.DatabaseContract.HomeworkColumns.Companion.TABLE_NAME

internal class DatabaseHelper(context: Context) : SQLiteOpenHelper(context, DATABASE_NAME, null, DATABASE_VERSION) {
    companion object {
        private const val DATABASE_NAME = "dbhomework"
        private const val DATABASE_VERSION = 1
        private const val SQL_CREATE_TABLE_NOTE = "CREATE TABLE $TABLE_NAME" +
                " (${HomeworkColumns._ID} INTEGER PRIMARY KEY AUTOINCREMENT," +
                " ${HomeworkColumns.TITLE} TEXT NOT NULL," +
                " ${HomeworkColumns.DESCRIPTION} TEXT NOT NULL," +
                " ${HomeworkColumns.DATE} TEXT NOT NULL)"
    }
    override fun onCreate(db: SQLiteDatabase?) {
        db?.execSQL(SQL_CREATE_TABLE_NOTE)
    }

    override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {
        TODO("Not yet implemented")
    }
}