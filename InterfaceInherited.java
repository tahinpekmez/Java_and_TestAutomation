// INTERFACE CREATE WITH INHERITING FROM OTHER INTERFACE
package Example;

public interface MyInterface2nd extends MyInterface {

}


// INTERFACE IMPLEMENTATION
package Example;

public class MyClass2nd implements MyInterface2nd{

    int x; int y; int z;

    public void method1(){
        x = 2; y = 3;
        z = x - y;
        System.out.println(z);
    }
    public int method2(){

        x = 9; y = 18; z = y/x;
        System.out.println(z);

        return 0;

    }

    public static void main(String[] args){
        MyClass2nd o2 = new MyClass2nd();
      // Below methods have been interited from MyInterface to MyInterface2. CAN NOT BEEN INHERITED FROM INTERFACE TO CLASS 
        o2.method1();
        o2.method2();


    }

}

// OUTPUT: -1 and 2
