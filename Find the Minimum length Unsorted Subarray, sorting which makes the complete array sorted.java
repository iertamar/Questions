import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int t = sc.nextInt();
	    while(t-->0)
	    {
	        int s=0,e=0,index1=0, index2=0 , min = Integer.MAX_VALUE, max = Integer.MIN_VALUE ;
	        int n = sc.nextInt();
	        int a[] = new int[n];
	        for(int i = 0; i<n ;i++)
	        {
	            a[i] = sc.nextInt();
	        }
	        for(int i = 0; i<n-1 ;i++)
	        {
	            if(a[i]>a[i+1])
	            {
	                index1 = i;
	                break;
	            }
	        }
	        //System.out.print(index1+" ");
	        for(int i = n-1; i>0;i--)
	        {
	            if(a[i]<a[i-1])
	            {
	                index2 = i;
	                break;
	            }
	        }
	        for(int i = index1 ; i<=index2 ; i++)
	        {
	            if(a[i]<min)
	              min = a[i];
	        }
	        for(int i = index1 ; i<=index2 ; i++)
	        {
	            if(a[i]>max)
	              max = a[i];
	        }
	        for(int i =0; i<n ;i++)
	        {
	            if(a[i]>min)
	            {
	                s = i;
	                break;
	            }
	        }
	        for(int i =n-1; i>=0 ;i--)
	        {
	           if(a[i]<max)
	            {
	                e = i;
	                break;
	            } 
	        }
	        System.out.println(s+" "+ e);
	    }
	    
	}
}
