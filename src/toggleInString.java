// note : it's very poor performance code also very take more time complexcity

import java.util.Scanner;
public class toggleInString {
    public static void main(String[] args) {
        String str = "phYSiCs";
        System.out.println(str);
        //StringBuilder sb= new StringBuilder(str);
        for (int i = 0; i < str.length(); i++) {
            boolean flag = true; //ture--> capital
            char ch = str.charAt(i); //A
            if (ch == ' ') continue;
            int asci = (int) ch;//65
            if (asci >= 97) flag = false; //small
            if (flag == true) { //capital
                asci += 32;
                char dh = (char) asci; //a
                // raghav ra + G + hav
                str = str.substring(0, i) + dh + str.substring(i + 1);
            } else { //small
                asci -= 32;
                char dh = (char) asci;
                str = str.substring(0, i) + dh + str.substring(i + 1);
            }
        }
        System.out.println(str);
    }
}
