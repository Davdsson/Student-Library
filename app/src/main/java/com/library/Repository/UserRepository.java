package com.library.Repository;

import android.app.Application;

import androidx.lifecycle.LiveData;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

//import com.example.bim_1_1.DAO.StudentDao;
//import com.example.bim_1_1.Entities.Student;
//import com.example.bim_1_1.RoomDB.StudentRoomDB;
import com.library.Dao.UserDao;
import com.library.Entities.UsersEntity;
import com.library.RoomDB.LibraryRoomDB;

import java.util.List;

public class UserRepository {


    private static UserDao userdao;
        private LiveData<List<UsersEntity>> liveDataUsersEntity;

        public UserRepository(Application application)
        {
            LibraryRoomDB db =  LibraryRoomDB.getDatabase(application.getApplicationContext());
            userdao = db.getUserDao();
            liveDataUsersEntity =  userdao.getAllUsers();
        }

    public LiveData<List<UsersEntity>> getAllUsersEntity(){
      return liveDataUsersEntity;

    }
    public static LiveData<List<UsersEntity>> findUserByEmail(String Email){
            return userdao.findUserByEmail(Email);
    }

    public static LiveData<List<UsersEntity>> findUserByPassword(String password){
        return userdao.findUserByEmail(password);
    }

    public UsersEntity insertUser(UsersEntity newuserEntity){



        LibraryRoomDB.databaseWriteExecutor.execute(()->{

                userdao.insertUser(newuserEntity);



            });
        return newuserEntity;

        }

    public void deleteUser(UsersEntity usr){
        LibraryRoomDB.databaseWriteExecutor.execute(()->{

            userdao.deleteUser(usr);
        });
        }

    public void updateUser(UsersEntity usr){
        LibraryRoomDB.databaseWriteExecutor.execute(()->{

            userdao.updateUser(usr);
        });
        }
}
