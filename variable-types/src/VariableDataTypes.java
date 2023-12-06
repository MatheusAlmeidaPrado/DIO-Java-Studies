public class VariableDataTypes {

    public static void main(String[] args) {
        
        /***  Primitive Data types  ***/

        boolean myBool = true;    // Stores true or false values.

        char myCharacter1 = 'y';  // Stores a single character/letter or ASCII values.
        char myCharacter2 = 111;  //'o' in ASCII.

        //Whole Numbers:
        byte myByte = 127;                  // Stores whole numbers from -128 to 127.
        short myShort = 32767;              // Stores whole numbers from -32,768 to 32,767.
        int myInteger = 2147483647;         // 	Stores whole numbers from -2,147,483,648 to 2,147,483,647.
        long myLong = 9223372036854775807L; // Stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807.

        //Fractional Numbers:
        float myFloat = 9.999999F;          // Sufficient for storing 6 to 7 decimal digits. Range: 1.40239846e-45f to 3.40282347e+38f.
        double myDouble = 9.99999999999999; // Sufficient for storing 15 decimal digits. Range: 4.94065645841246544e-324 to 1.79769313486231570e+308.
        

        
        // Run it to see how the values get printed:
        System.out.println("Boolean: " + myBool);
        System.out.println("Characters: " + myCharacter1 + myCharacter2);
        System.out.println("Byte: " + myByte);
        System.out.println("Short: " + myShort);
        System.out.println("Integer: " + myInteger);
        System.out.println("Long: " + myLong);
        System.out.println("Float: " + myFloat);
        System.out.println("Double: " + myDouble);
        System.out.println("DONE");
    }
}
