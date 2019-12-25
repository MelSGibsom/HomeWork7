package ua.Romanov.Alexandr;

public class Main {


    private String name;
    private int price;
    private String RAM;
    private String sizeOfHardDrive;
    private String HardDriveType;
    private String numberOfCPU;
    private String VideoCard;
    private boolean isNew;
    private boolean secondHand;
    private String ScreenDiagonal;
    private String theCountryOfManufacture;
    private String CPU;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setRAM(String RAM) {
        this.RAM = RAM;
    }

    public void setSizeOfHardDrive(String sizeOfHardDrive) {
        this.sizeOfHardDrive = sizeOfHardDrive;
    }

    public void setHardDriveType(String hardDriveType) {
        HardDriveType = hardDriveType;
    }

    public void setNumberOfCPU(String numberOfCPU) {
        this.numberOfCPU = numberOfCPU;
    }

    public void setVideoCard(String videoCard) {
        VideoCard = videoCard;
    }

    public void setNew(boolean aNew) {
        isNew = aNew;
    }

    public void setSecondHand(boolean secondHand) {
        this.secondHand = secondHand;
    }

    public void setScreenDiagonal(String screenDiagonal) {
        ScreenDiagonal = screenDiagonal;
    }

    public void setTheCountryOfManufacture(String theCountryOfManufacture) {
        this.theCountryOfManufacture = theCountryOfManufacture;
    }

    public void setCPU(String CPU) {
        this.CPU = CPU;
    }

    public int getPrice() {
        return price;
    }

    public String getRAM() {
        return RAM;
    }

    public String getSizeOfHardDrive() {
        return sizeOfHardDrive;
    }

    public String getHardDriveType() {
        return HardDriveType;
    }

    public String getNumberOfCPU() {
        return numberOfCPU;
    }

    public String getVideoCard() {
        return VideoCard;
    }

    public boolean isNew() {
        return isNew;
    }

    public boolean isSecondHand() {
        return secondHand;
    }

    public String getScreenDiagonal() {
        return ScreenDiagonal;
    }

    public String getTheCountryOfManufacture() {
        return theCountryOfManufacture;
    }

    public String getCPU() {
        return CPU;
    }

    public static void main(String[] args) {
        Main main = new Main();

        main.setName("Asus ROG Strix G531GT-BQ132 (90NR01L3-M02530) Black");
        System.out.println(main.getName());
        main.setPrice(5999);
        main.setCPU("Intel Core i5-9300H (2.4 - 4.1 ГГц)");
        main.setHardDriveType("SSD");
        main.setNumberOfCPU("4");
        main.setNew(true);
        main.setRAM("8 Gb");
        main.setScreenDiagonal("15.6");
        main.setSecondHand(false);
        System.out.println("Is New?: " + main.isNew());
        System.out.println("Is second hand?: " + main.isSecondHand());
        System.out.println("Price "+main.getPrice());
        System.out.println(main.getName());
        System.out.println("Number of CPU: " + main.getNumberOfCPU());
        System.out.println(main.getCPU());
        System.out.println("Hard Drive type: " + main.getHardDriveType());
        System.out.println("Number of CPU: " + main.getNumberOfCPU());
        System.out.println("price: " + main.getPrice());
        System.out.println("RAM: "+main.getRAM());
        System.out.println("Screen Diagonal: "+main.getScreenDiagonal());


    }
}