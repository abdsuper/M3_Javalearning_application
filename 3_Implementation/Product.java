/** This is an abstract class which can be extended by any product class  */
import java.util.ArrayList;
abstract class Product
{
    static ArrayList <String> bill =new ArrayList<>();
      private String category;
     private int product_no; 
      private String name;
      private String brand;
     private double price;
      private double discount;
    Product()
    {
        category=null;
        product_no=0;
        name=null;
        brand=null;
        price=0;
        discount=0;
    }
    Product(int p,String name,String brand,double price,double discount){

        this.price=price;
        this.name=name;
        this.product_no=p;
        this.discount=discount;
        this.brand=brand;
    }
          public void setproduct_no(int product_no){
      this.product_no=product_no;}

   public int getproduct_no(){
     return this.product_no;}

      public void setcategory(String category){
      this.category=category;}
     
     public String getcategory(){
     return this.category;}

     public void setname(String name){
      this.name=name;}
      
 public String getname(){
     return this.name;}

 public void setbrand(String brand){
      this.brand=brand;}

 public String getbrand(){
     return this.brand;}

     public void setprice(double price){
     this.price=price;}

 public double getprice(){
     return this.price;}

      public void setdiscount(double discount){
      this.discount=discount; }

 public double getdiscount(){
     return this.discount;}



    abstract void add( );
    abstract boolean searchInStock(int n,String purpose );
}