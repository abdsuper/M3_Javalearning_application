/** THis is a customer class which displays the products to Customer and allow them to buy any of them */

import java.io.*;
import java.util.*;

class Customer
{
    File f=null;
    void show(String category) 
    {
        if(category.equalsIgnoreCase("Watches") )
        {  f= new File("watches.txt");

    }
    else if(category.equalsIgnoreCase("Bags"))
    {
     f= new File("bags.txt");
    }
            try{
               
                Scanner sc=new Scanner(f);
                int i=0;
                System.out.println("*************************");
                while(sc.hasNextLine())
                {
                    String temp=sc.nextLine();
                    temp.trim();
                    temp=temp+" ";
                   
                    String pno=temp.substring(i,temp.indexOf(" "));
                    System.out.println("Product-id: "+pno);
                    temp=temp.substring(temp.indexOf(" ")+1);
                    System.out.println("Brand: "+temp.substring(i,temp.indexOf(" ")));
                    temp=temp.substring(temp.indexOf(" ")+1);
                    System.out.println("Name: "+temp.substring(i,temp.indexOf(" ")));
                    temp=temp.substring(temp.indexOf(" ")+1);
                    System.out.println("Rate: "+temp.substring(i,temp.indexOf(" ")));
                    temp=temp.substring(temp.indexOf(" ")+1);
                    System.out.println("Discount_rate: "+temp.substring(i,temp.indexOf(" ")));
                    System.out.println("*************************");
                }
               
                sc.close();
                }
               
                catch(IOException e)
                {
                    System.out.println(e);
                }
                Scanner sc=new Scanner(System.in);
                System.out.println("Do you want to buy any ? YES/NO");
                if(sc.next().equals("YES"))
                {
                    System.out.println("Enter the product number");
                    int prod_no=sc.nextInt();
                    select(prod_no,category);
                }
                
            
    
            }
           
      static  void select(int prod_no,String category){
          if(category.equalsIgnoreCase("Watches"))
          {
                Watches obj= new Watches();
                obj.remove(prod_no);
          }
         else if(category.equalsIgnoreCase("Bags"))
         {
                Bags obj1=new Bags();
                obj1.remove(prod_no);
         }
          
          

        }
    }

