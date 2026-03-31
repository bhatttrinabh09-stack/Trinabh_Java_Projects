import java.util.*;
public class P3d {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        Scanner sc = new Scanner(System.in);
        String s1, s2;
        System.out.println("Enter the first string:");
        s1 = sc.nextLine();
        System.out.println("Enter the second string:");
        s2 = sc.nextLine();
        String s = s1.concat(s2);
        sb.append(s);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s);
    }
}