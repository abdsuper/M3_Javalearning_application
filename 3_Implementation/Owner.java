import java.util.Scanner;

/** This is an owner class which provide the functionality to add new stocks or remove them to owner of the store */

class Owner {
    Owner(){
 
    }

    Owner(String  ch,char c,int productId,String name,String brand,double price,double discount)
    {
        if(ch=="add")
        {
            if (c=='w')
            {
                Groceries obj = new Groceries(productId,name,brand,price,discount);
                obj.add();
            }
            else if(c=='b')
            {
                Clothes obj = new Clothes(productId,name,brand,price,discount);
                obj.add();
            }
        }
        if(ch == "remove")
        {
            Scanner sc=new Scanner(System.in);
            if(c == 'w')
            {
                System.out.println("Enter the product number");
                int n=sc.nextInt();
                Groceries obj = new Groceries();
                obj.remove(n);
            }
            else if(c=='b')
            {
                System.out.println("Enter the product number");
                int n=sc.nextInt();
                Clothes obj = new Clothes(productId,name,brand,price,discount);
                obj.remove(n);
            }
        }
      
    }

	
}