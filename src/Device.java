
public class Device implements TextEditor {

    public static void main(String[] args) {

        Device device = new Device("computer","Microsoft", 999.0, true);
        System.out.println(device.openTextFile("devices "));

//        TextEditor filename = new TextEditor() {
//            @Override
//            public String toString() {
//                return super.toString();
//            }
//        };

//        System.out.println(filename);
    }
    // Creating the properties
    private String type;
    private String brand;
    private double price;

    // Making the throw exception if null and 0
    public Device(String type, String brand, double price, boolean physicalKeyboard){


        if (type == null || brand == null || price == 0) {
            throw new IllegalArgumentException("Please enter a new value");
        }

        this.type = type;
        this.brand = brand;
        this.price = price;
    }

    // Getters and Setters
    public String getType () {
        return type;
    }

    public void setType (String type){
        this.type = type;
    }


    public String getBrand () {
        return brand;
    }

    public void setBrand (String brand){
        this.brand = brand;
    }

    public double getPrice () {
        return price;
    }

    public void setPrice ( double price){
        this.price = price;
    }


    @Override
    public String openTextFile(String filename) {

        if (brand.equals("Apple")) {
            return "Opening " + filename + "with TextEdit";
        } else if (brand.equals("Microsoft")) {
            return "Opening " + filename + "with Notepad";
        } else {
            return "Opening " + filename;
        }

    }
}

