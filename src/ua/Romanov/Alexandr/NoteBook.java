package ua.Romanov.Alexandr;

public class NoteBook extends Computer {
    public static void main(String[] args) {
        NoteBook noteBook = new NoteBook();
        noteBook.setName("Asus ROG Strix G531GT-BQ132 (90NR01L3-M02530) Black");
        System.out.println(noteBook.getName());
        noteBook.setPrice(947);
        noteBook.setCPU("Intel Core i5-9300H (2.4 - 4.1 ГГц)");
        noteBook.setHardDriveType("SSD");
        noteBook.setNumberOfCPU("4");
        noteBook.setNew(true);
        noteBook.setRAM("8 Gb");
        noteBook.setScreenDiagonal("15.6\" ");
        noteBook.setSecondHand(false);
        System.out.println("Is New?: " + noteBook.isNew());
        System.out.println("Is second hand?: " + noteBook.isSecondHand());
        System.out.println("Price " + noteBook.getPrice()+"$");
        System.out.println(noteBook.getName());
        System.out.println("Number of CPU: " + noteBook.getNumberOfCPU());
        System.out.println(noteBook.getCPU());
        System.out.println("Hard Drive type: " + noteBook.getHardDriveType());
        System.out.println("Number of CPU: " + noteBook.getNumberOfCPU());
        System.out.println("price: " + noteBook.getPrice());
        System.out.println("RAM: " + noteBook.getRAM());
        System.out.println("Screen Diagonal: " + noteBook.getScreenDiagonal());
        noteBook.setTheCountryOfManufacture("China (Taiwan)");
        System.out.println(noteBook.getTheCountryOfManufacture());
        noteBook.setSizeOfHardDrive("Size of hard drive: 256 Gb");
        System.out.println(noteBook.getSizeOfHardDrive());


    }
}