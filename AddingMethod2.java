package OOPsConcepts;

public class AddingMethod2 {

    public static void main(String[] args){
        String note;
        String studentName;

        studentName = "İbrahim";
        note = findGrades(90);
        displayGrades(studentName, note);

    }

    
    // public static void findGrades(String studentName, int score) {} -->
    // if we delete static front of the method we must create an instance of class
    public static String findGrades(int score) {
        String grade;

        if (score >= 90 && score <= 100) {
            grade = "A";
        } else if (score >= 80 && score < 90) {
            grade = "B";
        } else if (score >= 70 && score < 80) {
            grade = "C";
        } else {
            grade = "D";
        }
        return grade;

    }

    public static void displayGrades(String studentName, String grade){
        System.out.println("Grade of " + studentName + " is: " + grade);
    }

}

