package com.valdal14.java9features.TryWithResources;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class DemoTryWihResources {

    // we can now define our resource whenever we want
    private static final MyWorker newWorker = new MyWorker();

    public static void main(String[] args) {

        // we can now define our resource whenever we want
        MyWorker worker = new MyWorker();

        try(FileInputStream fis = new FileInputStream(new File("/home/valdal14/IdeaProjects/Java-Tutorials/src/com/valdal14/java9features/TryWithResources/Test.txt"));
            // previous Java 9 this could not be done
            worker;
            DemoTryWihResources.newWorker;
        ){
            worker.doSomething();
            newWorker.doSomething();

        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
