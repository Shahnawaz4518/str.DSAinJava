import java.util.Scanner;

public class chcekPalindromOrNot {
    public static void main(String[] args) {
        // String input can be modified to user input if needed
        StringBuilder str = new StringBuilder("aba");
        String originalStr = str.toString();  // Store the original string
        String reversedStr = str.reverse().toString();  // Reverse the string

        // Compare the original string with the reversed string
        if(originalStr.equals(reversedStr)) {
            System.out.println("The Given String is a Palindrome");
        } else {
            System.out.println("The Given String is Not a Palindrome");
        }
    }
}


// This more optimization way and code
//String str="abcd";
//int i=0;
//int j=str.length()-1;
//
//boolean flag=true; //true-->palindrome
//        while(i<j){
//        if(str.charAt(i)!=str.charAt(j)){
//flag=false;
//        break;
//        }
//i++;
//j--;
//        }
//        if(flag==true) System.out.println("Palindrome");
//        else System.out.println("Not Palindrome");