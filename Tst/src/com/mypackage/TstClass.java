package com.mypackage;



public class TstClass {
    public void Foo(){
        System.out.println("Foo in TstClass!");
    }

    public void PrintString(String s) throws MyNullPointerException {
        if(s == null){
            throw new MyNullPointerException("Exeption by null string!!!");
        }
        else {
            System.out.println("Input string is: " + s);
        }
    }

    public class MyNullPointerException extends Throwable {

        String ExeptionMes;

        MyNullPointerException(String s){
            ExeptionMes = s;
        }

        @Override
        public String getMessage() {
            return ExeptionMes;
        }
    };
}
