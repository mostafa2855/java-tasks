package com.mycompany.myonlineshop;

 abstract class Products {
      double prise; 

 public abstract double get_prise(double prise);
 
}
  class book extends Products {
 
 @Override
 public double get_prise(double prise){
 return prise*0.85 ; 
 }
 }
  class childrenbook extends book {
 @Override
 public double get_prise(double prise){
 return prise*0.75;
 }
    }

   
======================================================================
package com.mycompany.myonlineshop;
public class Myonlineshop 
{  
public static void main(String[] args)
{
      

  Products [] obj = new Products [2];
  obj[0]=new book();
  obj[1]=new childrenbook();
  double sum ; 
  sum = obj[0].get_prise(200)+obj[1].get_prise(300);
  System.out.println("the total price = "+ sum );
}
}