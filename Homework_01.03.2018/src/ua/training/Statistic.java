/*
 * Statistic
 *
 * Description: This source file is a part of Java game program,
 * that generates a random integer. Then prompts a user to guess
 * the value by giving certain hints and guides.
 * 
 * By: Alyona Korzhakova 
 *
 * Created: 2018/03/06
 * 
 * Updated: 2018/03/06
 */
package ua.training.task2;

public class Statistic {

    private int guess;
    private int min;
    private int max;

    public Statistic(int guess, int min, int max) {
        this.guess = guess;
        this.min = min;
        this.max = max;
    }

    public void setGuess(int guess) {
        this.guess = guess;
    }

    public int getGuess() {

        return guess;
    }
    
    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }
}
