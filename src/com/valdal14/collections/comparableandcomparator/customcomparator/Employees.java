package com.valdal14.collections.comparableandcomparator.customcomparator;

public class Employees implements Comparable<Employees> {

    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Employees(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "ID: " + this.getId() + " - Name: " + this.getName();
    }

    @Override
    public int compareTo(Employees employees) {
        Integer id1 = this.getId();
        Integer id2 = employees.getId();
        if(id1 < id2){
            return -1;
        } else if (id1 > id2) {
            return 1;
        } else {
            return 0;
        }
    }
}
