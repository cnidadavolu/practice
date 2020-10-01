import java.lang.Throwable;

public class GarbageCollectorExample {

    public static void main(String[] args) {
        GarbageCollectorExample gc1 = new GarbageCollectorExample();
        GarbageCollectorExample gc2 = new GarbageCollectorExample();

        gc1 = null;
        System.gc();
        System.out.println("gc1" + gc1);

        GarbageCollectorExample gc3 = new GarbageCollectorExample();

        gc2 = null;
        Runtime.getRuntime().gc();
        //System.gc();
    }

    protected void finalize() throws Throwable {
        System.out.println("Garbage Collection Called");
        System.out.println("Object GC collected : " + this);
    }
}
