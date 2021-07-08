package com.jedisebas.bibliawrok;

import androidx.room.Database;
import androidx.room.RoomDatabase;

@Database(entities = {GreenEntity.class}, version = 1, exportSchema = false)
public abstract class GreenDataBase extends RoomDatabase {
    public abstract GreenDao greenDao();
}
