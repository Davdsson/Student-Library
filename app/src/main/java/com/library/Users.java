package com.library;

public class Users {
    String u_firstname;
    String u_lastname;
    String u_email;
    String u_username;
    String u_password;
    String u_phone;
     public Users(){};
    public Users(String u_firstname, String u_lastname, String u_email, String u_username, String u_password, String u_phone) {
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

    public String getU_password() {
        return u_password;
    }

    public void setU_password(String u_password) {
        this.u_password = u_password;
    }

    public String getU_phone() {
        return u_phone;
    }

    public void setU_phone(String u_phone) {
        this.u_phone = u_phone;
    }

    //-------Account Creating Function---------------
    public  boolean Users_is_Creating_Account(String u_firstname, String u_lastname, String u_email, String u_username, String u_password, String u_phone){

        return false; //---Just do not Have Errorrr ---
    }
    //-------Account Deleting Function-----------
    public  boolean Users_is_deleting_Account(String u_email){

        return false; //------------ Just do not Have Errorrr --------------
    }
    //------Account Updating Function---------------
    public  boolean Users_is_Editing_Account(String u_firstname, String u_lastname, String u_email, String u_username, String u_password, String u_phone){

        return false; //------------ Just do not Have Errorrr --------------
    }

    //--Account Login Function-
    public  boolean Users_is_Loging_Account(String u_email, String u_password){

        return false;   //---Just do not Have Errorrr ---
    }

    //---Account Logout Function---
    public  boolean Users_is_Logout_Account(){

        return false; //------------ Just do not Have Errorrr --------------


    }

}
//------------------------END OF CLASS--------------------