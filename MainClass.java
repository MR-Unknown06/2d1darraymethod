
/**
 * Write a description of class MainClass here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MainClass
{
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.color = "Red";
        myCar.price = 25000.50;
        System.out.println("Car Color: " + myCar.color);
        System.out.println("Car Price: $" + myCar.price);
    }
}