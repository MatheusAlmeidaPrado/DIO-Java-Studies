public class Operators {

    public static void main(String[] args) throws Exception {

        System.out.println("Let's test some stuff!");
        
        testConcatenation();
        testInvertBoolean();
        testNumericalSignChange();
        testQuickSumSub();
    }

    public static void testConcatenation() {

        /*
        ::Summing and Concatenation in a String::
        Use (+) to Concat or Sum. The system stops summing once it notices a text value (Unless you use parentheses).
        Run on Debug to check it out!
        */

        String concat = "I wonder what will happen?"; 

        concat = 1+1+1+"1";
        System.out.println(concat); //31

        concat = 1+"1"+1+1;
        System.out.println(concat); //1111

        concat = "1"+1+1+1;
        System.out.println(concat); //1111

        concat = "1"+(1+1+1);
        System.out.println(concat); //13
    }

    public static void testNumericalSignChange() {

        /*
        ::Alternating between Positives and Negatives::
        Use the (-) operator to change between the positive and negative "versions" of a number.
        Run on Debug to check it out!
        */
        int number = 5;
        System.out.println(- number);   // -5, but the variable value is intact
        System.out.println(number);     // 5, actual value
        number = - number;
        System.out.println(- number);   // 5, but the variable value is intact
        System.out.println(number);     //-5, actual value
        number = - number;
        System.out.println(number);     // 5, actual value
    }

    public static void testQuickSumSub() {

        /*
        ::Increasing and Decreasing values ​​quickly::
        Some tests with the (++) and (--) operators.
        Run on Debug to check it out!
        */
        int newNumber = 5;
        newNumber++;                    //Adds +1 to the variable
        System.out.println(newNumber);  //6
        newNumber--;                    //Substracts -1 from the variable
        System.out.println(newNumber);  //5

        System.out.println(newNumber--);  //5, Prints value and changes it after!
        System.out.println(newNumber);    //4
        System.out.println(--newNumber);  //3, Changes value and prints it after!
    }

    public static void testInvertBoolean() {

        /*
        ::Inverting Booleans::
        Use the (!) operator to invert the value of a boolean variable.
        Run on Debug to check it out!
        */
        boolean bobobo = true;
        System.out.println(bobobo);   //true
        System.out.println(!bobobo);  //false, but the variable value is intact

        bobobo = !bobobo;             //variable value inverted
        System.out.println(bobobo);   //false
    }
}