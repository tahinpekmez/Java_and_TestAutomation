// INTERFACE
package Example;

public interface MyInterface {

       void method1();
       int method2();
}


// INTERFACE IMPLEMENT
package Example;

public class MyClass implements MyInterface {

    int a;
    int b;
    int c; int d;

    public void method1(){
        a = 5; b = 3;
        c = a + b;
        System.out.println(c);
    }

    public int method2(){

        a = 5; b = 6; c = 2;
        d = a*b*c;
        System.out.println(d);
        return 0;

    }
    public static void main(String[] args){
        MyClass o1 = new MyClass();
        o1.method1();
        o1.method2();
    }

}

// OUTPUT : 8 and 60
