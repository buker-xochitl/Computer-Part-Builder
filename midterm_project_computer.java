package Midterm;

class Computer {
    private String userName;
    private String type;
    private String brand;
    private String cpuBrand;
    private double cpuPrice;

    public Computer(String userName, String type) {
        this.userName = userName;
        this.type = type;
    }

    public Computer(String userName, String type, String brand) {
        this(userName, type);
        this.brand = brand;
    }

    public void setCpu(String brand, double price) {
        this.cpuBrand = brand;
        this.cpuPrice = price;
    }

    public double getCpuPrice() {
        return cpuPrice;
    }

    public void displayHeader() {
        System.out.printf("\nName: %s\n", userName);
        System.out.printf("Type: %s\n", type);
        System.out.printf("Brand: %s\n", brand);
        System.out.printf("CPU: %s ($%.2f)\n", cpuBrand, cpuPrice);
        System.out.println("--------------------------------------");
    }
}

