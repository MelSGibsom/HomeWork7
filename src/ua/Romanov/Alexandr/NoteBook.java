package ua.Romanov.Alexandr;

public class NoteBook {


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
        NoteBook noteBook = new NoteBook();

        noteBook.setName("Asus ROG Strix G531GT-BQ132 (90NR01L3-M02530) Black");
        System.out.println(noteBook.getName());
        noteBook.setPrice(5999);
        noteBook.setCPU("Intel Core i5-9300H (2.4 - 4.1 ГГц)");
        noteBook.setHardDriveType("SSD");
        noteBook.setNumberOfCPU("4");
        noteBook.setNew(true);
        noteBook.setRAM("8 Gb");
        noteBook.setScreenDiagonal("15.6");
        noteBook.setSecondHand(false);
        System.out.println("Is New?: " + noteBook.isNew());
        System.out.println("Is second hand?: " + noteBook.isSecondHand());
        System.out.println("Price "+ noteBook.getPrice());
        System.out.println(noteBook.getName());
        System.out.println("Number of CPU: " + noteBook.getNumberOfCPU());
        System.out.println(noteBook.getCPU());
        System.out.println("Hard Drive type: " + noteBook.getHardDriveType());
        System.out.println("Number of CPU: " + noteBook.getNumberOfCPU());
        System.out.println("price: " + noteBook.getPrice());
        System.out.println("RAM: "+ noteBook.getRAM());
        System.out.println("Screen Diagonal: "+ noteBook.getScreenDiagonal());


    }
}