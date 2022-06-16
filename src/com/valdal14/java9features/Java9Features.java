package com.valdal14.java9features;

/**
 *  JAVA 9 FEATURES -------------------------------------------------------------------------------------------------
 *      -> PRIVATE METHODS IN INTERFACES ===========================================================================
 *          -> We can have private methods inside our interfaces
 *      ============================================================================================================
 *
 *      -> STATIC PRIVATE METHODS ==================================================================================
 *          -> This new private methods can also be static
 *      ============================================================================================================
 *
 *      -> TRY WITH RESOURCES ======================================================================================
 *          -> Starting from Java 9 we can use Resources we defined outside the try(resource)
 *          -> We need to define our resources Autoclosable and then we can use them direclty
 *              --> class MyWorker implements AutoCloseable
 *      ============================================================================================================
 *
 *      -> IMMUTABLE COLLECTIONS ===================================================================================
 *          -> Prior to Java 9, if you wanted to create immutable sets or lists you had to create it and then
 *             use Collections.unmodifiableSet()
 *          -> From Java 9 we can do:
 *              --> List<String> list = List.of("abc", "xyz", "124");
 *              --> If we try to add a new element into the list at compile time we see nothing wrong
 *              --> At runtime tho we will get a UnsupportedOperationException
 *      ============================================================================================================
 *
 *      -> @SafeVarargs ============================================================================================
 *          -> Prior to Java 9, we could use the @SafeVarargs annotation only on Static Methods and Final method but
 *             not on Private Method
 *          -> We should use @SafeVarargs annotation when using List<String>...l
 *
 *          NOTE: List variable arguments List<String>...l
 *                public static void m1(List<String>...l)
 *
 *                List<String>...l internally is represented like a List of String Arrays: List<String>[]
 *
 *      ============================================================================================================
 *
 *      -> NEW METHODS IN STREAMING API ============================================================================
 *          -> takeWhile()
 *              --> It will take all the elements that matches the predicate condition and it will stop as soon as it
 *                  finds an element that does not match that condition
 *          -> dropWhile()
 *              --> Opposite of takeWhile it will print everything after the condition is no longer matches no matter
 *                  the result of the rest
 *          -> ofNullable()
 *              --> Will do a null check for us. Used in the flatmap method
 *              --> It does a null check of us and skip if it found one
 *
 *                  Function<Integer, Stream<Integer>> function = Stream::ofNullable;
 *                  list.stream().flatMap(function).forEach(System.out::println);
 *      ============================================================================================================
 *
 *      -> JPMS ====================================================================================================
 *          -> Java Platform Module System
 *              -> Module is a just a group of packages
 *              -> Just like a JAR file except it comes with a module-info.java
 *              -> The module-info.java can use two different things inside it:
 *                  --> export
 *                  --> requires
 *              -> Both export and requires offers a lot of advantages over a JAR
 *              -> Using export we can say which packages within this module we want to expose to other modules
 *              -> Using requires we can say which packages this module requires to work properly
 *
 *          -> Using JAR we commonly encounter issues such as:
 *              --> noClassDefFoundError
 *              --> Version Problems
 *              --> Everything is public
 *              --> Monolithic/Huge
 *
 *          -> Modules provides benefits such as
 *              --> Reliability
 *                  ---> JVM will check the requires modules before starting
 *              --> We can specify exactly which version we want/need
 *              --> Modules allows us to restrict and exposes
 *              --> Modularity
 *
 *          -> Every Module should be a new project
 *
 *          -> See the Patient Management Project for more info
 *
 *              module patientmanagement {
 *                  // we export the package
 * 	                exports com.valdal14.pr;
 *              }
 *
 *              module patientclinicals {
 *                  // we import/requires the module name
 * 	                requires patientmanagement;
 *              }
 *
 *              module patiencbilling {
 *              }
 *
 *              public class PatientClinical {
 *
 * 	            public static void main(String[] args) {
 *
 * 		            PatienceRegistration pc = new PatienceRegistration();
 * 		            pc.registerPatient();
 * 		            pc.getPatienceDetails();
 *              }
 *
 *             }
 *
 *           -> Every class in a Java Module base project should be inside a package
 *           -> Cannot be inside the default package
 *
 *           -> Transitive Dependencies :
 *              --> Suppose now we want PatientBilling to use PatientClinical that already requires patientmanagement
 *                  and it also want to use PatientManagement.
 *              --> In PatientClinical we can do: requires transitive patientmanagement;
 *              --> This will exposes the patientmanagement to the PatientBilling by just requiring the patientclinicals
 *                  module.
 *
 *              module patientclinicals {
 * 	                 // we import/requires the module name
 * 	                requires transitive patientmanagement;
 *              }
 *
 *            -> To add a transitive module in PatientBilling we need to change the build path by adding the
 *               PatientManagement in the module section.
 *            -> Select the Modulepath inside the Build Path and click on Add...
 *            -> And select the PatientManagement. Apply and Close and now it should be accessible.
 *
 *            -> Static and Cyclic dependencies:
 *              --> Using static mean the required module will be only available at compile time
 *              --> Static requires is good for instance in the context of Serverlt APIs.
 *              --> Serverlt APIs are required at compile time, but once deployed on a Server we
 *                  no longer need their dependencies becuase the Servers already have them.
 *
 *              module patientclinicals {
 * 	                // requires a static dependency
 * 	                requires static patientmanagement;
 *              }
 *
 *              module patientmanagement {
 * 	                // we export the package
 * 	                exports com.valdal14.pr;
 * 	                // Cycle exists in module dependencies, Module patientmanagement requires itself via patiencbilling
 * 	                // requires patiencbilling;
 *              }
 *
 *            -> Qualified Exports:
 *              --> Used when you are exposing or exporting certain packages from withing a module we can qualify
 *                  them at the end, so that they are available only to certain modules and not all module that will
 *                  require our module.
 *
 *                  module patientmanagement {
 * 	                    // we export the package only to patiencbilling
 * 	                    exports com.valdal14.pr to patiencbilling;
 *                  }
 *
 *              -> Aggregator and Package Resolution:
 *                  --> If one modules needs all the three modules we have created before, instead of configuring
 *                      the new module to requires all of them, we can create an aggregator module and in this new
 *                      aggregator module we can use the requires transitive for all the three modules.
 *
 *
 *                  module aggregatormodule {
 * 	                    requires transitive patientmanagement;
 * 	                    requires transitive patiencbilling;
 * 	                    requires transitive patientclinicals;
 *                  }
 *
 *
 *      ============================================================================================================
 *  -----------------------------------------------------------------------------------------------------------------
 */

public class Java9Features {
}
