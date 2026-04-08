import java.util.*;
class Data{
    protected float r;
}
class Circle extends Data{
    protected float area;
    Circle(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Radius of the Circle: ");
        r = sc.nextFloat();
        area = 3.142f * r * r;
        System.out.printf("\nArea of the Circle is %.3f", area);
    }
}
class Sphere extends Circle{
    private float vol;
    Sphere(){
        super();
        vol = (4/3f) * area * r;
        System.out.printf("\nVolume of the Sphere is %.3f", vol);
    }
}
class P8a{
    public static void main(String[] args) {
        Sphere s = new Sphere();
    }
}