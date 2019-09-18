package com.testing;

public class VariableScopes {
    public static void main(String[] args) {
        int variable1= 18;
        int variable2= 10;
        int variable3;
        if(11==11) {
            variable3=33;
            System.out.println(variable3);
        }
        System.out.println(variable1+variable2);

    }
}
