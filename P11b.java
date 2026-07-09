//Package Implementation
import Vol.*;
import java.util.*;
class P11b {
    public static void main(String args[]){
        float r, h, v;
        Scanner sc = new Scanner(System.in);
        Cylinder c = new Cylinder();
        System.out.print("Enter the radius and height of the Cylinder: ");
        r = sc.nextFloat();
        h = sc.nextFloat();
        v = c.volume(r, h);
        System.out.printf("Volume of the Cylinder is %.3f", v);
    }
}
