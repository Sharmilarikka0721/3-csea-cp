import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Merging {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int[] n1=new int[m];
        for(int i=0;i<m;i++){
            n1[i]=sc.nextInt();
        }
        int n=sc.nextInt();
        int[] n2=new int[n];
        for(int i=0;i<n;i++){
            n2[i]=sc.nextInt();
        }
        int a=0,b=0,k=0;
        int[] ans=new int[m+n];
        while(a<m && b<n){
            if(n1[a]<=n2[b]){
                ans[k++]=n1[a];
                a++;
            }
            else{
                ans[k++]=n2[b];
                b++;
            }
        }
        while(a<m){
            ans[k++]=n1[a];
            a++;
        }
        while(b<n){
            ans[k++]=n2[b];
            b++;
        }
        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }
    }
}
