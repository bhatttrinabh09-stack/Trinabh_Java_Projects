class SuperClass {
    protected int x;
    SuperClass(int value) {
        x = value;
    }
    public void display() {
        System.out.println("Value in SuperClass: " + x);
    }
}

class SubClass extends SuperClass {
    SubClass(int value) {
        super(value);
    }
    public void display() {
        System.out.println("Accessing variable using super: " + super.x);
        super.display();
    }
}

class P8b{
    public static void main(String[] args) {
        SubClass obj = new SubClass(10);
        obj.display();
    }
}