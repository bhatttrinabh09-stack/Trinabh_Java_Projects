import java.util.*;
class P7b$ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter lenght of side of square: ");
        float side = sc.nextFloat();
        FindArea a1 = new FindArea(side);
        System.out.print("Enter length and breadth of rectangle: ");
        float length = sc.nextFloat();
        float breadth = sc.nextFloat();
        FindArea a2 = new FindArea(length, breadth);
    }
}
class FindArea{
    /*Using Parameterized Constructors and Constructor Overloading  */
    private float s, l, b;
    FindArea(float s_){
        s = s_;
        System.out.printf("Area of the Square is %.3f\n", s*s);
    }
    FindArea(float l_, float b_){
        l = l_;
        b = b_;
        System.out.printf("Area of the Rectangle is %.3f\n", l*b);
    }
}