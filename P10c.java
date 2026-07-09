import java.util.*;
class GarbageCollector
{
    public void finalize() {
        System.out.println("object has been deleted ");
    }
}
class P10c {
    public static void main(String args[]){
        GarbageCollector gco = new GarbageCollector();
        System.out.println("object has been created... ");
        gco = null;
        System.gc();
        System.out.println("garbage collection is requested...");
    }
}