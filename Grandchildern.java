package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String[][] list={{"luke","shaw"},
                {"wayne","rooney"},
                {"rooney","ronaldo"},
                {"shaw","rooney"}};
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the father name:");
        String name=scan.nextLine();
        int n=0;
        for (int i=0;i<list.length;i++){
            if (name.equals(list[i][1])){
                n=i;
                break;
            }
        }
        String chileName=list[n][0];
        int cnt=0;
        for (int i=0;i<list.length;i++){
            if (chileName.equals(list[i][1])){
                cnt++;
            }
        }
        System.out.println(name+" has "+cnt+" grandchildren.");
    }
}
