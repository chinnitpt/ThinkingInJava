/*Write a program that demonstrates that autoboxing works for all the primitive types and their wrappers.*/

package tij4EveryThingIsAnObject;

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
        byte bytePrimitive = 8;              //8 bits
        Byte byteObject = bytePrimitive;
        System.out.println(byteObject);

        char charPrimitive = 'A';    //16 bits
        Character charObject = charPrimitive;
        System.out.println(charObject);


        boolean boolPrimitive = false;
        Boolean boolObject = boolPrimitive;
        System.out.println(boolObject);

        int intPrimitive = 10;      //32 bits     -2^31 to 2^31-1
        short shortPrimitive ;       //16 bits
        double doublePrimitive;     //64 bits

        float floatPrimitive;      //32 bits

        long longPrimitive;        //64 bits






    }
}
