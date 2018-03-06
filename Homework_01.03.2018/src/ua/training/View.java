/*
 * View
 *
 * Description: This source file is a part of Java game program,
 * that generates a random integer. Then prompts a user to guess
 * the value by giving certain hints and guides.
 * 
 * By: Alyona Korzhakova 
 *
 * Created: 2018/03/01
 * 
 * Updated: 2018/03/06
 */
package ua.training.task2;

import java.util.ArrayList;

public class View {

    public static final String START_THE_GAME = "The game is now started!\n";
    public static final String SET_RANGE_BOUNDS = "Set the range bounds"
            + " for searched number.";
    public static final String SET_LOWER_BOUND = "Input INT value for"
            + " LOWER bound of searched number.";
    public static final String SET_UPPER_BOUND = "Input INT value for"
            + " UPPER bound of searched number.";
    public static final String WRONG_BOUNDS = "WRONG bounds! UPPER bound"
            + " has to be at least 5 greater then the LOWER! ";      
    public static final String INPUT_INT_VALUE = "Input INT value from ";
    public static final String WRONG_INPUT_DATA = "WRONG input! Repeat please! ";
    public static final String VALUE_OUT_OF_SCOPE = "WRONG input! " +
            "Value OUT OF SCOPE! Repeat please! ";
    public static final String YOUR_VALUE = "Your value = ";
    public static final String SUCCESS = "SUCCESS! ";
    public static final String FAIL = "FAIL! Try arain! ";
    public static final String SEARCHED_VALUE_BIGGER = "The searched value is BIGGER. ";
    public static final String SEARCHED_VALUE_SMALLER = "The searched value is SMALLER. ";
    public static final String STATISTICS = "\nThe number of RETRIES is: ";

    public void printMessage(String message) {
        System.out.println(message);
    }

    public void printStatistic(ArrayList<Statistic> statistic) {

        for (Statistic i : statistic) {
            printMessage("guessed value: " + i.getGuess() + "   Range: ("
                        + i.getMin() + ", " + i.getMax() + ")");
        }
    }
}
