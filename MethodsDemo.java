package OOPsConcepts;

public class MethodsDemo {

    static String a = "Hey, get out of here!!!";

    public static void method1() {
//        String a = "Hey, get out of here!!!";
        System.out.println(a);

    }

    /****************************************************************************************/


    public static void main(String[] args) {
        method1();
        String a = "Hey! come here!!!"; //1.
        System.out.println(a);          //2.
    }
}

