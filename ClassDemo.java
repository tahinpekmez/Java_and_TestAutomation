package OOPsConcepts;

public class ClassDemo extends CarClass {
    public static void main(String[] args){


CarClass bmw = new CarClass(); // Straight Forward

     bmw.setModel("A3");
     System.out.println("model of my car: " + bmw.getModel());

        bmw.setMake("BMW");
        System.out.println("make of BMW: " +bmw.getMake());

        bmw.setColor("Red");
        System.out.println("color of BMW: " + bmw.getColor());

        //bmw.setModel("X5"); if we don't use setModel, We get null at result of getModel
        System.out.println("model of BMW: " + bmw.getModel());

        bmw.setYear(2005);
        System.out.println("year of BMW: " + bmw.getYear() + "\n");


        CarClass benz = new CarClass();

        benz.setModel("c300");
        System.out.println("model of Benz: " + benz.getModel());

        benz.setMake("Benz");
        System.out.println("make of Benz: " + benz.getMake() + "\n");

        // benz.year = 2020; make this when year is public at ClassCar
        benz.setYear(1899);
        System.out.println("year of benz: " + benz.getYear());
    }
}

