package com.library.Dao;
import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.library.Entities.UsersEntity;

import java.util.List;
@Dao
public interface UserDao {
    @Insert
     void insertUser(UsersEntity usr); //Add 1 seul object etudiant


    //Add une list dobject etudian
    //@Insert
   // void insertUser(UsersEntity...usersentity);

    @Delete
    void deleteUser(UsersEntity usr);  // Delete 1 seul object

    //delete plusieurs object en mem temp
    @Delete
    void deleteUser(UsersEntity...usr);

    @Update
    void updateUser(UsersEntity usr);

    @Query("SELECT *FROM USER_TABLE ")
   LiveData<List<UsersEntity>> getAllUsers();

    @Query("SELECT *FROM User_Table where Email LIKE:mail")
    LiveData<List<UsersEntity>> findUserByEmail(String mail);

  //  @Query("SELECT *FROM User_Table where Email LIKE:password")
   // LiveData<List<UsersEntity>> findUserByPassword(String password);
}
