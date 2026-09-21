import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     String s=sc.nextLine();
     int n=s.length();
     int ls[]=new int[n];
     int len=0;
     int i=1;
     while(i<n){
        if(s.charAt(i)==s.charAt(len)){
            len++;
            ls[i]=len;
            i++;
            
        }else{
            if(len!=0){
                len=ls[len-1];
                i++;
            }
            else{
                ls[i]=0;
                i++;
            }
        }
     }
     int period=n-ls[n-1];
     if(n%2==0){
        System.out.println(period);
     }
     else{
         System.out.println(n);
     }
}
}

