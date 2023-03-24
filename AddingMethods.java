package OOPsConcepts;

public class AddingMethods {

    public static void main(String[] args) {
        // String studentName = "İbrahim";
        // int score = 90;
        AddingMethods obj = new AddingMethods();
        obj.findGrades("İbrahim", 90);
        obj.findGrades("Murat", 50);
    }

    // public static void findGrades(String studentName, int score) {} -->
    // if we delete static front of the method we must create an object of class
    public void findGrades(String studentName, int score) {

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

        System.out.println("Grade of " + studentName + " is: " + grade);

    }
}




//class Erhan{
//
//    public int a = 31;
//    void cekme(){
//        cout << a;
//    }
//};

//int main(){
//
//    Erhan e;
//    e.cekme();
//
//        }
//
//
//        int toplama(){
//    int a = 3;
//    int b = 4;
//    int c = a+b;
//
//    return c;
//        }



        /*
        studentName = "Murat";
        score = 80;

        if (score >= 90 && score <= 100){
            grade = "A";
        }else if (score >=80 && score < 90){
            grade = "B";
        }else if (score >= 70 && score < 80){
            grade = "C";
        }else {
            grade = "D";
        }
        System.out.println("Grade of " + studentName + " is: " + grade);
    }
}
        */
