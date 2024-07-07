import java.util.*;
public class Ascii{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        for(int i=0;i<a.length();i++)
        {
            System.out.println(a.codePointAt(i));
        }
    }
    
}
