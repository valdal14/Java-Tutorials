package com.valdal14.collections;

/**
 *  JAVA COLLECTIONS --------------------------------------------------------------------------------------
 *
 *  -> Unlike Arrays collection classes are dynamic. We do not need to crete a list of a fixed size
 *  -> java.util.Collection is the parent Interface for all of them
 *  -> List - Set - Queue implements it
 *  -> If we learn how to use List - Set - Queue the rest is simply runtime polymorphisms or
 *     Runtime or Dynamic Binding obtained by Method overriding
 *  -> As best practice is always preferred to use runtime polymorphisms to create collections
 *      --> List<Integer> intList = new ArrayList<>();
 *
 *  -> LISTS #############################################################################################
 *
 *      -> Lists allows duplicated objects
 *      -> Two keys implementations of the List class are:
 *          --> ArrayList
 *          --> LinkedList
 *
 *      -> Vector is a legacy class rarely used where all the methods are synchronized and performance is
 *         not very good
 *
 *  --> ArrayLists:
 *      -> uses array underline
 *      -> Accessing an array is very fast because we can use the index to get a value
 *      -> On the other hand, insertion and deletions is slow (except the end) because if we insert or delete
 *         and element it has to reshuffle the entire List
 *      -> By default its initial capacity is 10
 *      -> If we pass that capacity, the class will create another array and copy over all the elements
 *      -> Always a good practise to pass the size if we already know the capacity ArrayList(100);
 *
 *  --> LinkedLists:
 *      -> Ordered Collection
 *      -> Stores the elements in a form of nodes
 *      -> Each node has three fields:
 *          --> I.E: |null|1|next| |prev|2|next| |prev|3|null|
 *      -> A LinkedList is doubly-linked when each node knows about the previous and next node
 *          --> I,E: |null|1|next| -> <- |prev|2|next|  -> <- |prev|3|null|
 *      -> A great advantage of this DS is that Insertion and Deletion operations
 *      -> If I want to enter a value between two nodes we can simply switch the pointers
 *      -> Uses more memory of an ArrayList
 *      -> Slow random access and read operation is therefore slower compared to an Array or ArrayList
 *
 *  --> ListIterator:
 *      --> Allow us to traverse back and foward a List
 *
 *       List<String> list = new LinkedList<>();
 *         list.add("abc");
 *         list.add("def");
 *         list.add("xyz");
 *
 *         ListIterator<String> itr = list.listIterator();
 *
 *  ######################################################################################################
 *
 *  -> SETS ==============================================================================================
 *
 *      -> Sets do not allow duplicated objects
 *      -> HashSet is one of the implementation
 *          --> LinkedHashSet is a child of HashSet that maintains the order unlike the parent
 *      -> Set also has a child interface called SortedSet
 *          --> The SortedSet is implemented by TreeSet class
 *          --> The NavigableSet is the implementation of the SortedSet
 *          --> A TreeSet implements the NavigableSet
 *
 *  ->
 *  ======================================================================================================
 *
 *  QUEUES ###############################################################################################
 *
 *      -> FIFO Data Structure
 *      -> PriorityQueue is the class that implements the Interface Queue
 *      -> We can also use the LinkedList as Queue if needed since it also implements the Queue Interface
 *
 *  ######################################################################################################
 *
 *  MAPS =================================================================================================
 *
 *  -> java.util Package
 *  -> The Map interface is implemented by:
 *      --> HashMap
 *          ---> LinkedHashMap is a child class of HashMap and maintains the order
 *      --> Another child interface of the Map interface is SortedMap
 *          ---> TreeMap is the implementation class of the child interface SortedMap
 *   -> Another legacy class is Hashtable that implements the Map interface and all the method are synch
 *      and in multithreaded app it should not be used likewise the Vector class
 *  ======================================================================================================
 *  -------------------------------------------------------------------------------------------------------
 *
 * -> We can use Iterator with any collection
 *
 *  Iterator<Integer> it = set.iterator();
 *
 *         while (it.hasNext()){
 *             System.out.println(it.next());
 *             // using the iterator we can also remove the values
 *             it.remove();
 *         }
 *
 *  COMPARABLE AND COMPARATOR xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx
 *
 *  -> The COMPARABLE Interface is used to implement the sorting
 *  -> The COMPARATOR Interface is used to change/customize the sorting order for built-in classes or our own
 *  -> The String class and all the Wrapper classes already implement the COMPARABLE Interface obj.compareTo(obj2)
 *     Also the StringBuffer class implements it
 *
 *  -> When we add our object to our collection classes such as TreeSets or TreeMap (sorted collection) we
 *     need to provide a sorting implementation. Our class should implement the Comparable Interface and
 *     provide or override an implementation of the obj.compareTo(obj2) method.
 *
 *     --> We should return a -ve negative value if obj1 has to come before obj2.
 *     --> We should return a +ve positive value if obj1 has to come after obj2.
 *     --> We should return 0 if both obj1 and obj2 are the same
 *
 *  -> If we want to change the sorting order at some point we use COMPARATOR interface
 *     --> We implement the comparator interface by creating a custom COMPARATOR class
 *     --> And we will implement the method compare(obj1, obj2)
 *     --> We should return a -ve negative value if obj1 has to come before obj2.
 *     --> We should return a +ve positive value if obj1 has to come after obj2.
 *     --> We should return 0 if both obj1 and obj2 are the same
 *  xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx
 */

public class JavaCollections {

}
