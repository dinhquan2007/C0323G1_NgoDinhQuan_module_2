package case_study.controller.impl;

import case_study.service.*;
import case_study.service.impl.*;

import java.util.Scanner;

public class FuramaController {
    private Scanner scanner = new Scanner(System.in);
    int choice;
    IContactService contactService = new ContactService();
    IBookingService bookingService = new BookingService();
    IEmployeeService employeeService = new EmployeeService();
    IFacilityService facilityService = new FacilityService();
    ICustomerService customerService = new CustomerService();

    public void displayMainMenu() {
        do {
            System.out.println("1.\tEmployee Management\n" +
                    "2.\tCustomer Management\n" +
                    "3.\tFacility Management \n" +
                    "4.\tBooking Management\n" +
                    "5.\tPromotion Management\n" +
                    "6.\tExit\n");
            try {
                choice = Integer.parseInt(scanner.nextLine());
                if (choice <= 0 || choice > 6) {
                    System.out.println("Please enter the options available in the menu");
                    continue;
                }
                switch (choice) {
                    case 1:
                        System.out.println("----------Employee Management---------");
                        displayEmployeeMenu();
                        break;
                    case 2:
                        System.out.println("----------Customer Management----------");
                        displayCustomerMenu();
                        break;
                    case 3:
                        System.out.println("----------Facility Management-----------");
                        displayFacilityMenu();
                        break;
                    case 4:
                        System.out.println("----------Booking Management-----------");
                        displayBookingMenu();
                        break;
                    case 5:
                        System.out.println("----------Promotion Management-----------");
                        displayPromotionMenu();
                        break;
                    case 6:
                        System.out.println("thank you for came our program");
                        break;

                }
            } catch (NullPointerException nullPointerException) {
                System.out.println("do not enter empty characters");
            } catch (NumberFormatException numberFormatException) {
                System.out.println("entered wrong format");
            }
        } while (choice != 6);
    }

    void displayEmployeeMenu() {
        do {
            System.out.println("1.\tDisplay list employees\n" +
                    "2.\tAdd new employee\n" +
                    "3.\tEdit employee\n" +
                    "4\t.delete employee" +
                    "5.\tReturn main menu\n");
            try {
                choice = Integer.parseInt(scanner.nextLine());
                if (choice <= 0 || choice > 5) {
                    System.out.println("Please enter the options available in the menu");
                    continue;
                }
                switch (choice) {
                    case 1:
                        employeeService.displayAll();
                        break;
                    case 2:
                        employeeService.add();
                        break;
                    case 3:
                        employeeService.edit();
                        break;
                    case 4:

                        break;
                    case 5:

                        return;

                }
            } catch (NullPointerException nullPointerException) {
                System.out.println("do not enter empty characters");
            } catch (NumberFormatException numberFormatException) {
                System.out.println("entered wrong format");
            }
        } while (true);
    }

    void displayCustomerMenu() {
        do {
            System.out.println("1.\tDisplay list customers\n" +
                    "2.\tAdd new customer\n" +
                    "3.\tEdit customer\n" +
                    "4.\tReturn main menu\n");
            try {
                choice = Integer.parseInt(scanner.nextLine());
                if (choice <= 0 || choice > 4) {
                    System.out.println("Please enter the options available in the menu");
                }
                switch (choice) {
                    case 1:
                        customerService.displayAll();
                        break;
                    case 2:
                        customerService.add();
                        break;
                    case 3:
                        customerService.edit();
                        break;
                    case 4:
                        return;
                }
            } catch (NullPointerException nullPointerException) {
                System.out.println("do not enter empty characters");
            } catch (NumberFormatException numberFormatException) {
                System.out.println("entered wrong format");
            }

        } while (choice != 4);
    }

    void displayFacilityMenu() {
        do {
            System.out.println("1\tDisplay list facility\n" +
                    "2\tAdd new facility\n" +
                    "3\tDisplay list facility maintenance\n" +
                    "4\tReturn main menu\n");
            try {
                choice = Integer.parseInt(scanner.nextLine());
                if (choice <= 0 || choice > 4) {
                    System.out.println("Please enter the options available in the menu");
                }
                switch (choice) {
                    case 1:
                        facilityService.displayAll();
                        break;
                    case 2:
                        facilityService.add();
                        break;
                    case 3:
                        facilityService.edit();
                        break;
                    case 4:

                        return;

                }
            } catch (NullPointerException nullPointerException) {
                System.out.println("do not enter empty characters");
            } catch (NumberFormatException numberFormatException) {
                System.out.println("entered wrong format");
            }
        } while (true);

    }

    void displayBookingMenu() {
        do {
            System.out.println("1.\tAdd new booking\n" +
                    "2.\tDisplay list booking\n" +
                    "3.\tCreate new contracts\n" +
                    "4.\tDisplay list contracts\n" +
                    "5.\tEdit contracts\n" +
                    "6.\tReturn main menu\n");
            try {
                choice = Integer.parseInt(scanner.nextLine());
                if (choice <= 0 || choice > 6) {
                    System.out.println("Please enter the options available in the menu");
                }
                switch (choice) {
                    case 1:
                        bookingService.add();
                        break;
                    case 2:
                        bookingService.displayAll();
                        break;
                    case 3:
                        contactService.create();
                        break;
                    case 4:
                        contactService.displayAll();
                        break;
                    case 5:
                        contactService.edit();
                        break;
                    case 6:

                        return;
                }
            } catch (NullPointerException nullPointerException) {
                System.out.println("do not enter empty characters");
            } catch (NumberFormatException numberFormatException) {
                System.out.println("entered wrong format");
            }
        } while (true);
    }

    void displayPromotionMenu() {
        do {
            System.out.println("1.\tDisplay list customers use service\n" +
                    "2.\tDisplay list customers get voucher\n" +
                    "3.\tReturn main menu\n");
            try {
                choice = Integer.parseInt(scanner.nextLine());
                switch (choice) {
                    case 1:
                        customerService.displayAll();
                        break;
                    case 2:
                        customerService.getVoucher();
                        break;
                    case 3:

                        return;
                }
            } catch (NullPointerException nullPointerException) {
                System.out.println("do not enter empty characters");
            } catch (NumberFormatException numberFormatException) {
                System.out.println("entered wrong format");
            }
        } while (true);

    }
}
