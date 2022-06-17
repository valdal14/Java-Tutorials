package com.valdal14.Java13And14Features;

/**
 *  JAVA 13 AND 14 FEATURES ------------------------------------------------------------------------------------------
 *
 *      -> TEXT BLOCKS
 *          -> simple the following
 *
 *          String JSONTOPOST = """
 *             {
 *                 "userId": 1014,
 *                 "id": 8,
 *                 "title": "test",
 *                 "body": "dignissimos aperiam dolorem"
 *               }
 *             """;
 *
 *
 *      -> SWITCH Expressions
 *          -> Assign to a variable the result of a swich expression using yield
 *
 *         var key = 2;
 *
 *         String result = switch (key){
 *             case 1:{
 *                 yield "Choice 1";
 *             }
 *             case 2: {
 *                 yield "Choice 2";
 *             }
 *             default:
 *                 yield "Invalid Choice";
 *         };
 *
 *
 *      -> instanceof Pattern Matching
 *
 *          // Pattern matching
 *         if(object instanceof String str){
 *             System.out.println(str);
 *         }
 *
 *
 *      -> Helpful Nullpointers
 *          -> it will throw a NullPointerException but with more info
 *
 *             String str = null;
 *             System.out.println(str.charAt(0));
 *             // Cannot invoke "String.charAt(int)" because "str" is null
 *
 *      -> Records
 *          -> Records can be seen as a simplified Java Beans
 *          -> We no longer need to create our Beans with getter and setters and implement the toString, hashCode
 *             and so on.
 *          -> We simply define a record with params and we will get everything we need
 *          -> Non-canonical record constructor must delegate to another constructor
 *          -> The field in a record constructor are final, we cannot change them
 *          -> DECOMPILER:
 *              --> Go to the dir where your classes are compiled
 *              --> ~/IdeaProjects/Java-Tutorials/out/production/Java-Tutorials/com/valdal14/Java13And14Features/Records
 *              --> To de-compile a class do: javap -p -v Employee.class
 *          -> RECORDS and CONSTRUCTOR:
 *              -> When you define a record this is your constructor in our example:
 *                  --> public record Employee(String name, int sal)
 *                  --> We cannot have a default constructor
 *                  --> fields must be all static
 *                  --> Methods can be static and instance methods
 *
 *
 *
 *
 *  ------------------------------------------------------------------------------------------------------------------
 */

public class Java13And14Features {
}
