package com.valdal14.staticblocks;

public class StaticBlocks {
    /**
     * All global variable will get a default value
     */
    private static int num;

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.out.println("Hello World!");
        System.out.println(StaticBlocks.num);
    }

    /**
     * Static blocks are executed by the JVM when
     * the class is loaded. Only once and even before
     * the main method is called.
     *
     * Here we could place call to other systems or
     * anything we want to be executed once the
     * program start
     */
    static {
        System.out.println("Static Block");
    }

    /**
     * If we have more than once static blocks
     * they will be executed in order
     */
    static {
        System.out.println("Static Block 2");
    }

    /**
     * Static method can be also called inside static blocks
     */
    private static void executedInsideAStaticBlock() {
        System.out.println("Executed inside a static block");
    }

    static {
        StaticBlocks.executedInsideAStaticBlock();
    }
}
