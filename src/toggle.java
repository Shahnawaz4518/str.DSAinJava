import java.util.Scanner;
public class toggle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");
        StringBuilder str= new StringBuilder(sc.nextLine());
        System.out.println(str);
        // toggle
        // PHysiCs --> phYSIcS
        for(int i=0;i<str.length();i++){
            //P-->p
            //check -> alphabet- small, capital
            boolean flag=true; //ture--> capital
            char ch = str.charAt(i); //A
            if(ch==' ') continue;
            int asci = (int)ch;//65
            if(asci>=97) flag= false; //small
            if(flag==true) { //capital
                asci += 32;
                char dh = (char) asci; //a
                str.setCharAt(i, dh);
            }
            else{ //small
                asci-=32;
                char dh=(char)asci;
                str.setCharAt(i,dh);
            }
        }
        System.out.println(str);
    }
}
