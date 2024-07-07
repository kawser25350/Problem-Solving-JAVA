
import java.util.*;
public class Array
{
    public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
       int[] a= new int[5];
        for(int i=0;i<a.length;i++)
        {
            a[i]=sc.nextInt();
        }

        for(int i=0;i<a.length;i++)
        {
           System.out.print(a[i]+""+(i<a.length-1?",":" "));
           
        }
       
     

       //2 number
       int[][] arr=new int[4][2];

       for(int i=0;i<arr.length;i++)
       {
        for(int j=0;j<arr[i].length;j++)
        {
            arr[i][j]=sc.nextInt();
        }
       }

       for(int i=0;i<arr.length;i++)
       {
        for(int j=0;j<arr[i].length;j++)
        {
            System.out.print(arr[i][j]+" ");
        }
        System.out.print("\n");

       }
    


sc.close();


    }
}