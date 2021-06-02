public class Tablet extends Device {

    private static boolean physicalKeyboard;


    public Tablet(String type, String brand, double price, boolean physicalKeyboard) {
        super(type, brand, price, physicalKeyboard);

    }

    public static boolean hasPhysicalKeyboard() {
        if (physicalKeyboard) {
            return true;
        }
        return hasPhysicalKeyboard();
    }

}
