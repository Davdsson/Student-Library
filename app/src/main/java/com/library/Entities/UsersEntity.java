package com.library.Entities;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName="User_Table")
public class UsersEntity {
    @PrimaryKey(autoGenerate = true)
    @NonNull
     int u_id;
    
    @NonNull
    @ColumnInfo(name="First_Name")        
    String u_firstname;
    @NonNull
    @ColumnInfo(name="Last_Name")        
    String u_lastname;
    @NonNull
    @ColumnInfo(name="Email")        
    String u_email;
    
    @ColumnInfo(name="User_name")        
    String u_username;
    @NonNull
    @ColumnInfo(name="Password")
    String u_password;
    @NonNull
    @ColumnInfo(name="Telephon")        
    String u_phone;

    /*public UsersEntity(String u_email,String u_password) {

        this.u_email = u_email;
        this.u_password = u_password;

    }

     */





    public UsersEntity(String u_firstname, String u_lastname, String u_email, String u_username, String u_password, String u_phone) {
        this.u_firstname = u_firstname;
        this.u_lastname = u_lastname;
        this.u_email = u_email;
        this.u_username = u_username;
        this.u_password = u_password;
        this.u_phone = u_phone;

    }


    public String getU_firstname() {
        return u_firstname;

    }

    public void setU_firstname(String u_firstname) {
        this.u_firstname = u_firstname;
    }

    public int getU_id() {
        return u_id;

    }

    public void setU_id(int u_id) {
        this.u_id = u_id;
    }

    public String getU_lastname() {
        return u_lastname;
    }

    public void setU_lastname(String u_lastname) {
        this.u_lastname = u_lastname;
    }

    public String getU_email() {
        return u_email;
    }

    public void setU_email(String u_email) {
        this.u_email = u_email;
    }

    public String getU_username() {
        return u_username;
    }

    public void setU_username(String u_username) {
        this.u_username = u_username;
    }

    public String getU_phone() {
        return u_phone;
    }

    public void setU_phone(String u_phone) {
        this.u_phone = u_phone;
    }

    public String getU_password() {
        return u_password;
    }

    public void setU_password(String u_password) {
        this.u_password = u_password;
    }

}
