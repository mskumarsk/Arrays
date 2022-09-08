package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the name:");
        String name= scan.nextLine();
        int mid=name.length()/2+1;
        for (int i=0;i<name.length();i++){
            for (int j=0;j<name.length();j++){
                if (i==j){
                    System.out.print(name.charAt(j));
                }
                else if (i+j==name.length()-1){
                    if (i+1>mid) {
                        System.out.print(name.charAt(j));
                    }else {
                        System.out.print(name.charAt(j));
                    }
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
