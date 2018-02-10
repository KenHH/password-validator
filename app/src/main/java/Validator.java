/**
 * Created by Ken H on 2018-02-09.
 */

public class Validator {

    int validate(String inputPassW){
        int countPassedRules = 0;  //  A counter for correct rules

        if (!inputPassW.equals( "password" ))   // Check to make sure password is not "password"
            countPassedRules++;
        if( inputPassW.length() >= 8 )           //Check if length of password is >= 8
            countPassedRules++;

        System.out.print(countPassedRules);     //Prints out the amount of passed Rules

        return countPassedRules;


    }
}
