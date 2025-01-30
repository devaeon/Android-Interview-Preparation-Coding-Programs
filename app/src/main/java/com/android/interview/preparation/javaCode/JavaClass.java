package com.android.interview.preparation.javaCode;

import androidx.annotation.NonNull;

// Java Class
public class JavaClass {

    private  int number;

    public void setNumber(int number){
        this.number=number;
    }
    public int getNumber() {return number;}

    public  int add(int a, int b) {
        return a + b;
    }

    @NonNull
    @Override
    public String toString() {
        return "This is a JavaClass instance";
    }

}

