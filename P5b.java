import java.util.*;
class P5b {
    public float findArea(float a){
        return a*a;
    }
    public float findArea(float a, float b){
        return a*b;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        P5b oP5b = new P5b();
        System.out.print("Enter lenght of side of square: ");
        float s = sc.nextFloat();
        System.out.print("Enter length and breadth of rectangle: ");
        float l = sc.nextFloat();
        float b = sc.nextFloat();
        System.out.printf("Area of the Square is %.3f", oP5b.findArea(s));
        System.out.printf("\nArea of the Rectangle is %.3f", oP5b.findArea(l, b));
    }
}
