class Demo {
    String name;

    // Constructor prints a message
    Demo(String name) {
        this.name = name;
        System.out.println("Constructor: object " + name + " created.");
    }

    void use() {
        System.out.println("Using object " + name);
    }

    // Called by the garbage collector just before it removes the object.
    // (Used here only to observe what happens. It is deprecated.)
    protected void finalize() {
        System.out.println("Finalize: object " + name + " is being cleaned up.");
    }
}

public class Main {
    public static void main(String[] args) throws InterruptedException {

        Demo d = new Demo("D1");
        d.use();

        // Remove the only reference. The object is now eligible for garbage collection.
        d = null;
        System.out.println("Reference removed. Object is now eligible for GC.");

        // Only a REQUEST. Java may or may not run the collector right now.
        System.gc();
        System.out.println("System.gc() requested.");

        // Wait a little to give the collector a chance to run
        Thread.sleep(1000);

        System.out.println("End of program.");
    }
}