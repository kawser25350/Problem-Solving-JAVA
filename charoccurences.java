import java.util.*;
public class charoccurences {
   

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String a = sc.nextLine().toUpperCase();  
        int[] alph = new int[26];

        for(int i = 0; i < a.length(); i++) {
            char ch = a.charAt(i);
           
                alph[ch - 'A'] += 1;
            }
        

        for(int i = 0; i < 26; i++) 
        {
            char ch = (char) (i + 'A');  
            System.out.println(ch + " which is " + (i + 'A') + " was found " + alph[i] + " times");
        }
        
        sc.close();
    }
}


