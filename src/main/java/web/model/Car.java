package web.model;

public class Car {
    private String model;
    private String serialNumber;
    private int year;

    public Car() {
    }

    public Car(String model, String serialNumber, int year) {
        this.model = model;
        this.serialNumber = serialNumber;
        this.year = year;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
