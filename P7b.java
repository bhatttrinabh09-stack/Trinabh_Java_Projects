import java.util.*;
class P7b{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of side of square: ");
        float side = sc.nextFloat();
        FindArea a1 = new FindArea(side);
        System.out.print("Enter length and breadth of rectangle: ");
        float length = sc.nextFloat();
        float breadth = sc.nextFloat();
        FindArea a2 = new FindArea(length, breadth);
        FindArea a3 = new FindArea(a1);
        FindArea a4 = new FindArea(a2);
    }
}
class FindArea {
    private float s, l, b;
    FindArea(float s_) {
        s = s_;
        System.out.printf("Area of Square: %.3f\n", s * s);
    }
    FindArea(float l_, float b_) {
        l = l_;
        b = b_;
        System.out.printf("Area of Rectangle: %.3f\n", l * b);
    }
    FindArea(FindArea fa) {
        s = fa.s;
        l = fa.l;
        b = fa.b;
        if (s != 0) {
            s = s * 2;
            System.out.printf("Copied Square Area (doubled): %.3f\n", s * s);
        } else {
            l = l * 3;
            b = b * 0.5f;
            System.out.printf("Copied Rectangle Area (modified): %.3f\n", l * b);
        }
    }
}