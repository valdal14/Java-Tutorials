package com.valdal14.Java17Features;

/**
 *  JAVA 17 FEATURES -----------------------------------------------------------------------------------
 *
 *      -> Sealed Classes: Are now permanent features
 *
 *      -> Random Generator Factories:
 *
 *          RandomGenerator randomGenerator = RandomGeneratorFactory.of("Xoshiro256PlusPlus")
 *                 .create(888);
 *
 *         // Function
 *         Function<RandomGeneratorFactory<RandomGenerator>, String> func = f -> f.group() + ":" + f.name();
 *         System.out.println(randomGenerator.getClass());
 *
 *         RandomGeneratorFactory.all().map(func)
 *                 .sorted()
 *                 .forEach(System.out::println);
 *
 *         int i = 0;
 *
 *         while (i <= 10){
 *             int num = randomGenerator.nextInt(20);
 *             System.out.println(num);
 *             i++;
 *         }
 *
 *      -> Pattern Matching Switch
 *          -> Still on Preview in JAVA 17
 *          -> We can also pass and handle null in this new preview
 *
 *          // New Switch Pattern Instance
 *          public static double getPerimeterUsingSwitchPatternMatching(Shape shape){
 *              return switch (shape){
 *                  case Circle c -> 2 * Math.PI * c.radius();
 *                  case Rectangle r -> 2 * r.l() * r.w();
 *                  default -> throw new IllegalStateException("Unexpected value: " + shape);
 *              };
 *          }
 *
 *          public static void main(String[] args) {
 *
 *              double circlePerimeter = getPerimeter(new Circle(10.0));
 *              System.out.println(circlePerimeter);
 *
 *              double newPerim = getPerimeterUsingSwitchPatternMatching(new Rectangle(2.3, 3.4));
 *              System.out.println(newPerim);
 *          }
 *
 *      -> Enhanced De-SerializationFilters
 *          -> Configure Global Filter
 *              -> echo $JAVA_HOME --> /usr/lib/jvm/java-17-openjdk-amd64/
 *              -> cd /usr/lib/jvm/java-17-openjdk-amd64/
 *              -> cd conf
 *              -> cd security
 *              -> nano or vim java.security
 *              -> search for jdk.serialFilter=pattern;patten
 *                      --> This is the property to configure a filter without writing any code
 *                      --> remove the # and here is where we can use the pattern matching:
 *                          ----> jdk.serialFilter=!serialization.Employee // do not allow a class
 *                          ----> jdk.serialFilter=serialization.Employee // this class is allowed now
 *          -> We can also configure a filter inside the deserialization class
 *
 *          // ObjectInputFilter.Config.createFilter("DeserializationFilters.Employee");
 * 		   ObjectInputFilter filter1 = ObjectInputFilter.Config.createFilter("com.valdal14.Java17Features.DeserializationFilters.*;java.base/*;!*");
 * 		   ois.setObjectInputFilter(filter1);
 *
 * 		   // Allow or Reject
 * 		Predicate<Class<?>> predicate = c -> c.equals(Employee.class);
 * 		// check whether or not a the predicates return true otherwise we reject
 * 		System.out.println(predicate);
 * 		ObjectInputFilter filter2 = ObjectInputFilter.allowFilter(predicate,ObjectInputFilter.Status.REJECTED);
 * 		ois.setObjectInputFilter(filter2);
 *
 * 	    Note: We cannot apply more than one filter, we need to use the merge method
 *
 * 	    // Merge two filters
 * 		ObjectInputFilter mergedFilters = ObjectInputFilter.merge(filter1, filter2);
 * 		ois.setObjectInputFilter(mergedFilters);
 *
 *
 *  ----------------------------------------------------------------------------------------------------
 *
 */

public class Java17Features {
}
