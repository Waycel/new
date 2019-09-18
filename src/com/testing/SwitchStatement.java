package com.testing;

public class SwitchStatement {
    public static void main(String [] args) {
        int month = 7;
        String montString = "";
        switch (month) {
            case 1 : montString= "January";
            break;
            case 2: montString="February";
            break;
            case 3: montString = "March";
            break;
            case 4: montString= "April";
            break;
            case 5: montString= "May";
            break;
            case 6: montString= "June";
            break;
            case 7: montString= "July";
            break;
            case 8: montString= "August";
            break;
            case 9: montString= "September";
            break;
            case 10: montString= "October";
            break;
            case 11: montString= "November";
            break;
            case 12: montString= "December";
            break;
            default:
                System.out.println("Invalid");
                break;

        }
        System.out.println(montString);

    }
}
