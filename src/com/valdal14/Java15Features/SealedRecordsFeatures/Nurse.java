package com.valdal14.Java15Features.SealedRecordsFeatures;

public record Nurse(String name, @NurseAnnotation String role) implements Employees {

    public String specializedNurse(){
        record newSpecializedNurse(String name){

            public String describeRole(){
                System.out.println("This is a specialized Nurse");
                return this.name;
            }
        }

        return new newSpecializedNurse(this.name).describeRole();
    }
}
