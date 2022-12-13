package com.mycompany.cricle;
public class cricle
{  
public static void main(String[] args)
{

    cricle a1 = new cricle(10,"blue");
    System.out.println("the color is "+ a1.getcolor());
    System.out.println("the radius ="+ a1.getradius());
    System.out.println("the area of cricle ="+ a1.getarea());
    cylinder a2 = new cylinder(100,10,"blue");
    System.out.println("the higth of cylinder ="+ a2.gethigth());
    System.out.println("the volume of cylinder = "+ a2.getvolume());
    
 }

 
}
