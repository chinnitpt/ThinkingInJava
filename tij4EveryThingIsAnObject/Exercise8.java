/**
 * Write a program that demonstrates that, no matter how many objects you create of a particular class, there is only
 * one instance of a particular static field in that class.
 */

package tij4EveryThingIsAnObject;

/**
 * User: sukumar
 * Date: 8/8/13
 * Time: 9:44 PM
 * To change this template use File | Settings | File Templates.
 */
class Exercise8 {
    static int i = 10;

    public static void main(String[] args) {
        Exercise8 e8_1 = new Exercise8();
        System.out.println("Static Variable accessed using object 1: " + e8_1.i);
        e8_1.i++;
        System.out.println("Value after incrementing the static variable accessed using object 1: " +  e8_1.i);

        Exercise8 e8_2 = new Exercise8();
        System.out.println("Static Variable accessed using object 2: " + e8_2.i);

    }

}
