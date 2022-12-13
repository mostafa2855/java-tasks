//INTERFACE CLASS
package com.mycompany.myonlineshop;

public interface product {
    double prise = 250.0;
    public double getprise(double prise);
}

   
=====================================================================  

public class book implements product {

    public double getprise(double p){
        p=prise;
        return prise*0.85 ; 
         }  
       
        }
=====================================================================  
    
   class childrenbook implements product{
    public double getprise(double p){
        p=prise;
        return prise*0.80 ; 
   }
   }
=====================================================================  
       class cartoonbook implements product{
    public double getprise(double p){
        p=prise;
        return prise*0.90 ; 
   }
       }
  
=====================================================================    
package com.mycompany.myonlineshop;
public class Myonlineshop 
{  
public static void main(String[] args)
{
   product [] a = new product [3];
     a[0]=new book ();
   a[1]=new childrenbook ();
   a[2]=new cartoonbook ();
   double totalprise ; 
   totalprise =a[0].getprise(200)+ a[1].getprise(300) + a[2].getprise(350 );
   System.out.println("the total prise ="+ totalprise);
}
}