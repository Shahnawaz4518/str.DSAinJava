//subString(i,j) and subString(i)
//string str="abcd";
//continuous part of string
//a,ab,abc,abcd,b,bc,bcd,c,cd,d

import java.util.Scanner;
public class substring {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String: ");
         String str=sc.nextLine();
        //String str="abcd";
        for(int i=0;i<=str.length();i++){
            for(int j=i+1;j<=str.length();j++){
                System.out.print(str.substring(i,j)+" ");
            }
        }
    }
}



//Theory
//Interning --> To Save Space
//new--> how to avoid interning

//Immutability of string





