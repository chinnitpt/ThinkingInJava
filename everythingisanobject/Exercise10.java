/*
Write a program that prints three arguments taken from the command line. To do this, you’ll need to index into the
command-line array of Strings.
*/
package everythingisanobject;

/**
 * Created with IntelliJ IDEA.
 * User: sukumar
 * Date: 9/27/13
 * Time: 8:27 PM
 * To change this template use File | Settings | File Templates.
 */
public class Exercise10 {

    public static void main(String[] args)
    {
        String arg1 = args[0];
        String arg2 = args[1];
        String arg3 = args[2];

        System.out.println("Argument 1:" + arg1);
        System.out.println("Argument 2:" + arg2);
        System.out.println("Argument 3:" + arg3);


    }
}
