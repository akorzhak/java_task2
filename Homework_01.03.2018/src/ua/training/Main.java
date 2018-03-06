/*
 * Main
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

public class Main {
	public static void main(String[] args) {
		// Initialization
		Model model = new Model();
		View view = new View();
		Controller controller = new Controller(model, view);
		//Run
		controller.processUser();
	}
}
