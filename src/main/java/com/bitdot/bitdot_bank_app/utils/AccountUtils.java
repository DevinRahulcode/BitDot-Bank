package com.bitdot.bitdot_bank_app.utils;

import java.time.Year;
import java.lang.Math;


public class AccountUtils {

    public static final String ACCOUNT_EXISTS_CODE ="001";
    public static final String ACCOUNT_EXISTS_MESSAGE = "A User with This Email exists";
    public static final String ACCOUNT_CREATION_SUCCESS = "002";
    public static final String ACCOUNT_CREATION_MESSAGE = "Account has been successfully created!..";
    public static final String ACCOUNT_NOT_EXISTS = "003";
    public static final String ACCOUNT_NOT_EXISTS_MESSAGE="User provided is not in our database.";
    public static final String ACCOUNT_FOUND_CODE = "004";
    public static final String ACCOUNT_FOUND_SUCCESS = "Account found";

    public static String generateAccountNumber(){

        Year currentYear = Year.now();
        int min = 100000;
        int max = 999999;

        int randomNubmer = (int) Math.floor(Math.random() * (max - min + 1)+ min);

        String year = String.valueOf(currentYear);
        String rn = String.valueOf(randomNubmer);
        StringBuilder accountNumber = new StringBuilder();

       return accountNumber.append(year).append(rn).toString();
    }
}
