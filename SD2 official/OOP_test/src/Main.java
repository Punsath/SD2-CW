public class Main {

    public static void vehicleTest(Car v) {
        System.out.println(v.doors);
    }
    public static void main(String[] args) {
        Car car = new Car();
        car.doors = 4;
        car.length = 1;
        car.wheels = 4;
        car.x = 100;
        vehicleTest(car);
    }


}