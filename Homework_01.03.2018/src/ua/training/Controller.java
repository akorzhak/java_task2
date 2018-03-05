/*
 * Controller
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

import java.util.Scanner;

public class Controller {
	private Model model;
	private View view;
	private int retry;

	//Constructor
	public Controller(Model model, View view) {
		this.model = model;
		this.view = view;
	}

	//Work method
	public void processUser() {
		Scanner sc = new Scanner(System.in);

		view.printMessage(View.START_THE_GAME);

		setRangeBounds(sc);

		model.setSearchedValue();

		do {
			model.setGuessedValue(inputIntValue(sc));

			view.printMessage(View.YOUR_VALUE + model.getGuessedValue());

			if (model.checkGuessedValue()) {
				handleSuccessCase();
			} else {
				handleFailCase();
			}
			retry++;
		} while ( ! model.checkGuessedValue());
	}

	private void setRangeBounds(Scanner sc) {

		int lower;
		int upper;

		view.printMessage(View.SET_RANGE_BOUNDS);
		
		do {
			view.printMessage(View.SET_LOWER_BOUND);
			while ( ! sc.hasNextInt()) {
				view.printMessage(View.WRONG_INPUT_DATA + View.SET_LOWER_BOUND);
				sc.next();
			}
			lower = sc.nextInt();

			view.printMessage(View.SET_UPPER_BOUND);
			while ( ! sc.hasNextInt()) {
				view.printMessage(View.WRONG_INPUT_DATA + View.SET_UPPER_BOUND);
				sc.next();
			}
			upper = sc.nextInt();
			if (upper - lower < 5)
				view.printMessage(View.WRONG_BOUNDS);
		} while (upper - lower < 5);

		model.from = lower;
		model.to = upper;
	}

	private int inputIntValue(Scanner sc) {

		int nb;

		view.printMessage(View.INPUT_INT_VALUE + model.from +
			             " to " + model.to + " = ");
		do {
			while ( ! sc.hasNextInt()) {
				view.printMessage(View.WRONG_INPUT_DATA + View.INPUT_INT_VALUE
			                 + model.from + " to " + model.to + " = ");
				sc.next();
			}
			nb = sc.nextInt();

			if (nb <= model.from || nb >= model.to)
				view.printMessage(View.VALUE_OUT_OF_SCOPE);
		} while (nb <= model.from || nb >= model.to);
		return (nb);
	}	

	private void handleSuccessCase() {
		
		view.printMessage(View.SUCCESS);
		view.printMessage(View.STATISTICS + retry);
	}

	private void handleFailCase() {
		
		view.printMessage(View.FAIL);

		if (model.isSearchedValueBigger()) {
			view.printMessage(View.SEARCHED_VALUE_BIGGER);
			model.from = model.getGuessedValue();
		} else {
			view.printMessage(View.SEARCHED_VALUE_SMALLER);
			model.to = model.getGuessedValue();
		}
	}
}
