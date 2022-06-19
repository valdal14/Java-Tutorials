package com.valdal14.annotations;

/**
 *  JAVA ANNOTATIONS -----------------------------------------------------------------------------------------------
 *      -> Java Annotations are metadata that start with the symbol @Entity
 *      -> We can use annotation on Class, Fields amd Methods
 *      -> When we place an annotation we add a special meaning to an entity
 *      -> For instance, Hibernate uses annotation such as @Entity, @id, @Query("select firstName from User")
 *         and convert these elements automatically to do DB operations.
 *      -> Annotation helps us to get rid of a lot of XML configurations.
 *      -> Annotations can be used for:
 *          --> Compile Time
 *          --> Build Time
 *              --> For Gradle, maven and so on
 *          --> Runtime
 *      -> JDK comes with a lot of built-in annotations such as:
 *          --> @deprecated
 *          --> @supresswarnings
 *          --> @override
 *      -> Annotations can carry values or simply act as Marker Annotations
 *          --> @Test (from JUnit) called marker annotation
 *          --> @WebService(endPoint="", serviceName=""); --> takes parameters
 *      -> If an annotation takes only one value we can do either:
 *          --> @MyAnnotation(values="myValue") or @MyAnnotation("myValue")
 *       -> But if it requires multiple values we need to specify names like "WebService Annotation
 *       -> We can create our own annotations
 *       -> If we control click on a built-in annotation we can see the info on how it was created
 *
 *       @SuppressWarnings({"deprecated", "rawtype"})
 *
 *       -> CREATE AN ANNOTATION -----------------------------------------------------------------------------------
 *          -> Symply create a new Annotation (From the manu where we create a class and you will see)
 *
 *          @Retention(RetentionPolicy.RUNTIME)
 *          @Target(ElementType.METHOD) // where it can be used such as classes field or methods
 *          public @interface MyAnnotation {
 *
 *          }
 *
 *          When we will cover Java Reflection API we will process this annotation
 *       -----------------------------------------------------------------------------------------------------------
 *  ----------------------------------------------------------------------------------------------------------------
 */
public class Annotations {
}
