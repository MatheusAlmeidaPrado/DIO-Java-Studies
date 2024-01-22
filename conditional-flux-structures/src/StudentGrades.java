public class StudentGrades {
    
    public static void main(String[] args) {
        
        String face;
        double math, science, english, history, geography, average;
        boolean pass = true;
        int intAverage;
        math = 9.1;
        science = 7.3;
        english = 6.75;
        history = 9.3;
        geography = 8.8;

        average = (math + science + english + history + geography) / 5;


         
        /*      :Simplest Conditional Scruture with "IF":
         If the defined logical operation turns out to be true, the line of code bellow it will run.
         Otherwise, the line bellow it will just be skipped.
         (When there's only one process to run under IF or ELSE you do not need set a block by using "{}" [brackets])
        */
        if (average < 6.5)
            pass = false;   
        // Determine if the student passed or not.



        /*      :Compound Conditional Structure with "IF" and "ELSE":
         If the defined logical operation turns out to be true, the process bellow it will run and ELSE (and its processes) will be skipped.
         Otherwise, the processes under IF will be skipped and the process under else will run.
         (Again: When there's only one process to run under IF or ELSE you do not need set a block by using "{}" [brackets])
        */
        if (pass == true)
            System.out.println("APPROVED: You may advance to next semester.");
        else
            System.out.println("FAILED: You're average grade is too low. You must repeat the whole semester.");
        // Print a mesage showing the student if he passed or not.



        /*      :Chained Conditional Structure:
         Similar to the previous structure. Multiple IF scenarios will be checked one after another,
         in case any turns out to be true, the process bellow it will run.
         Otherwise, the process bellow ELSE will run.  
        */
        if (math>science && math>english && math>history && math>geography)
            System.out.println("Your highest grade (" + math + ") is in Mathematics.");
        else if (science>math && science>english && science>history && science>geography)
            System.out.println("Your highest grade (" + science + ") is in Science.");
        else if (english>math && english>science && english>history && english>geography)
            System.out.println("Your highest grade (" + english + ") is in English Language.");
        else if (history>math && history>science && history>english && history>geography)
            System.out.println("Your highest grade (" + history + ") is in History.");
        else if (geography>math && geography>science && geography>english && geography>history)
            System.out.println("Your highest grade (" + geography + ") is in Geography.");
        else
            System.out.println("Two or more grades have the exact same value.");
        // The structure above doesn't correctly point to the highest grade in ALL POSSIBILITIES, but it does somewhat work... ;)




        /*      :Ternary Conditional Structure:
         Similar to the previous structures. It's a "shorter" way to write simpler conditional structures.
         First define a variable, then: before (?) is the logical operation, before (:) is the result if true, after (:) the result if false. 
         (This structure can also be chained within itself, but human reading may be more difficult)
        */
        face = average > 6.5 ? "good :) " : "bad :( ";
        System.out.println("You current status is:  " + face);
        // Realistically, this mesage is redundant...




        /*      :Switch Case Structure:
         Define a variable inside the parantheses of 'switch ()'. The value of the variable will be compared to each case.
         The case that has the equivalent value will execute it's code bellow.
         * Without a 'break;' inside the equivalent case, all codes under such case will be executed (regardless of equivalency) until/if a break is found!
         * A 'default :' may be used to set a code outcome in case no cases are equivalent!
        */

        intAverage = (int)average;
        System.out.println("You have recieved: ");

        switch (intAverage) {
            case 1,2,3,4,5,6 : {
                System.out.println("No rewards.");
                break;
            }
            case 10 : {
                System.out.println(" * A travel discount for your next vacation!");
            }
            case 9 : {
                System.out.println(" * A free seat in any upcoming lecture in this next semester!");
            }
            case 8 : {
                System.out.println(" * A 40% discount for a book in the local library!");
            }
            case 7 : {
                System.out.println(" * A free cupcake.");
                break;
            }
            default : {
                System.out.println("No rewards.");
            }
        }

    }
}
