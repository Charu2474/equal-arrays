import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner h=new Scanner(System.in);
        int n=h.nextInt();
        int a[]=new int[n];
        int b[]=new int[n];
        int i,c=0;
        for(i=0;i<n;i++)
        {
            a[i]=h.nextInt();
        }
        for(i=0;i<n;i++)
        {
            b[i]=h.nextInt();
        }
        for(i=0;i<n;i++){
            if(a[i]==b[i])
            {
                c++;
            }
        }
        if(c==0)
        {
            System.out.println("No Match Found!");
        }
        else
        {
            System.out.println("Match Found!");
        }
    }
}
