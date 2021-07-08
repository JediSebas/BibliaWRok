package com.jedisebas.bibliawrok;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class GreenEntity {
    @PrimaryKey(autoGenerate = true)
    public int id;

    public String isGreen;
}
