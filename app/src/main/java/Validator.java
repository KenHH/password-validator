/**
 * Created by Ken H on 2018-02-09.
 */

public class Validator {

    int validate(String inputPassW){
        int countPassedRules = 0;  //  A counter for correct rules

        boolean digit=false;
        boolean upCase=false;
        boolean lowCase=false;
        char ch;

        // Check if string contains atleast one uppercase/digit/lowercase and changes values to true if found.
        for(int i=0;i < inputPassW.length();i++) {
            ch = inputPassW.charAt(i);
            if( Character.isDigit(ch)) {
                digit = true;
            }
            else if (Character.isUpperCase(ch)) {
                upCase = true;
            }
            else if (Character.isLowerCase(ch)) {
                lowCase = true;
            }
        }
        if (!inputPassW.equals( "password" ))   // Check to make sure password is not "password"
            countPassedRules++;

        if ( inputPassW.length() >= 8 )           //Check if length of password is >= 8
            countPassedRules++;

        if ( upCase==true )                     //rule 1 extra
            countPassedRules++;

        if ( lowCase==true )                   //rule 2 extra
            countPassedRules++;

        if ( digit==true )                    //rule 3 extra
            countPassedRules++;

        System.out.print(countPassedRules);     //Prints out the amount of passed Rules

        return countPassedRules;


    }
}
