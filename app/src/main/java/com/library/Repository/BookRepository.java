package com.library.Repository;

import android.app.Application;

import androidx.lifecycle.LiveData;

import com.library.Dao.BookDao;
import com.library.Dao.UserDao;
import com.library.Entities.BookEntity;
import com.library.Entities.UsersEntity;
import com.library.RoomDB.LibraryRoomDB;

import java.util.List;

public class BookRepository {

    private BookDao bookDao;
    private LiveData<List<BookEntity>> liveDataBookEntity;

    public BookRepository(Application application)
    {
        LibraryRoomDB db =  LibraryRoomDB.getDatabase(application.getApplicationContext());
        bookDao = db.getBookDao();
        liveDataBookEntity =  bookDao.getAllBookEntity();
    }

    public LiveData<List<BookEntity>> getLiveDataBookEntity(){
        return liveDataBookEntity;

    }
 public   LiveData<List<BookEntity>> findBookEntityByname(String name){
        return bookDao.findBookEntity(name);
    }

    public void insertBookEntity(BookEntity bk){

        LibraryRoomDB.databaseWriteExecutor.execute(()->{

            bookDao.insertBookEntity(bk);
        });
    }

    public void deleteBookEntity(BookEntity bk){
        LibraryRoomDB.databaseWriteExecutor.execute(()->{

            bookDao.deleteBookEntity(bk);
        });
    }

    public void updateBookEntity(BookEntity bk){
        LibraryRoomDB.databaseWriteExecutor.execute(()->{

            bookDao.updateBookEntity(bk);
        });
    }
}
