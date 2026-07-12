import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Max_Subarr {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc =new Scanner(System.in);
        int size=sc.nextInt();
        int[] arr=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        int ans=subarr(arr,size);
        System.out.println(ans);
    }
    
    public static int subarr(int[] arr,int size){
       int max_sofar=arr[0];
        int max_end=0;
        for(int i=0;i<size;i++){
            max_end=max_end+arr[i];
            if(max_sofar <max_end)
                max_sofar=max_end;
            if(max_end < 0)
                max_end=0;    
        }
        
        return max_sofar;
    }
    
    
    
    
    
    
    
}
