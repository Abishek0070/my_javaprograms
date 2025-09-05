
class Car {
    String brand;
    int year;

    // constructor
    Car(String b, int y) {
        brand = b;
        year = y;
    }

    void display() {
        System.out.println("Car: " + brand + " (" + year + ")");
    }
}

public class Main {
    public static void main(String[] args) {
        Car myCar = new Car("Toyota", 2022);
        myCar.display();
    }
}
