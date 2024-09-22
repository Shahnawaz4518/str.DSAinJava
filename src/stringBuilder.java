// theory:
// string -> interning -> immutability -> poor performance
//StringBuilder();  stringBuilder(string str);  stringBuilder(int capacity);


// and we use most 2nd one ---> stringBuilder(string str);



import java.util.*;
public class stringBuilder {
    public static void main(String[] args) {
       StringBuilder str=new StringBuilder("hello");
       //str.append("world");
        System.out.println(str);
        //hello-->mello
        str.setCharAt(0,'m');
        System.out.println(str);
        str.append(10);
        System.out.println(str);



        // insert(idx,ch) and deleteCharAt(idx,ch)

        str.insert(2,'y');
        System.out.println(str);

        str.deleteCharAt(0);
        System.out.println(str);

        //reverse() and delete(i,j)

        StringBuilder sb = new StringBuilder("physics");
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
        //physics
        sb.delete(2,4);  // 2 to 3 delete
        System.out.println(sb);
        System.out.println(sb.substring(3));



    }
}
