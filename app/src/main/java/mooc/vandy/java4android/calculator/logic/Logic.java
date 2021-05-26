package mooc.vandy.java4android.calculator.logic;

import java.util.HashMap;

import mooc.vandy.java4android.calculator.ui.ActivityInterface;

/**
 * Performs an operation selected by the user.
 */
public class Logic implements LogicInterface {
    /**
     * Reference to the Activity output.
     */
    protected ActivityInterface mOut;

    
    /**
     * Constructor initializes the field.
     */
    public Logic(ActivityInterface out) {
        mOut = out;
        
    }
    private static final int ADDITION = 1;
    private static final int SUBTRACTION = 2;
    private static final int MULTIPLICATION = 3;
    private static final int DIVISION = 4;

    

    /**
     * Perform the operation on argumentOne and argumentTwo.
     */
    public void process(int argumentOne, int argumentTwo, int operation) {
        switch (operation) {
            case ADDITION: Add addition = new Add();
                addition.add(argumentOne, argumentTwo);
                mOut.print(addition.getResultString());
                break;

            case SUBTRACTION: Subtract subtraction = new Subtract();
                subtraction.subtract(argumentOne, argumentTwo);
                mOut.print(subtraction.getResultString());
                break;

            case MULTIPLICATION: Multiply multiplication = new Multiply();
                multiplication.multiply(argumentOne, argumentTwo);
                mOut.print(multiplication.getResultString());
                break;

            default: Divide division = new Divide();
                division.divide(argumentOne, argumentTwo);
                mOut.print(division.getResultString());

        }
        // TODO - Put your code here.
        
    }
}
