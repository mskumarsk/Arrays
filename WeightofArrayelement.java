package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the array size:");
        int size= scan.nextInt();
        int[] arr=new int[size];
        int[] weight=new int[size];
        System.out.println("Enter the values:");
        for (int i=0;i< arr.length;i++){
            arr[i]= scan.nextInt();
        }
        for (int j=0;j< arr.length;j++){
            int val=0;
            int number=arr[j];
            int n=1;
            int square=0;
            while (number>square){
                square= (int) Math.pow(n++,2);
                if (number==square){
                    val=5;
                    break;
                }
            }
            if (number%4==0&&number%6==0){
                val+=4;
            }
            if ((number&1)==0){
                val+=3;
            }
            weight[j]=val;
        }
        int[] weight1=new int[size];
        System.arraycopy(weight,0,weight1,0,weight.length);
        Arrays.sort(weight1);
        for (int m= weight.length-1;m>=0;m--){
            for (int k=0;k< weight.length;k++) {
                if (weight1[m] == weight[k]){
                    System.out.println(arr[k]+","+weight[k]);
                    weight[k]=0;
                    break;
                }
            }
        }
    }
}
