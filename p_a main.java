import java.util.Scanner;

public class p_a {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the sides of a,b,c trianglr : ");
        System.out.print("Enter a : ");
        int a = input.nextInt();
        System.out.print("Enter b : ");
        int b = input.nextInt();
        System.out.print("Enter c : ");
        int c = input.nextInt();
        p_a_triangle t1 = new p_a_triangle();
        t1.set_sides(a, b, c);
        t1.get_t_perimeter();
        t1.get_t_area();
        System.out.print("Enter the reduis of the circle : ");
        int r = input.nextInt();
        p_a_circle c1 = new p_a_circle();
        c1.set_r(r);
        c1.get_c_perimeter();
        c1.get_c_area();
    }
}
