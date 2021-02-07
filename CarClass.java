package OOPsConcepts;

public class CarClass {

    private String color;
    private String model;
    //public String make;
    private String make;
    private int year;
    //public int year;

    int speed;
    int gear;

     public CarClass(){

         this(10,2);
         this.speed = 0;
         this.gear = 0;

         System.out.println("executing ctor without arguments");
     }

// Note: this keyword means which is "the parameter belongs to the class."

    public CarClass(int s, int g){
         this.speed = s;
         this.gear = g;
         System.out.println("executing ctor with arguments");
     }


    public String getColor()
    {
        return color;
    }

    public void setColor(String c)
    {
        this.color = c;
    }


    public String getModel()
    {
        return model;
    }

    public void setModel(String model)
    {
       // String M = model;
        this.model = model;
    }

    public int getYear()
    {
        return year;
    }

    public void setYear(int year){
        if (year > 1900){
            this.year = year;
        }else{
            System.out.println("This year is not valid");
        }
    }

    /*
    public void setYear(int year) {this.year = year;}
    */

    public void increaseSpeed(){
        System.out.println("Increasing the Speed");
    }

    // set value of make od CarClass
    public void setMake(String make){
        this.make = make;
    }

    // return value of make in CarClass
    public String getMake()
    {
        return this.make;
    }

}



