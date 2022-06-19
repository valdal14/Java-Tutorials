package com.valdal14.Java15Features.SealedRecordsFeatures;

public class RecordsFeatures {

    public static void main(String[] args) {

        Doctor doc = new Doctor("Mario", "surgeon");
        Nurse nurse = new Nurse("Maria", "generic nurse");

        System.out.println(doc.getRoleInfo(doc.role()));

        System.out.println(nurse.specializedNurse());
    }
}
