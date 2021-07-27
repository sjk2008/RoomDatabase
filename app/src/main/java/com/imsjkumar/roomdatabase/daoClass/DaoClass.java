package com.imsjkumar.roomdatabase.daoClass;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import com.imsjkumar.roomdatabase.entityClass.UserModel;

import java.util.List;

@Dao
public interface DaoClass {
    @Insert
    void insertAllData(UserModel model) ;

    //Select All Data
    @Query("select * from user")
    List<UserModel> getAllData();
}
