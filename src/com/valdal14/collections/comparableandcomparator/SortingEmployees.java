package com.valdal14.collections.comparableandcomparator;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class SortingEmployees implements Comparable<SortingEmployees> {

    private int id;
    private String name;

    // wrap-in into an Integer
    public int getId() {
        return (Integer) id;
    }

    public SortingEmployees(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee " + this.name + " ID: " + this.getId();
    }

    @Override
    public int compareTo(SortingEmployees sortingEmployees) {
        Integer empOneId = this.id;
        Integer empTwoId = sortingEmployees.getId();

        if(empOneId < empTwoId){
            return -1;
        } else if (empOneId > empTwoId) {
            return 1;
        } else {
            return 0;
        }
    }
}

class Demo {
    public static void main(String[] args) {
        System.out.println("--- COMPARATOR WITH EMPLOYEES ID ---");

        Set<SortingEmployees> treeEmpsComparator = new TreeSet<>(new Comparator<SortingEmployees>() {
            @Override
            public int compare(SortingEmployees employee, SortingEmployees t1) {
                Integer empOneId = employee.getId();
                Integer empTwoId = t1.getId();
                return empTwoId.compareTo(empOneId);
            }
        });

        treeEmpsComparator.add(new SortingEmployees(14, "Valerio"));
        treeEmpsComparator.add(new SortingEmployees(8, "Grazia"));
        treeEmpsComparator.add(new SortingEmployees(19, "Leonor"));

        System.out.println(treeEmpsComparator);
        // [Employee Leonor ID: 19, Employee Valerio ID: 14, Employee Grazia ID: 8]

        System.out.println("--- COMPARABLE WITH EMPLOYEES ID ---");

        Set<SortingEmployees> treeEmpsComparable = new TreeSet<>();

        treeEmpsComparable.add(new SortingEmployees(14, "Valerio"));
        treeEmpsComparable.add(new SortingEmployees(8, "Grazia"));
        treeEmpsComparable.add(new SortingEmployees(19, "Leonor"));

        System.out.println(treeEmpsComparable);
        // [Employee Grazia ID: 8, Employee Valerio ID: 14, Employee Leonor ID: 19]
    }
}