/* Part 1: Class and Object Creation
Task: Write a basic Java program that:
Has a class named Car
Includes data members like brand, model, year
Create an object in the main() method
Assign values and print them */
import java.util.*;
import java.util.*;
class Car{
    private String brand;
    private int model;
    private int year;

    public  Car(String brand, int model, int year){
        this.brand=brand;
        this.model=model;
        this.year=year;
    }
    public  void cardetails(){
        System.out.println("The car brand: "+this.brand);
        System.out.println("The car model: "+this.model);
        System.out.println("The car manufactured year: "+year);
    }
}
class Student{
   public static void main(String[]args){
    Scanner s=new Scanner(System.in);
    String brandd=s.nextLine();
    int modell=s.nextInt();
    int yearr=s.nextInt();
    Car c=new Car(brandd,modell, yearr);
    c.cardetails();
   }
}
