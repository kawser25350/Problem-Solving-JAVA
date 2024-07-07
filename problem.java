import java.util.*;

public class Problem {


    public static void main(String[] args)
     {
        Scanner sc= new Scanner(System.in);

       String s=sc.nextLine();

       int ans=0,len=s.length();
       char x=' ';
           
       for(int i=0;i<len;i++)
       {
        int cnt=1;
        for(int j=i+1;j<len;j++)
        {
           
            if(s.charAt(i)==s.charAt(j))
            {
                cnt++;

            }
        }
        if(cnt>ans)
        {
            ans=cnt;
            x=s.charAt(i);

        }
       }

System.out.println("The first most occurs letter is "+x+" -"+ans);
        
    }
}

