package OOPsConcepts;

public class ConstructorDemo {
    public static void main(String[] args){

        CarClass c1 = new CarClass(); // Java has alrady called a Constructor in here as "CarClass()"
        c1.setMake("BMW");
        System.out.println(c1.getMake());

        System.out.println(c1.speed);
        System.out.println(c1.gear);

        System.out.println("******************************");

        CarClass c2 = new CarClass(10, 1);
        System.out.println(c2.speed);
        System.out.println(c2.gear);
    }


}

/*
Note: If we don't create any consructor, Java calls a constructor like "CarClass()"
      But, for  C++ it can not be done. if we work on C++, for initialization we should create Constructor to called it after.
*/