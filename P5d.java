
class P5d{
    static int count = 0;
    public P5d() {
        count++;
    }
    static void displayCount() {
        System.out.println("Number of objects created: " + count);
    }
    public static void main(String[] args) {
        P5d obj1 = new P5d();
        P5d obj2 = new P5d();
        P5d obj3 = new P5d();
        P5d.displayCount();
    }
}