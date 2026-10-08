package Midterm;

class Laptop extends Computer {
    private String hdSize;
    private double hdPrice;

    private String displaySize;
    private double displayPrice;

    public Laptop(String name, String brand) {
        super(name, "Laptop", brand);
    }

    public void setHardDrive(String size, double price) {
        hdSize = size;
        hdPrice = price;
    }

    public void setDisplay(String size, double price) {
        displaySize = size;
        displayPrice = price;
    }

    public double calculateTotal() {
        return getCpuPrice() + hdPrice + displayPrice;
    }

    public void display() {
        displayHeader();
        System.out.printf("Hard Drive: %s ($%.2f)\n", hdSize, hdPrice);
        System.out.printf("Display: %s ($%.2f)\n", displaySize, displayPrice);
        System.out.println("--------------------------------------");
        System.out.printf("Total: $%.2f\n", calculateTotal());
    }
}

