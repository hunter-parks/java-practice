import java.util.ArrayList;
import java.util.HashMap;

public class AssessmentPractice {
    public static void main(String[] args) {

        System.out.println("cube(3) = " + cube(3));
        System.out.println("difference(a,b) = " + difference(1.4, 2.5));
        int[] array = {1,2,3,4,5,6,7,8};
        double average = average(array);

        Device laptop = new Device("laptop","Apple", 455.99, true);
        Device xbox= new Device("Xbox","Microsoft", 500.99, false);
        Device ipad = new Device("Ipad","Apple", 700.99, false);
        ArrayList<Device> deviceList = new ArrayList<>();
        deviceList.add(laptop);
        deviceList.add(xbox);
        deviceList.add(ipad);

        System.out.println(createInventory(deviceList));




    }

    // Write a public static method named cube that accepts an integer as input and returns that number 3 times itself.
    public static int cube(int input) {
        return input * input * input;
    }

    // Write a public static method named difference that accepts two arguments and returns the absolute value of the difference between them such that the answer is always a positive number. The method should work with both integers and doubles.
    public static double difference(double a, double b) {

        return b - a;
    }

    // Write a public static method named average that takes in an Array of integers (not a List, an Array) and returns the average of all the numbers in the list as a Double.
    public static double average(int[] array) {
        double sum = 0;

        for (int avg : array) {
            sum += avg;
        }

        return sum / array.length;


    }

    public static HashMap<String, Device> createInventory(ArrayList<Device> Device) {
        HashMap<String, Device> inventory = new HashMap<>();

        for (int i = 0; i < Device.size(); i++) {
            String s = "s" + i;
            inventory.put(s, Device.get(i));
        }

        return inventory;
    }


}