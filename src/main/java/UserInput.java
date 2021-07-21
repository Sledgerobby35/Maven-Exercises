import org.apache.commons.lang3.StringUtils;

import javax.swing.*;
import java.util.Arrays;
import java.util.Scanner;

public class UserInput {

    public static void main(String[] args) {
        System.out.println("Enter something\n");
        String userInput = userInput();
        System.out.printf("You entered: %s\n", userInput);


        getInt(userInput);

        String swapCap = StringUtils.swapCase(userInput);
        System.out.println(swapCap);

       String reversedInput =  StringUtils.reverse(userInput);
        System.out.println(reversedInput + "\n");
    }


    public static String userInput(){
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }

    public static void getInt(String userInput){
        try{
            int input = Integer.parseInt(userInput);
            System.out.printf("\"%s\", is a number\n", userInput);
        } catch(NumberFormatException e){
            System.out.printf("\"%s\", is not a number\n", userInput);
        }
    }
    public static String changeCap(String userInput){
        String[] strList = userInput.split(" ");
        String result = "";
        for(String input: strList){
            String caps = input.substring(0,1).toLowerCase() + input.substring(1).toUpperCase();
            result += (caps + " ");
        }
        return result;
    }
}
