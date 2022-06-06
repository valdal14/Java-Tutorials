package com.valdal14.garbagecollector;

public class GCDemo {

    int objId;

    public static void main(String[] args) {
        new GCDemo(1);
        new GCDemo(2);
        for (int i = 0; i <= 100; i++) {
            System.gc();
        }
    }
    public GCDemo(int objId) {
        this.objId = objId;
        System.out.println("Created " + this.objId);
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Finalized by the GC " + this.objId);
    }
}
