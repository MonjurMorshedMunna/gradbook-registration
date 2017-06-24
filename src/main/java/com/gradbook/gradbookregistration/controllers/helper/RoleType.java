package com.gradbook.gradbookregistration.controllers.helper;

/**
 * Created by Munna on 24-Jun-17.
 */
public enum RoleType {

    USER(1),
    ADMIN(2);

    private int numVal;

    RoleType(int numVal){
        this.numVal = numVal;
    }

    public int getValue(){
        return numVal;
    }

}
