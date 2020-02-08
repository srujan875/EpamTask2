package Epam.Task2;

import java.util.*;
import Epam.Task2.*;

public class App 
{
    public static void main( String[] args ) throws InterruptedException
    {
    	Scanner sc=new Scanner(System.in);

    	// creating an object for list of sweets 
    	  List<Sweets> l1=new ArrayList<Sweets>();
    	  
    	
      
    	System.out.println("enter no.of sweets in Gifts");
    	
    	int n=sc.nextInt();
    	
    	//Adding Sweets objects to a List l1
    	for(int i=1;i<=n;i++)
    	{
    		System.out.println("enter the name of the sweet : "+i);
    		String str=sc.next();
    		System.out.println("enter the price of the sweet (in Rupees):"+str);
    		int p=sc.nextInt();
    		System.out.println("enter the weight of the sweet (in grams):"+str);
    		double w=sc.nextDouble();
    		
    	  l1.add(new Sweets(str,w,p));
    	}
        
    	
    	//creating an object for list of chocolates
  	  List <Chocolates> l2=new ArrayList<Chocolates>();
  	  
    	
    	System.out.println("enter the no.of chocolates :");
    	
    	int n2=sc.nextInt();
    	
    	for(int i=1;i<=n2;i++)
    	{
    		System.out.println("enter the name of the choclate : "+i);
    		String str=sc.next();
    		System.out.println("enter the price of the choclate (in Rupees):"+str);
    		int p=sc.nextInt();
    		System.out.println("enter the weight of the choclate (in grams):"+str);
    		double w=sc.nextDouble();
    		
    		l2.add(new Chocolates(str, p, w));
    		
    	}
      
    	// Sorting of sweets based upon its price values
    	Collections.sort(l1);
    	//Sorting of Chocolates based upon its price values
    	System.out.println("chocolates before sorting");
    	for(Chocolates s7:l2)
    	{
    		System.out.println(s7.getName()+" "+s7.getPrice());
    	}
    	
    	Collections.sort(l2);
    	System.out.println("Sorted list of chocolates");
    	for(Chocolates s7:l2)
    	{
    		System.out.println(s7.getName()+" "+s7.getPrice());
    	}
    	
    	System.out.println("enter the lower limit of price value");
    	int lower=sc.nextInt();
    	System.out.println("enter the upper limit of price value");
    	int upper =sc.nextInt();
    	
    	System.out.println("List of candies (sweets & Chocolates ) which are under the given range");
    	for(Sweets s1:l1)
    	{
    		if(s1.getPrice()>=lower && s1.getPrice()<=upper)
    		{
    			System.out.println(s1.getName()+" "+s1.getPrice());
    		}
    	}
    	
    	for(Chocolates s1:l2)
    	{
    		if(s1.getPrice()>=lower && s1.getPrice()<=upper)
    		{
    			System.out.println(s1.getName()+" "+s1.getPrice());
    		}
    	}
     
    
     
    }
}
