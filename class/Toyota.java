public class Toyota {
    // Common properties for all Toyota cars
    private String model;
    private int year;

    // Constructor with default values
    public Toyota() {
        this.model = "Undefined";
        this.year = 0;
    }

    // Parameterized constructor
    public Toyota(String model, int year) {
        this.model = model;
        this.year = year;
    }

    // Getters and setters
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}