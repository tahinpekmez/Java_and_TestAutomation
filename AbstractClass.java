// ABSTRACT CLASS
package Example;

abstract class AbstractExample  {

    abstract void methodX();
    
    public void print(){
        String str = "Alejandro!!!";
        System.out.println(str);
    }
}

// ABSTRACT CLASS EXTEND
package Example;

public class InheriteToAbstract extends AbstractExample{

    public void methodX(){
        String str = "This is night life";
        System.out.println(str);
    }

    public void print() {
        super.print();
    }
}

// MAIN METHOD
package Example;

public class MainClass {
    public static void main (String[] args){
        InheriteToAbstract obj = new InheriteToAbstract();
        obj.methodX();
        obj.print();
    }
}


/*
OUTPUT:
This is night life
Alejandro!!!
*/
