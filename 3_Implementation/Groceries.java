/** This class deals with Groceries and thus inherits the Product class */

import java.io.*;
import java.util.*;
class Groceries extends Item
{
    
    Groceries(){
        super();
    }
     Groceries(int productId,String name,String brand,double rate,double discount_rate ){
        super( productId, name, brand, rate, discount_rate);
         getsection();
        
    }

    void add()
    {
     
        File f = new File("Groceries.txt");
       
        try{
            boolean find=searchInStock(getproduct_id(),"add");
            if(find==false)
            {
                FileWriter fw = new FileWriter(f,true);
                String temp=getproduct_id()+" "+getbrand()+" "+getname()+" "+getrate()+" "+getdiscount_rate()+" "+"1"+" "+System.getProperty("line.separator");
                fw.write(temp);     
                fw.close();
            }
        }
        catch(IOException ex)
        {
            System.err.println(ex+"**inside add**");
        }

      
    }  

    void remove(int n)
    {
       
        File inputFile = new File("Groceries.txt");
        File tempFile = new File("myTempFile.txt");
        // File rr = new File("rrrr.txt");


        
                boolean find=searchInStock(n, "remove");
                if(find == false)
                {
                    System.out.println("Not Available!!");
                }
        
      
           
        

            
    }
    boolean searchInStock(int n,String purpose)
    {
        boolean flag=false;
        File f = new File("Groceries.txt");
        File inputFile = new File("Groceries.txt");
        File tempFile = new File("tempo_Stock.txt");
        try{
         
            BufferedReader reader = new BufferedReader(new FileReader(inputFile));
            BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile));
            
            String currentLine;
            while((currentLine = reader.readLine()) != null) {
               
                String trimmedLine = currentLine.trim();  // trim newline when comparing with lineToRemove
                int firstgap=trimmedLine.indexOf(" ");

                int pno=Integer.parseInt(trimmedLine.substring(0,firstgap));
                
                
                if(pno == n) {
                    int index = trimmedLine.lastIndexOf(" ");
                    int val=Integer.parseInt(trimmedLine.substring(index+1));
                    if(purpose.equals("add"))
                    val++;
                    else
                    {
                        if(val==0)
                        System.out.println("Not enough in Stock !!,Sorry");
                        else
                       {
                        val--;
                        bill.add(currentLine);
                        System.out.println("Congrats, transaction successfull!!");
                       }
                    }
                    trimmedLine=trimmedLine.substring(0,index+1)+Integer.toString(val)+" ";
                    flag=true;
                    writer.write(trimmedLine + System.getProperty("line.separator"));
                    continue;
                }
               
                writer.write(currentLine + System.getProperty("line.separator"));
            }
            writer.close(); 
            reader.close(); 

            
            //delete file
            inputFile.delete();
            //rename temp file
            boolean success = tempFile.renameTo(inputFile);
            // System.out.println(success);
        }
        catch(IOException e)
        {
            System.out.println(e+"**inside searchInStock**");
        }
       return flag;
        
    }
}