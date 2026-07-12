import java.io.*;
import java.util.*;

public class Interchanging_Sub {

    public static void main(String[] args) {
       Scanner sc =new Scanner(System.in);
       int size=sc.nextInt();
       int[] arr =new int[size];
       for(int i=0;i<size;i++)
       {
        arr[i]=sc.nextInt();
       }
          int high=max(arr,size);
          int low=min(arr,size);
          swap(arr,high,low);
    
    }
      public static int max(int[] arr,int size){
         int max=arr[0];
         int index=0;
       for(int i=1;i<size;i++){
        if(arr[i]>max){
          max=arr[i];
          index=i;
          }  
       }
       return index; 
      }
      public static int min(int[] arr,int size){
      int  min=arr[0];
      int index=0;
       for(int i=1;i<size;i++){
        if(arr[i]<min){
          min=arr[i];
         index=i;
         }
      } 
          return index; 
      }
      public static void swap (int[] arr,int high,int low){
        int temp=arr[high];
        arr[high]=arr[low];
        arr[low]=temp;
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
      } 
       
    
       
    }
