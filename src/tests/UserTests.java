package tests;

import model.User;

public class UserTests {
    public static void main(String[] args) {

        //manual testing

        //User testUser = new User("konradg",  "pass123", "Konrad", "Gajdus", "07945674356");
        //System.out.println(testUser.toString());

        //automated testing using "if"


        //field declaration
        String test_username = "garethb";
        String test_password = "pass123";
        String test_first_name = "Gareth";
        String test_last_name = "Bolton";
        String test_mobile_number = "07567834437";

        //creating user object
        User testUser = new User(test_username, test_password, test_first_name, test_last_name, test_mobile_number);
        System.out.println(testUser.toString());

        //assertion tests
        Boolean passed = true;

        if(testUser.getUsername() != test_username){
            System.out.println("TC01 failed: Username did not match.");
            passed = false;
        }

        if(testUser.getPassword() != test_password){
            System.out.println("TC02 failed: Password did not match.");
            passed = false;
        }

        if(testUser.getFirst_name() != test_first_name){
            System.out.println("TC03 failed: First name did not match.");
            passed = false;
        }

        if(testUser.getLast_name() != test_last_name){
            System.out.println("TC04 failed: Last name did not match.");
            passed = false;
        }

        if(testUser.getMobile_number() != test_mobile_number){
            System.out.println("TC05 failed: Mobile number did not match.");
            passed = false;
        }

        if(passed){
            System.out.println("ALl TCs Passsed.");
        }
        else {
            System.out.println("One or more TCs failed.");
        }

        //using assertions

        assert testUser.getUsername() == test_username;
        assert testUser.getPassword() == test_password;
        assert testUser.getFirst_name() == test_first_name;
        assert testUser.getLast_name() == test_last_name;
        assert testUser.getMobile_number() == test_mobile_number;

        System.out.println("All Java assertions in the test suite passed (none failed).");

    }
}