package com.valdal14.Java15Features.SealedRecordsFeatures;

public record Doctor(String name, @DocAnnotation String role) implements Employees {

    public String getRoleInfo(String role){

        String res = switch (role){
            case "surgeon":{
                yield this.name + " surgeon is a " + role;
            }
            default:
                yield this.name + " doctor is a " + role;
        };

        return res;
    }
}
