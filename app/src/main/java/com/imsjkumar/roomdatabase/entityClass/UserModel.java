package com.imsjkumar.roomdatabase.entityClass;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import org.jetbrains.annotations.NotNull;

@Entity(tableName = "user")
public class UserModel {

    //Primary Key
    @PrimaryKey(autoGenerate = true)
    @NotNull
    private int key;

    @ColumnInfo(name = "name")
    private String name;


@ColumnInfo(name = "phone number")
    private String phoneno;


@ColumnInfo(name = "address")
    private String address;

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneno() {
        return phoneno;
    }

    public void setPhoneno(String phoneno) {
        this.phoneno = phoneno;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
