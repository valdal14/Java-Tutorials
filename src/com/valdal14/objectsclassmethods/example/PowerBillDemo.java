package com.valdal14.objectsclassmethods.example;

public class PowerBillDemo {

    public static void main(String[] args) {
        PowerBills powerBillsOne = new PowerBills(123400, "Val", "Main Street 01");
        PowerBills powerBillsTwo = new PowerBills(123501, "Lefemas", "Main Street 11");
        PowerBills powerBillsDuplicate = new PowerBills(123400, "Val", "Main Street 01");

        // toString
        System.out.println(powerBillsOne);
        // The customer with firstname: Val and location: Main Street 01 has a meter number equals to: 123400

        // hashCode
        System.out.println(powerBillsOne.hashCode()); // 123400
        System.out.println(powerBillsDuplicate.hashCode()); // 123400
        System.out.println(powerBillsTwo.hashCode()); // 123501

        // equals
        System.out.println(powerBillsDuplicate.equals(powerBillsOne)); // true
        System.out.println(powerBillsOne.equals(powerBillsTwo)); // false

    }
}
