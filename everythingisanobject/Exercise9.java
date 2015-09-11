/*Write a program that demonstrates that autoboxing works for all the primitive types and their wrappers.*/

package everythingisanobject;

/**
 * Created with IntelliJ IDEA.
 * User: sukumar
 * Date: 9/26/13
 * Time: 9:35 PM
 * To change this template use File | Settings | File Templates.
 */
public class Exercise9 {
    public static void main(String[] args)
    {
        byte bytePrimitive = 8;              //8 bits  -2^7 to 2^7-1
        Byte byteObject = bytePrimitive;
        System.out.println(byteObject);

        char charPrimitive = 'A';    //16 bits       Unicode 0 - Unicode 2^16-1
        Character charObject = charPrimitive;
        System.out.println(charObject);


        boolean boolPrimitive = false;
        Boolean boolObject = boolPrimitive;
        System.out.println(boolObject);

        int intPrimitive = 10;      //32 bits     -2^31 to 2^31-1
        Integer intObject = intPrimitive;
        System.out.println(intObject);

        short shortPrimitive = 35;       //16 bits    -2^15 to 2^15-1
        Short shortObject  = shortPrimitive;
        System.out.println(shortObject);

        double doublePrimitive = 12.3456;     //64 bits     -2^63 to 2^63-1
        Double doubleObject = doublePrimitive;
        System.out.println(doublePrimitive);

        float floatPrimitive = 34.5f;      //32 bits        IEEE754 to IEEE754
        Float floatObject = floatPrimitive;
        System.out.println(floatObject);

        long longPrimitive = 28374l;        //64 bits       IEEE754 to IEEE754
        Long longObject =    longPrimitive;
        System.out.println(longObject);
    }
}
