package library.main;

import library.model.LibraryResource;
import library.service.Book;
import library.service.DigitalResource;
import library.service.Printable;
import library.util.InputValidator;

public class Main {
    public static void main(String[] args) {
        LibraryResource[] resources = new LibraryResource[5];
        resources[0] = new Book(1, "Java Basics", "James");
        resources[1] = new DigitalResource(2, "AI Research", "Andrew");
        resources[2] = new Book(3, "Database Systems", "Navathe");
        resources[3] = new DigitalResource(4, "ML Tutorial", "Tom");
        resources[4] = new Book(5, "Operating Systems", "Silberschatz");

        double totalFine = 0;

        for (LibraryResource res : resources) {
            if (res instanceof Printable) {
                ((Printable) res).printDetails();
            }

            int overdueDays = (res.getResourceId() % 3) + 2; // sample overdue days
            if (InputValidator.validateOverdueDays(overdueDays)) {
                double fine = res.calculateFine(overdueDays);
                System.out.println("Overdue Days: " + overdueDays + ", Fine: " + fine);
                totalFine += fine;
            }
            System.out.println("-----------------------------------");
        }

        System.out.println("Total Resources: " + LibraryResource.getTotalResources());
        System.out.println("Total Fine: " + totalFine);
    }
}
