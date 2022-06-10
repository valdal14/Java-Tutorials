package com.valdal14.java8functional.streams.quickdemo;

import java.util.Set;

@FunctionalInterface
public interface Printable<T extends Runnable> {
    StreamsDemo print(Set<T> t);
}
