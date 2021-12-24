package com.library.ViewModels;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import com.library.Entities.BookEntity;
import com.library.Repository.BookRepository;

import java.util.List;

public class BookViewModel extends AndroidViewModel {
    private BookRepository bookRepository;
    private LiveData<List<BookEntity>> liveDataBookEntity;


    public BookViewModel(@NonNull Application application) {
        super(application);

        bookRepository =  new BookRepository(application);
        liveDataBookEntity = bookRepository.getLiveDataBookEntity();

    }

    LiveData<List<BookEntity>> getLiveDataBookEntity(){
        return liveDataBookEntity;

    }
    LiveData<List<BookEntity>> FindBookEntityByname(String name){
        return bookRepository.findBookEntityByname(name);
    }

    void InsertBookEntity(BookEntity bk){
        bookRepository.insertBookEntity(bk);
    }

    void DeleteBookEntity(BookEntity bk){
        bookRepository.deleteBookEntity(bk);
    }

    void UpdateBookEntity(BookEntity bk){

        bookRepository.updateBookEntity(bk);
    }
}
