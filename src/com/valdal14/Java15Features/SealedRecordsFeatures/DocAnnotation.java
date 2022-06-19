package com.valdal14.Java15Features.SealedRecordsFeatures;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD) // where it can be used such as classes field or methods
public @interface DocAnnotation {
}
