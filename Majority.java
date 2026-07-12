import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Majority {

    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
     int a[]=new int[n];
     for(int i=0;i<n;i++){
        a[i]=sc.nextInt();
     }
     Arrays.sort(a);
     int candidate=a[n/2];
     int count=0;
    for(int num:a){
        
        if(num==candidate){
            count++;
        }
      
    }
     if(count>n/2){
        System.out.print(candidate);
     }
     else{
         System.out.print(-1);
     }
  
}
}
