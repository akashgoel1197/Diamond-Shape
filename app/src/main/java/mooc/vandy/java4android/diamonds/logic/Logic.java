package mooc.vandy.java4android.diamonds.logic;

import android.util.Log;
import mooc.vandy.java4android.diamonds.ui.OutputInterface;

/**
 * This is where the logic of this App is centralized for this assignment.
 * <p>
 * The assignments are designed this way to simplify your early
 * Android interactions.  Designing the assignments this way allows
 * you to first learn key 'Java' features without having to beforehand
 * learn the complexities of Android.
 */
public class Logic
       implements LogicInterface {
    /**
     * This is a String to be used in Logging (if/when you decide you 
     * need it for debugging).
     */
    public static final String TAG = Logic.class.getName();

    /**
     * This is the variable that stores our OutputInterface instance.
     * <p>
     * This is how we will interact with the User Interface [MainActivity.java].
     * <p>
     * It is called 'out' because it is where we 'out-put' our
     * results. (It is also the 'in-put' from where we get values
     * from, but it only needs 1 name, and 'out' is good enough).
     */
    private OutputInterface mOut;

    /**
     * This is the constructor of this class.
     * <p>
     * It assigns the passed in [MainActivity] instance (which
     * implements [OutputInterface]) to 'out'.
     */
    public Logic(OutputInterface out){
        mOut = out;
    }

    /**
     * This is the method that will (eventually) get called when the
     * on-screen button labeled 'Process...' is pressed.
     */
    public void process(int size) {

        // TODO -- add your code here

        //printing the top border
        mOut.print('+');
        for(int i = 0; i<2*size; i++)
            mOut.print('-');
        mOut.println('+');

        //printing upper triangle
        for(int i = 0; i<size-1; i++){
            mOut.print('|');

            for(int j = 0; j<size-1-i; j++)
                mOut.print(' ');

            mOut.print('/');
            if(i%2 == 0){
                for(int j = 0; j<2*i; j++)
                    mOut.print('=');
            }
            else{
                for(int j = 0; j<2*i; j++)
                    mOut.print('-');
            }
            mOut.print('\\');

            for(int j = 0; j<size-1-i; j++)
                mOut.print(' ');

            mOut.println('|');
        }

        //printing middle line
        mOut.print('|');
        mOut.print('<');
        if(size%2 == 0){
            for(int i = 0; i<2*size-2; i++)
                mOut.print('-');
        }
        else{
            for(int i = 0; i<2*size-2; i++)
                mOut.print('=');
        }
        mOut.print('>');
        mOut.println('|');

        //printing lower triangle
        for(int i = 0; i<size-1; i++){
            mOut.print('|');

            for(int j = 0; j<i+1; j++)
                mOut.print(' ');

            mOut.print('\\');
            if(size%2 == 0) {
                if (i % 2 == 0) {
                    for (int j = 0; j < 2*size - 2*i-4; j++)
                        mOut.print('=');
                } else {
                    for (int j = 0; j < 2*size - 2*i-4; j++)
                        mOut.print('-');
                }
            }
            else{
                if (i % 2 == 0) {
                    for (int j = 0; j < 2*size - 2*i-4; j++)
                        mOut.print('-');
                } else {
                    for (int j = 0; j < 2*size - 2*i-4; j++)
                        mOut.print('=');
                }
            }
            mOut.print('/');

            for(int j = 0; j<i+1; j++)
                mOut.print(' ');

            mOut.println('|');
        }

        //printing bottom border
        mOut.print('+');
        for(int i = 0; i<2*size; i++)
            mOut.print('-');
        mOut.print('+');

    }

}
