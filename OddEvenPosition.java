package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the array size:");
        int size=scan.nextInt();
        int[] arr=new int[size];
        System.out.println("Enter the values:");
        for (int i=0;i< arr.length;i++){
            arr[i]= scan.nextInt();
        }
        Arrays.sort(arr);
        int[] arr1=new int[size];
        int mid=0;
        if (arr.length%2==0) {
            mid = arr.length / 2;
        }else {
            mid=arr.length/2+1;
        }
        int l=0;
        for (int i=mid-1;i>=0;i--){
            arr1[l]=arr[i];
            l+=2;
        }
        int l1=1;
        for (int j=mid;j<size;j++){
            arr1[l1]=arr[j];
            l1+=2;
        }
        System.out.println(Arrays.toString(arr1));
    }
}
