import java.util.Locale;
import java.util.Scanner;

public class AboutMe {

    public static void main(String[] args) {
        
        /*
        This class/method is made just to test the use and input of parameters in a method.

        Run on Debug to check it out!
        I've defined some default parameters for the first print block at launch.json.
        The second print block uses the user inputs to define the variables.

        (If you want to define the parameters for the first block yourself check launch.json
        or call the method in a Terminal!   Commands: cd bin; java AboutMe Matheus Almeida 22 5.9)
        */
        
        String nameParam = args[0];
        String surnameParam = args[1];
        int ageParam = Integer.valueOf(args[2]);         //Transforms the string into an integer before saving it in an integer variable.
        double heightParam = Double.valueOf(args[3]);    //Transforms the string into an double before saving it in a double variable.

        // Printing with the default/called parameters:
        System.out.println(" :Introduction using the default parameters: \n");
        System.out.println("Hello, my name is " + nameParam + " " + surnameParam + ".");
        System.out.println("I am " + ageParam + " years old.");
        System.out.println("I am " + heightParam + " feet tall.");


        Scanner scanner = new Scanner(System.in).useLocale(Locale.US); // Initiate the scanner for collecting inputs.
        

        // The following asks and stores the info about the user:
        System.out.println("\n :Insert your parameters:  \n");
        System.out.println("What is your first name? ");
        String nameInput = scanner.next();
        System.out.println("What is your surname? ");
        String surnameInput = scanner.next();
        System.out.println("How old are you? ");
        int ageInput = scanner.nextInt();
        System.out.println("How tall are you? ");
        Double heightInput = scanner.nextDouble();

        scanner.close();

        // Printing the results:
        System.out.println("\n :Introcution using the inputed parameters:  \n");
        System.out.println("Hello, my name is " + nameInput + " " + surnameInput + 
        ". \nI am " + ageInput + " years old. \nI am " + heightInput + " feet tall." );
    }
}
