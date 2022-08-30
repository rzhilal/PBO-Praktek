package Soal5;

import java.io.*;
import java.util.*;

public class Stringsxx {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String one=sc.next();
        String two=sc.next();
        
        System.out.println(one.length()+two.length());
        System.out.println( one.compareTo(two)>0 ? "Yes" : "No" );
        one = (one.substring(0,1)).toUpperCase() + one.substring(1);
        two = (two.substring(0,1)).toUpperCase() + two.substring(1);
        System.out.println( one +  " " + two);
        
    }
}