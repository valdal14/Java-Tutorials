package com.valdal14.Java12Features;

/**
 *  JAVA 12 FEATURES ----------------------------------------------------------------------------------------------
 *
 *      -> NEW STRING API UPDATES:
 *          -> str.indent() works also with negative values
 *
 *              String s = "I'am a new String";
 *              // Indentation
 *              System.out.println(s.indent(5));
 *              // Negative Indentation
 *              System.out.println(s.indent(-4));
 *
 *          -> str.transform() that takes a Functions
 *
 *              String str = "10";
 *              Function<String, Integer> myFunc = a -> Integer.parseInt(str) * 2;
 *              Integer res = str.transform(myFunc);
 *              System.out.println(res);
 *
 *      -> NumberFormat
 *          ->
 *
 *              NumberFormat format = NumberFormat.getCompactNumberInstance();
 *              System.out.println(format.format(1000));
 *
 *              format = NumberFormat.getCompactNumberInstance(Locale.ITALIAN, NumberFormat.Style.SHORT);
 *              System.out.println(format.format(100));
 *              System.out.println(format.format(1000000));
 *
 *              1K
 *              100
 *              1 Mln
 *
 *      -> Unicode 11
 *          -> Added supports for more UNICODE chars
 *              --> See below example
 *
 *      -> Collectors
 *          -> We have a new teeing() methods that takes two downstream collectors and can merge the result of
 *             those two downstream collectors by using a merge class we can provide.
 *
 *             Predicate<Integer> predicate = x -> Integer.parseInt(x.toString()) > 10;
 *             Result res = Stream.of(5,10,8,20,7,15,18).collect(Collectors.teeing(Collectors.counting(),
 *                 Collectors.filtering(predicate, Collectors.toList()), Result::new));
 *
 *              System.out.println(res);
 *
 *              Result{count=7, filtered=[20, 15, 18]}
 *
 *      -> Switch Expressions
 *          -> We will see later on
 *
 *  ---------------------------------------------------------------------------------------------------------------
 */

public class Java12Features {

    public static void main(String[] args) {
        // UNICODE CHARS in JAVA 11
        System.out.println("\u265A");
        System.out.println("\u265B");

        System.out.println("\u2654");
        System.out.println("\u2655");
    }
}
