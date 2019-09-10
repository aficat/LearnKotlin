package sg.edu.nus.learnkotlin

import android.provider.BaseColumns

class TableInfo : BaseColumns {

    companion object {
        val TABLE_NAME = "users"
        val COLUMN_USERNAME = "username"
        val COLUMN_PASSWORD = "password"
        val COLUMN_NAME = "name"
    }
}