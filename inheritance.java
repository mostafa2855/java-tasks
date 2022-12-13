
\\ MAIN

package com.mycompany.lab; 

public class Lab {

    public static void main(String[] args) {
        circle obj = new circle(4);
        System.out.printf("The area of Circle ="+ obj.areaCircle());

        cylinder obj2 = new cylinder(4, 5);
        System.out.printf("The area of Cylinder "+ obj2.areaCylinder());
    }
}


===================================================================================================================
\\SUPER CLASS

package com.mycompany.lab;

public class circle {
  private double radius;

    public circle(double radius) {
        this.radius = radius;
    }

    public double areaCircle() {
        return radius*radius*3.14;
    }

    public double getRadius() {
        return radius;
    }
}

===================================================================================================================
\\Inheritence
package com.mycompany.lab;

public class cylinder extends circle {
    private int height;

    public cylinder(double radius, int height) {
        super(radius);
        this.height = height;
    }

    public double areaCylinder() {
        return 2 * areaCircle() + (2 * Math.PI * getRadius() * height);
    }
}