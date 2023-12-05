package mat.almeida.study.weekone;
public class StudentGrading {
    public static void main(String[] args) {

        int finalGrade = 6;
        if (finalGrade < 6)
            System.out.print("FAILED");
        else if (finalGrade == 6)
            System.out.print("LAST CHANCE TEST");
        else
            System.out.print("APPROVED");
    }
}
