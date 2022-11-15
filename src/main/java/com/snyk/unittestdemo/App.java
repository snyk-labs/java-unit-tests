package com.snyk.unittestdemo;

public class App 
{
    public static void main( String[] args )
    {
        try {
            System.out.println(generateUpdateUserFirstNameStatement("John", "abcdef1234567"));
        }
        catch (Error e){
            e.printStackTrace();
        }
    }

    public static String generateUpdateUserFirstNameStatement(String firstName, String userId) throws Error{
        if(userId.contains(";") || firstName.contains(";")){
            throw new Error("parameters may contain SQL injection");
        }
        return "UPDATE TABLE user SET first_name = '" + firstName + "' WHERE user_id = '" + userId +"';" ;
    }
}
