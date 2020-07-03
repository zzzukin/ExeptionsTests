package com;

import java.io.BufferedReader;
import java.io.Reader;
import java.lang.reflect.Array;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import com.mypackage.TstClass;

public class exeption_tst {

    public static void main(String[] args) {

        try{
            BufferedReader Reader = Files.newBufferedReader(Paths.get("in1.txt"));
        }
        catch (Exception e)
        {

            System.out.println("catch block");
            System.out.println(e);

        }
//        catch (ArithmeticException ae)
//        {
//            System.out.println("arithmeticException block");
//            System.out.println(ae);
//        }
        finally
        {
            System.out.println("finally block");
        }

        int Val1 = 10;
        int Val2 = 0;

        try {
            int Val = Val1/Val2;
            System.out.println(Val);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
//          catch (ArithmeticException ae){
//              System.out.println("arithmeticException block");
//              System.out.println(ae);
//          }

        System.out.println("-------------------------------------");

        TstClass MyTstExept = new TstClass();

        List <String> TstStringList = new ArrayList<String>();

        TstStringList.add("First string");
        TstStringList.add(null);
        TstStringList.add("Third string");

        for(String str : TstStringList){
            try {
                MyTstExept.PrintString(str);
            }
            catch (TstClass.MyNullPointerException e){
                System.out.println(e.getMessage());
                System.out.println("catch exeption!!!");
            }
        }
    }
}
