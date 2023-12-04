import personnel.Employee;
import personnel.User;
import stock.Item;
import stock.Warehouse;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import static stock.Warehouse.printWarehouseDetails;

public class Main1 {
    public static void main(String[] args) {

        // Create sample items in the Warehouse

        Item item1 = new Item("New", "Electronics", "2022-01-01 00:00:00", 1);
        Item item2 = new Item("Used", "Furniture", "2022-01-02 00:00:00", 1);
        Item item3 = new Item("New", "Books", "2022-01-03 00:00:00", 2);
        Item item4 = new Item("Used", "Electronics", "2022-01-04 00:00:00", 2);
        Item item5 = new Item("New", "Furniture", "2022-01-05 00:00:00", 3);
        Item item6 = new Item("Used", "Books", "2022-01-06 00:00:00", 3);
        Item item7 = new Item("New", "Electronics", "2022-01-07 00:00:00", 4);
        Item item8 = new Item("Used", "Furniture", "2022-01-08 00:00:00", 4);
        Item item9 = new Item("Used", "Books", "2022-01-09 00:00:00", 5);
        Item item10 = new Item("Used", "Electronics", "2022-01-10 00:00:00", 5);


//Create a list of items
        List<Item> stockItems = List.of(item1, item2, item3, item4, item5, item6, item7, item8, item9, item10);

        List<Item> stockItems1 = new ArrayList<>();
        stockItems1.add(item1);
        stockItems1.add(item2);

        List<Item> stockItems2 = new ArrayList<>();
        stockItems2.add(item3);
        stockItems2.add(item4);
//System.out.println(stockItems2);

        List<Item> stockItems3 = new ArrayList<>();
        stockItems3.add(item5);
        stockItems3.add(item6);

        List<Item> stockItems4 = new ArrayList<>();
        stockItems4.add(item7);
        stockItems4.add(item8);

        List<Item> stockItems5 = new ArrayList<>();
        stockItems5.add(item9);
        stockItems5.add(item10);


//Create a Warehouse
        Warehouse warehouse1 = new Warehouse(1, stockItems1);
        Warehouse warehouse2 = new Warehouse(2, stockItems2);
        Warehouse warehouse3 = new Warehouse(3, stockItems3);
        Warehouse warehouse4 = new Warehouse(4, stockItems4);
        Warehouse warehouse5 = new Warehouse(5, stockItems5);


        List<Warehouse> warehouseList = new ArrayList<>();
        warehouseList.add(warehouse1);
        warehouseList.add(warehouse2);
        warehouseList.add(warehouse3);
        warehouseList.add(warehouse4);
        warehouseList.add(warehouse5);

        Scanner scanner = new Scanner(System.in);
        // Create sample Users
        Employee employee = new Employee("terissa", true, "teri123", Collections.emptyList());
        Employee employee1 = new Employee("derick", false, "der123", Collections.emptyList());
        User user = new User("reine",false);


        // Simulating User interaction:
        System.out.println("WELCOME TO THE WAREHOUSE APPLICATION!");
        System.out.println("Enter your username:");
        String username = scanner.next();
        System.out.println("Enter your password:");
        String password = scanner.next();

        User currentUser = authenticateUser(username, password, employee, user);

        if (currentUser != null) {
            if (currentUser instanceof Employee) {
                // Employee actions
                Employee currentEmployee = (Employee) currentUser;
                handleEmployeeActions(currentEmployee, warehouseList);
            } else if (currentUser == user) {
                // Guest actions
                handleGuestActions(user, warehouseList);
            }
        } else {
            System.out.println("Invalid credentials. Exiting.");
        }

        scanner.close();
    }

    private static void handleEmployeeActions(Employee employee, List<Warehouse> warehouseList) {
        while (true) {
            System.out.println("1. View Items");
            System.out.println("2. Add Items");
            System.out.println("3. Remove Item");
            System.out.println("4. Exit");
            System.out.println("Hello " + employee.getUser_name() + ". Please enter your Choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    // Call the printWarehouseDetails method
                    printWarehouseDetails(warehouseList);
                    break;
                case 2:
                    // Call the addItem method with an instance of Warehouse
                    addItem(scanner, warehouseList.get(0)); // Modify this according to your actual logic
                    break;
                case 3:
                    // Call the removeItem method with an instance of Warehouse
                    removeItem(scanner, warehouseList.get(0)); // Modify this according to your actual logic
                    break;
                case 4:
                    System.out.println("Thank you for using the Warehouse Database");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void handleGuestActions(User user, List<Warehouse> warehouseList) {
        while (true) {
            System.out.println("1. View Items");
            System.out.println("2. Exit");
            System.out.println("Hello " + user.getUser_name() + ". Enter your Choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    // Call the printWarehouseDetails method
                    printWarehouseDetails(warehouseList);
                    break;
                case 2:
                    System.out.println("Thank you for using the Warehouse Database");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static User authenticateUser(String username, String password, Employee employee, User user) {
        // Simple authentication logic
        if (employee.getUser_name().equals(username) && employee.getPassword().equals(password)) {
            return employee;
        } else if (user.getUser_name().equals(username) && user.getPassword().equals(password)) {
            return user;
        } else {
            System.out.println("Invalid credentials. Please try again.");
            return null;
        }
    }

    // Existing methods...

    private static void addItem(Scanner scanner, Warehouse warehouse) {
        // Existing code...
    }

    private static void removeItem(Scanner scanner, Warehouse warehouse) {
        // Existing code...
    }
}

