package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the first array size:");
        int size1=scan.nextInt();
        int[][] arr1=new int[size1][size1];
        System.out.println("Enter the values:");
        for (int i=0;i< arr1.length;i++){
            for (int j=0;j< arr1.length;j++){
                arr1[i][j]= scan.nextInt();
            }
        }
        int[][] arr2=new int[2][3];
        System.out.println("Enter the values:");
        for (int i=0;i< arr2.length;i++){
            for (int j=0;j< arr2[0].length;j++){
                arr2[i][j]= scan.nextInt();
            }
        }
        int[][] arr3=new int[2][3];
        for (int i=0;i< arr1.length;i++){
            for (int j=0;j< arr2[0].length;j++){
                for (int k=0;k< arr1.length;k++){
                    arr3[i][j]+=arr1[i][k]*arr2[k][j];
                }
                System.out.print(arr3[i][j]+" ");
            }
            System.out.println();
        }
    }
}
