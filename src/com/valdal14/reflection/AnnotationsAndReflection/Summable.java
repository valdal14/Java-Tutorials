package com.valdal14.reflection.AnnotationsAndReflection;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface Summable {
    double value1() default 0;
    double value2() default 0;
}
