package com.valdal14.collections.comparableandcomparator.customcomparator;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class DemoCustomComparatorClass {
    public static void main(String[] args) {

        System.out.println("--- COMPARABLE INSIDE Employees CLASS ---");
        // Comparator inside the Employees class sort by ID
        Set<Employees> empsTreeSet = new TreeSet<>();
        empsTreeSet.add(new Employees(14, "Val"));
        empsTreeSet.add(new Employees(8, "Grazia"));
        empsTreeSet.add(new Employees(19, "Leo"));

        System.out.println(empsTreeSet);
        // [ID: 8 - Name: Grazia, ID: 14 - Name: Val, ID: 19 - Name: Leo]

        System.out.println("--- COMPARABLE INSIDE Employees CLASS ---");
        Set<Employees> newEmpSet = new TreeSet<>(new EmployeeNameComparator());
        newEmpSet.add(new Employees(14, "Val"));
        newEmpSet.add(new Employees(8, "Grazietta"));
        newEmpSet.add(new Employees(19, "Leonor"));
        // [ID: 8 - Name: Grazietta, ID: 19 - Name: Leonor, ID: 14 - Name: Val]

        System.out.println(newEmpSet);
    }
}
