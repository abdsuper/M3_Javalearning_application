/** This is an abstract class which can be extended by any product class  */
import java.util.ArrayList;
abstract class Item
{
    static ArrayList <String> bill =new ArrayList<>();
      private String section;
     private int product_id; 
      private String name;
      private String brand;
     private double rate;
      private double discount_rate;
   Item()
    {
        section=null;
        product_id=0;   
        name=null;
        brand=null;
        rate=0;
        discount_rate=0;
    }
    Item(int p,String name,String brand,double rate,double discount_rate){

        this.rate=rate;
        this.name=name;
        this.product_id=p;
        this.discount_rate=discount_rate;
        this.brand=brand;
    }
          public void setproduct_id(int product_id){
      this.product_id=product_id;}

   public int getproduct_id(){
     return this.product_id;}

      public void setsection(String section){
      this.section=section;}
     
     public String getsection(){
     return this.section;}

     public void setname(String name){
      this.name=name;}
      
 public String getname(){
     return this.name;}

 public void setbrand(String brand){
      this.brand=brand;}

 public String getbrand(){
     return this.brand;}

     public void setrate(double rate){
     this.rate=rate;}

 public double getrate(){
     return this.rate;}

      public void setdiscount_rate(double discount_rate){
      this.discount_rate=discount_rate; }

 public double getdiscount_rate(){
     return this.discount_rate;}



    abstract void add( );
    abstract boolean searchInStock(int n,String purpose );
}