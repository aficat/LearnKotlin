package sg.edu.nus.learnkotlin

import android.content.ContentValues
import android.content.Context
import android.database.Cursor
import android.database.SQLException
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteException
import android.database.sqlite.SQLiteOpenHelper

class DBHelper (context: Context) : SQLiteOpenHelper(context,
    DATABASE_NAME, null, DATABASE_VERSION) {

    companion object {
        val DATABASE_VERSION = 1
        val DATABASE_NAME = "User.db"

        private val SQL_CREATE_ENTRIES =
            "CREATE TABLE " + TableInfo.TABLE_NAME + " (" +
                    TableInfo.COLUMN_USERNAME + " TEXT PRIMARY KEY," +
                    TableInfo.COLUMN_PASSWORD + " TEXT," +
                    TableInfo.COLUMN_NAME + " TEXT)"

        private val SQL_DELETE_ENTRIES = "DROP TABLE IF EXISTS " +
                TableInfo.TABLE_NAME
    }

    override fun onCreate(db: SQLiteDatabase?) {
        db?.execSQL(SQL_CREATE_ENTRIES)
    }

    override fun onUpgrade(db: SQLiteDatabase?,
                           oldVersion: Int, newVersion: Int) {
        db?.execSQL(SQL_DELETE_ENTRIES)
        onCreate(db)
    }

    override fun onDowngrade(db: SQLiteDatabase?,
                             oldVersion: Int, newVersion: Int) {
        onUpgrade(db, oldVersion, newVersion)
    }

    fun addUser(user: DataRecord): Boolean {
        val db = writableDatabase
        val values = ContentValues()

        values.put(TableInfo.COLUMN_USERNAME, user.username)
        values.put(TableInfo.COLUMN_PASSWORD, user.password)
        values.put(TableInfo.COLUMN_NAME, user.name)

        val newRowId = db.insert(TableInfo.TABLE_NAME,
            null, values)
        return true
    }

    fun deleteUser(username: String):Boolean {
        val db = writableDatabase
        val selection = TableInfo.COLUMN_USERNAME + " LIKE ?"
        val selectionArgs = arrayOf(username)

        db.delete(TableInfo.TABLE_NAME, selection, selectionArgs)

        return true
    }

    fun readUser(username: String): ArrayList<DataRecord> {
        val user = ArrayList<DataRecord>()
        val db = writableDatabase
        var cursor: Cursor? = null

        try {
            cursor = db.rawQuery("select * from " +
                    TableInfo.TABLE_NAME + " WHERE " +
                    TableInfo.COLUMN_USERNAME + "=" + username + "", null)
        } catch (e: SQLException) {
            db.execSQL(SQL_CREATE_ENTRIES)
            return ArrayList()
        }
        var name: String
        var password: String

        if (cursor!!.moveToFirst()) {
            while (cursor.isAfterLast == false) {
                password = cursor.getString(cursor.getColumnIndex(TableInfo.COLUMN_PASSWORD))
                name = cursor.getString(cursor.getColumnIndex(TableInfo.COLUMN_NAME))
                user.add(DataRecord(username, password, name))
                cursor.moveToNext()
            }
        }
        return user
    }

    fun readAllUsers(): ArrayList<DataRecord> {
        val user = ArrayList<DataRecord>()
        val db = writableDatabase
        var cursor: Cursor? = null
        try {
            cursor = db.rawQuery("select * from "+ TableInfo.TABLE_NAME, null)

        } catch (e: SQLiteException) {
            db.execSQL(SQL_CREATE_ENTRIES)
            return ArrayList()
        }

        var username: String
        var password: String
        var name: String
        if (cursor!!.moveToFirst()) {
            while (cursor.isAfterLast == false) {
                username= cursor.getString(cursor.getColumnIndex(TableInfo.COLUMN_USERNAME))
                password = cursor.getString(cursor.getColumnIndex(TableInfo.COLUMN_PASSWORD))
                name = cursor.getString(cursor.getColumnIndex(TableInfo.COLUMN_NAME))
                user.add(DataRecord(username, password, name))
                cursor.moveToNext()
            }
        }
        return user
    }
}