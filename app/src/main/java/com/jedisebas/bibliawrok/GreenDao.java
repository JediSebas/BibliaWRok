package com.jedisebas.bibliawrok;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao
public interface GreenDao {
    @Insert
    void insertGreenEntities(GreenEntity... greenEntities);

    @Delete
    void deleteGreenEntities(GreenEntity... greenEntities);

    @Update
    void updateGreenEntities(GreenEntity... greenEntities);

    @Update
    void updateGreenEntity(GreenEntity greenEntity);

    @Query("SELECT * FROM GreenEntity")
    List<GreenEntity> getAll();

    @Query("SELECT isGreen FROM GreenEntity WHERE id=:id")
    String getIsGreen(int id);
}
