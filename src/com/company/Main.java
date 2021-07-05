package com.company;

import java.util.Scanner;

public class Main {



    public static  int realValue(char ch){
        if(ch == 'I')
            return 1;
        else if (ch == 'V' || ch == 'v')
            return 5;
        else if (ch=='X' || ch == 'x')
            return 10;
        else if (ch=='C' ||  ch == 'c')
            return 100;
        else if (ch=='L' || ch == 'l')
            return 50;
        else if (ch=='D' )
            return 500;
        else if(ch=='M' || ch == 'm')
            return 1000;
        return -1;
    }

    public static void conversion(String s){
        int finalNo=0;
        for (int i=0;i<s.length();i++){
            int num1= realValue(s.charAt(i));
            if(i+1 < s.length()){
                int num2= realValue(s.charAt(i+1));
                if(num1 >= num2){
                    finalNo= finalNo +num1;

                }else {
                    //  finalNo = finalNo+ num1;
                    finalNo = finalNo + num2 - num1;
                    i++;
                }
            }else {
             //   finalNo = finalNo + num2 -num1;
                finalNo = finalNo + num1;
            }

        }
       // return finalNo;
        System.out.println(finalNo);
    }
    public static void main(String[] args) {
        System.out.println("Enter Roman Number ::  ");
        Scanner sc= new Scanner(System.in);
        String s = sc.next();
        conversion(s);

    }
}
