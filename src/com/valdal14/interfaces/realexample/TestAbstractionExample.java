package com.valdal14.interfaces.realexample;

public class TestAbstractionExample {
    public static void main(String[] args) {
        System.out.println("--- ABSTRACTION EXAMPLE ---");

        DellNotebook dellNotebook = new DellNotebook();
        dellNotebook.scroll();
        dellNotebook.click();

        HPNotebook hpNotebook = new HPNotebook();
        hpNotebook.scroll();
        hpNotebook.click();
    }
}
