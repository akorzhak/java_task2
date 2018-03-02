/*
 * View
 *
 * Description: This source file is a part of Java game program,
 * that generates a random integer. Then prompts a user to guess
 * the value by giving certain hints and guides.
 * 
 * Created by: Alyona Korzhakova 
 *
 * Date: 2018/03/01
 */
package ua.training.task2;

public class View {

	public static final String START_THE_GAME = "The game is now started!\n" +
            "You have unlimited number of attempts to guess a number. ";
    public static final String INPUT_INT_VALUE = "Input INT value from ";
    public static final String WRONG_INPUT_DATA = "Wrong input! Repeat please! ";
    public static final String YOUR_VALUE = "Your value = ";
    public static final String SUCCESS = "SUCCESS! ";
    public static final String FAIL = "FAIL! Try arain! ";
    public static final String SEARCHED_VALUE_BIGGER = "The searched value is bigger. ";
    public static final String SEARCHED_VALUE_SMALLER = "The searched value is smaller. ";
    public static final String STATISTICS = "The number of retries is: ";

    public void printMessage(String message) {
        System.out.println(message);
    }
}
