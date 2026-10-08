package Midterm;

class Desktop extends Computer {
    private String caseType;
    private double casePrice;

    private String hdSize;
    private double hdPrice;

    private String monitorSize;
    private double monitorPrice;

    public Desktop(String name, String brand) {
        super(name, "Desktop", brand);
    }

    public void setCase(String type, double price) {
        caseType = type;
        casePrice = price;
    }

    public void setHardDrive(String size, double price) {
        hdSize = size;
        hdPrice = price;
    }

    public void setMonitor(String size, double price) {
        monitorSize = size;
        monitorPrice = price;
    }

    public double calculateTotal() {
        return getCpuPrice() + casePrice + hdPrice + monitorPrice;
    }

    public void display() {
        displayHeader();
        System.out.printf("Case: %s ($%.2f)\n", caseType, casePrice);
        System.out.printf("Hard Drive: %s ($%.2f)\n", hdSize, hdPrice);
        System.out.printf("Monitor: %s ($%.2f)\n", monitorSize, monitorPrice);
        System.out.println("--------------------------------------");
        System.out.printf("Total: $%.2f\n", calculateTotal());
    }
}

