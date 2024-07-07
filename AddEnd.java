import java.util.Scanner;
public class AddEnd {
    


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String a = sc.nextLine().toUpperCase();
        String b = "";
        String c = "==THE END==";
        
        b += a + c;
        System.out.println(a);
        System.out.println(b);
        System.out.println(a);
        
        sc.close();
    }


    
}
