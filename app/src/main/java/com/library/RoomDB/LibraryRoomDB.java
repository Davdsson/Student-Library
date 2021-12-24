package com.library.RoomDB;

import android.content.Context;
import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import com.library.Dao.BookDao;
import com.library.Dao.UserDao;
import com.library.Entities.BookEntity;
import com.library.Entities.UsersEntity;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


// Singleton Pattern: sadace bir object olusturabilir
    @Database(entities = {UsersEntity.class, BookEntity.class}, version = 1, exportSchema = false)

    public abstract class LibraryRoomDB extends RoomDatabase {

        // getters
        public abstract BookDao getBookDao();

        public abstract UserDao getUserDao();

        private static LibraryRoomDB INSTANCE;

        public static final ExecutorService databaseWriteExecutor = Executors.newFixedThreadPool(5);

        public static LibraryRoomDB getDatabase(final Context context) {
            if (INSTANCE == null) {
                synchronized (LibraryRoomDB.class) {
                    INSTANCE = Room.databaseBuilder(context.getApplicationContext(),
                            LibraryRoomDB.class, "Library_dB")

                            .build();
                }
            }
            return INSTANCE;
        }
    }





