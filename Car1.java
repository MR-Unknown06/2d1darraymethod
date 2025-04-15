
/**
 * Write a description of class Car1 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Car1
{
    
    private String color;
    private String brand;

    
    public Car1(String color, String brand) {
        this.color = color;
        this.brand = brand;
    }

    public void drive() {
        System.out.println(this.color);
    }

    public void play() {
        System.out.println(this.brand);
    }

    public static void main(String[] args) {
        Car1 c = new Car1("RED", "Toyota");
        c.drive();  

        Car1 d = new Car1("Blue", "Mustang");
        d.play();  
    }
}