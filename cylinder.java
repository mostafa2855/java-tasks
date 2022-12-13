package com.mycompany.cricle;

public class cylinder extends cricle {
    double higth;
    
    public cylinder()
    {}

    public cylinder(double h)

    {
      higth=h;
   }
     public cylinder(double h , double r )       
     {
        super(r);
        higth=h;    
     }
      public cylinder(double h , double r , String c )       
     {
        super(r ,c);
        higth=h;
     }
//      public void sethigth (double h)
//      {
//        h=higth;
//      }
      public double gethigth(){
      
      return higth;
      }
      public double getvolume(){
          return higth*this.getradius()*this.getradius()*3.14;
      }
            
            }




