package com.company;

import java.io.BufferedReader;
import java.io.Console;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

import static com.sun.tools.doclint.Entity.ne;

public class Main {

    InputStreamReader cin = new InputStreamReader(System.in);





    public static void main(String[] args) throws IOException {
	// write your code here


        Scanner in = new Scanner(System.in);

        System.out.print("Enter your Name: \n");
        String username = in.nextLine().toLowerCase();


        for(int i = username.toCharArray().length -1; i > 0; i--) {
            System.out.print(username.toCharArray()[i]);
        }
//        int offset =username.toCharArray().length;
//        for( int i=0; i < username.toCharArray().length; i++) {
//            int pointer = (i + offset) % username.toCharArray().length;
//            System.out.print(username.toCharArray()[pointer]);
//
//        }


        System.out.print("\n" + username.toCharArray().length);

        char[] chars = username.toCharArray();
        Arrays.sort(chars);
        String newWord = new String(chars);

        System.out.print(newWord+ "\n");




    }





}
