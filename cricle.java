package com.mycompany.cricle;

public class cricle {
    double radius ;
    String color ;

       public cricle ()
            {}    
        public cricle (double r )
              { 
               r=radius;
              }
                public cricle (double r , String c)
                {
                    radius=r;
                    color=c;
                }
//                 public void setradius(double r) 
//                 {
//                   radius=r;
//                 }
                 public double getradius(){
                 
                     return radius;
                 
                 } 
//                public void setcolor(String s){
//                color=s;
//                } 
                public String getcolor()
                {
                return color;
                }
                public double getarea(){
                
                return (this.getradius()*this.getradius()*3.14);
                }
     
                 

}
