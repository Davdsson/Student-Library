package com.library.ViewModels;

import android.app.Application;


import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import com.library.Dao.UserDao;
import com.library.Entities.BookEntity;
import com.library.Entities.UsersEntity;
import com.library.Repository.BookRepository;
import com.library.Repository.UserRepository;
import com.library.RoomDB.LibraryRoomDB;

import java.util.List;


public class UsersViewModel  extends AndroidViewModel {
    private String text_mail, text_paswrd;
    private String userEmail;
    private String userPaswrd;
    private LiveData<UsersEntity> userEntity ;
    private UserRepository userRepository;
    private LiveData<List<UsersEntity>> liveDataUsersEntity;

    public UsersViewModel(@NonNull Application application) {
        super(application);

        userRepository =  new UserRepository(application);
       liveDataUsersEntity =  userRepository.getAllUsersEntity();
    }

    public LiveData<List<UsersEntity>> findUserByEmail(String Email){
        return UserRepository.findUserByEmail(Email);
    }

    public LiveData<List<UsersEntity>> findUserByPassword(String password){
        return UserRepository.findUserByPassword(password);
    }

  public  void insertUser(UsersEntity usr){

        userRepository.insertUser(usr);
    }

  public  void deleteUser(UsersEntity usr){

            userRepository.deleteUser(usr);
    }

  public   void UpdateUser(UsersEntity usr){

            userRepository.updateUser(usr);
    }
 public   LiveData<List<UsersEntity>> getLiveDataUsersEntity(){
        return liveDataUsersEntity;

    }

    public UsersEntity CreatUserIndB(UsersEntity newuser){
        return userRepository.insertUser(newuser);

    }

}
