// Random object - Bag class with get and set methods
class Bag {
    private String brand;
    private String color;
    private double price;

    // Constructor
    public Bag(String brand, String color, double price) {
        this.brand = brand;
        this.color = color;
        this.price = price;
    }

    // Getters and setters
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}

// Subclass 1: Backpack
class Backpack extends Bag {
    private int capacity;

    public Backpack(String brand, String color, double price, int capacity) {
        super(brand, color, price);
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}

// Subclass 2: Handbag
class Handbag extends Bag {
    private String material;

    public Handbag(String brand, String color, double price, String material) {
        super(brand, color, price);
        this.material = material;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
}

// Subclass 3: LaptopBag
class LaptopBag extends Bag {
    private boolean padded;

    public LaptopBag(String brand, String color, double price, boolean padded) {
        super(brand, color, price);
        this.padded = padded;
    }

    public boolean isPadded() {
        return padded;
    }

    public void setPadded(boolean padded) {
        this.padded = padded;
    }
}
        //My main class
public class Main {
    public static void main(String[] args) {
        // Creating an instance/object of the LaptopBag subclass
        LaptopBag myLaptopBag = new LaptopBag("Dell", "Black", 49.99, true);

        // Using the object to solve a problem
        System.out.println("My laptop bag details:");
        System.out.println("Brand: " + myLaptopBag.getBrand());
        System.out.println("Color: " + myLaptopBag.getColor());
        System.out.println("Price: $" + myLaptopBag.getPrice());
        System.out.println("Padded: " + (myLaptopBag.isPadded() ? "Yes" : "No"));

        // Creating five more instances of LaptopBag for different instances
        LaptopBag paddedLaptopBag = new LaptopBag("HP", "Blue", 59.99, true);
        LaptopBag nonPaddedLaptopBag = new LaptopBag("Lenovo", "Gray", 39.99, false);
        LaptopBag expensiveLaptopBag = new LaptopBag("Acer", "Red", 99.99, true);
        LaptopBag affordableLaptopBag = new LaptopBag("Asus", "Green", 29.99, false);
        LaptopBag stylishLaptopBag = new LaptopBag("Sony", "Brown", 79.99, true);

    }
}
