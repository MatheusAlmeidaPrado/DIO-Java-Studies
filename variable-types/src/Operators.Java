public class Operators {

    public static void main(String[] args) throws Exception {

        System.out.println("Let's test some stuff!");
        
        testConcatenation();

        testInvertBoolean();

        testNumericalSignChange();

        testQuickSumSub();

        testTernaryOperator();

        testRelationalOperators();
    }

    public static void testConcatenation() {

        /*
        :: Summing and Concatenation in a String ::
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
        :: Alternating between Positives and Negatives ::
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
        :: Increasing and Decreasing values ​​quickly ::
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
        :: Inverting Booleans ::
        Use the (!) operator to invert the value of a boolean variable.
        Run on Debug to check it out!
        */
        boolean bobobo = true;
        System.out.println(bobobo);   //true
        System.out.println(!bobobo);  //false, but the variable value is intact

        bobobo = !bobobo;             //variable value inverted
        System.out.println(bobobo);   //false
    }

    public static void testTernaryOperator() {

        /*
        :: The Ternary Operator ::
        Use (?) to simulate an "if" scenario and (:) to separate the possible outcomes.
        The first outcome (after '?' and before the ':') is triggered if the scenario is true
        and the second (after the ':') is triggered is the scenario is false.
        Run on Debug to check it out!
        */
        int a = 5;
        int b = 6;

        String result1 = a==b ? "A and B are the same!" : "A and B are different!";
        int result2 = a+b==11 ? 1 : 0;

        System.out.println(result1);     //"diferent", since A and B don't have the same value 
        System.out.println(result2);     //1, since A+B is equal to 11
    }

    public static void testRelationalOperators() {

        /*
        :: Relational Operators ::
        These are simples operators that work as they do in normal mathematical operations.
        They are primarly used to compare aspects between two given values.
        * ==    Equal to
        * !=    Different than
        * >     Bigger than
        * >=    Bigger than or Equal to 
        * <     Smaller than
        * <=    Smaller than or Equal to
        Run on Debug to check it out!
        */
        int a = 1;
        int b = 3;
        int c = -7;
        double d = 1.1;
        //String f = "1";           [This is used in a note bellow]
        String to1 = "tomato";
        String to2 = "tomato ";
        String yesNo;

        yesNo = a+b==5 ? "Yes!" : "No!";
        System.out.println("Does 1 + 3 = 5 ?  " + yesNo);                       //No!
        yesNo = a!=d ? "Yes!" : "No!";
        System.out.println("Is 1 different than 1.1 ?  " + yesNo);              //Yes!
        yesNo = b>c ? "Yes!" : "No!";
        System.out.println("Is 3 bigger than -7 ?  " + yesNo);                  //Yes!
        yesNo = d<=c ? "Yes!" : "No!";
        System.out.println("Is 1.1 smaller than or equal to -7 ?  " + yesNo);   //No!
        yesNo = to1==to2 ? "Yes!" : "No!";
        System.out.println("Is 'tomato' equal to 'tomato '?  " + yesNo);        //No!, because of the space after the word
        
        /*
        The line bellow won't even run. You can't compare a Number to a Text.
        yesNo = a==f ? "Yes!" : "No!";
        */
    }

    public static void testLogicalOperators() {

        /*
        :: Logical Operators ::
        They allow the creation of bigger logical operations by joining two or more different logical operations.
        * &&    "AND"
        * ||    "OR"
        Run on Debug to check it out!
        */
        boolean condition1 = true;
        boolean condition2 = 1+1==5; //false

        if (condition1 && condition2) {      //Won't run since one condition is false
            System.out.println("Both conditions are true!");
        }
        if (condition1 || condition2) {      //Will run since condition1 is true
            System.out.println("At least one condition is true!");
        }
        /*
        if (11+11==22 && 32>23) {           //*Will always run since both conditions will always be true
            System.out.println("Both conditions are true!");
        }
        if (1+2==2 || 22+3!=25) {           //*Won't run since both conditions will always be false (Dead Code)
            System.out.println("At least one condition is true!");
        }
        */
    }
}