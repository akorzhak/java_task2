/*
 * Model
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

import java.util.Random;

public class Model {
	private int searchedValue;
	private int guessedValue;
	int from = 0;
	int to = 100;

	public void setSearchedValue() {
	    Random rand = new Random();
		searchedValue = rand.nextInt(100);
	}

	public int getSearcedValue() {
		return searchedValue;
	}

	public void setGuessedValue(int guessedValue) {
		this.guessedValue = guessedValue;
	}

	public int getGuessedValue() {
		return guessedValue;
	}

	public boolean checkGuessedValue() {
		return searchedValue == guessedValue;
	}

	public boolean isSearchedValueBigger() {
		return searchedValue > guessedValue;
	}
}
