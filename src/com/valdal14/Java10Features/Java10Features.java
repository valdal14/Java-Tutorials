package com.valdal14.Java10Features;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 *  JAVA 10 FEATURES ----------------------------------------------------------------------------------------------
 *
 *      -> VAR keyword to declare variables:
 *          -> var itself is not a keywork in Java
 *              --> var var = 14; // it's valida code
 *          -> Var are useful when working with big collections
 *              --> var newMap = new HashMap<String, List<String>>();
 *          -> var restrictions:
 *              --> we cannot assign a null value to a var
 *              --> When working with Lambda expression we have to specify the exact type when assigning the
 *                  lambda expression to a particular variable.
 *
 *                  I.E: var newSum = (a, b) -> a + b;
 *
 *              --> We cannot use var to define class variables.
 *              --> if we use a var and we do not specify the type with a collection it will be Generic
 *
 *                   var myNewVarList = new HashMap<>();
 *                   myNewVarList.put("", 123);
 *                   myNewVarList.put(123, true);
 *
 *      -> Collectors APIs: (Streaming on Collections)
 *          -->We can now create immutable lists, and so on
 *  ---------------------------------------------------------------------------------------------------------------
 */

public class Java10Features {

    // No class variables allowed
    // var newVar = 12;

    public static void main(String[] args) {
        // VAR
        var var = 12.4;

        // This is a normal way of declaring a Map
        Map<String, List<String>> map = new HashMap<>();
        // We can replace it with var
        var newMap = new HashMap<String, List<String>>();

        for (Map.Entry<String, List<String>> entry : newMap.entrySet()) {
            List<String> value = entry.getValue();
        }

        // We can also replaced it with var
        for (var entry : newMap.entrySet()) {
            var value = entry.getValue();
        }

        // var are limited with lambda
        Summable sum = (a, b) -> a + b;
        // we cannot do like so
        //var newSum = (a, b) -> a + b;

        // if we use a var and we do not specify the type with a collection it will be Generic
        var myNewVarList = new HashMap<>();
        myNewVarList.put("", 123);
        myNewVarList.put(123, true);

        // COLLECTORS API ----------------------------------------------------------------------------
        List<Integer> list = List.of(15, 27, 30);
        List<Integer> listFiltered = list.stream().filter(x -> x % 3 == 0).collect(Collectors.toList());
        listFiltered.add(13);

        System.out.println(listFiltered);

        // Now we can use of toUnmodifiableList() inside the Collector to make immutable
        List<Integer> listFilteredImmutable = list.stream().filter(x -> x % 3 == 0).collect(Collectors.toUnmodifiableList());
        // listFilteredImmutable.add(12); this will throw an UnsupportedOperationException at runtime

        System.out.println(listFilteredImmutable);

        // -------------------------------------------------------------------------------------------

    }
}

@FunctionalInterface
interface Summable {
    Integer sum(Integer a, Integer b);
}
