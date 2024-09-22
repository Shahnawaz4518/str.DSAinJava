import java.util.Scanner;
public class Performance {
    public static void main(String[] args) {
        String str="";
        for(int i=1;i<=10;i++){
            str=str+i;
        }
        System.out.println(str);
    }
}

//Performanc of String --> poor performance --> Immutability
//
//we do best performance using String Builder