import java.util.Scanner;

/** This is an owner class which provide the functionality to add new stocks or remove them to owner of the store */

class Owner {
    Owner(){
 
    }

    Owner(String  ch,char c,int p,String name,String brand,double price,double discount)
    {
        if(ch=="add")
        {
            if (c=='w')
            {
                Watches obj = new Watches(p,name,brand,price,discount);
                obj.add();
            }
            else if(c=='b')
            {
                Clothes obj = new Clothes(p,name,brand,price,discount);
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
                Watches obj = new Watches();
                obj.remove(n);
            }
            else if(c=='b')
            {
                System.out.println("Enter the product number");
                int n=sc.nextInt();
                Clothes obj = new Clothes(p,name,brand,price,discount);
                obj.remove(n);
            }
        }
      
    }

	
}