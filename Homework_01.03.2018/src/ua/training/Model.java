/*
 * Model
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

public class Model {

	int from;
	int to;
	private int searchedValue;
	private int guessedValue;


	public void setSearchedValue() {
	    int min = from + 1;
	    int max = to;
		searchedValue = (int) (Math.random() * (max - min) + min);
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
