package com.valdal14.collections.comparableandcomparator.customcomparator;

import java.util.Comparator;

public class EmployeeNameComparator implements Comparator<Employees> {

    @Override
    public int compare(Employees employees, Employees t1) {
        Integer int1 = employees.getName().length();
        Integer int2 = t1.getName().length();
        return int2.compareTo(int1);
    }
}
