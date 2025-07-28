import java.util.*;

class MenuItem {
    int id;
    String name;
    double price;

    public MenuItem(int id, String name, double price) {
        this.id = id;
        this.name = name.toLowerCase();
        this.price = price;
    }

    public String toString() {
        return id + ". " + name + " - rs" + price;
    }
}

class Order {
    int orderId;
    List<MenuItem> items = new LinkedList<>();
    double total;
    String paymentMethod;

    public Order(int orderId) {
        this.orderId = orderId;
    }

    public void addItem(MenuItem item) {
        items.add(item);
        total += item.price;
    }

    public void setPaymentMethod(String method) {
        this.paymentMethod = method;
    }

    public void display() {
        System.out.println("Order #" + orderId);
        for (MenuItem item : items)
            System.out.println(" - " + item.name + ": rs" + item.price);
        System.out.println("Total: rs" + total);
        System.out.println("Payment Method: " + paymentMethod);
        System.out.println("total Payment of " + total + " rs/-  Done.");
    }
}

class Booking {
    String customerName;
    String contact;
    int tableNumber;
    String acType;
    int numberOfMembers;

    public Booking(String customerName, String contact, int tableNumber, String acType, int numberOfMembers) {
        this.customerName = customerName;
        this.contact = contact;
        this.tableNumber = tableNumber;
        this.acType = acType;
        this.numberOfMembers = numberOfMembers;
    }

    public void display() {
        System.out.println("Table Booking:");
        System.out.println("Customer: " + customerName);
        System.out.println("Contact: " + contact);
        System.out.println("Table Number: " + tableNumber);
        System.out.println("AC/Non-AC: " + acType);
        System.out.println("Members: " + numberOfMembers);
    }
}

public class RestaurantSystem {
    static HashMap<Integer, MenuItem> menu = new HashMap<>();
    static LinkedList<Order> orderQueue = new LinkedList<>();
    static LinkedList<Booking> bookings = new LinkedList<>();
    static int nextOrderId = 1;
    static int menuIdCounter = 5;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        initializeMenu();
        while (true) {
            System.out.println("\n1. Admin Panel\n2. Customer Panel\n3. Exit");
            System.out.println("enter your choice:");
            int choice = sc.nextInt();
            switch (choice) {
                case 1 -> adminPanel(sc);
                case 2 -> customerPanel(sc);
                case 3 -> {
                    System.out.println("Goodbye!");
                    return;
                }
                default -> System.out.println("Invalid option.");
            }
        }
    }

    static void adminPanel(Scanner sc) {
        while (true) {
            System.out.println("\n--- Admin Panel ---");
            System.out.println("1. View Menu\n2. Add Item\n3. Delete Item\n4. Update Price\n5. Back");
            int choice = sc.nextInt();

            switch (choice) {
                case 1 -> displayMenu();
                case 2 -> {
                    System.out.print("Name: ");
                    sc.nextLine();
                    String name = sc.nextLine();
                    System.out.print("Price: ");
                    double price = sc.nextDouble();
                    menu.put(menuIdCounter, new MenuItem(menuIdCounter, name, price));
                    System.out.println("Item added.");
                    menuIdCounter++;
                }
                case 3 -> {
                    System.out.print("Enter ID to delete: ");
                    int id = sc.nextInt();
                    if (menu.remove(id) != null)
                        System.out.println("Item deleted.");
                    else
                        System.out.println("ID not found.");
                }
                case 4 -> {
                    System.out.print("Enter ID to update: ");
                    int id = sc.nextInt();
                    MenuItem item = menu.get(id);
                    if (item != null) {
                        System.out.print("New price: ");
                        item.price = sc.nextDouble();
                        System.out.println("Price updated.");
                    } else {
                        System.out.println("Item not found.");
                    }
                }
                case 5 -> {
                    return;
                }
                default -> System.out.println("Invalid option.");
            }
        }
    }

    static void customerPanel(Scanner sc) {
        while (true) {
            System.out.println("\n--- Customer Panel ---");
            System.out.println("1. View Menu\n2. Place Order\n3. View All Orders\n4. Book Table\n5. View Bookings\n6. Back");
            int choice = sc.nextInt();

            switch (choice) {
                case 1 -> displayMenu();
                case 2 -> placeOrder(sc);
                case 3 -> viewOrders();
                case 4 -> bookTable(sc);
                case 5 -> viewBookings();
                case 6 -> {
                    return;
                }
                default -> System.out.println("Invalid option.");
            }
        }
    }

    static void initializeMenu() {
        menu.put(1, new MenuItem(1, "Burger", 100));
        menu.put(2, new MenuItem(2, "Pizza", 160));
        menu.put(3, new MenuItem(3, "Pasta", 70));
        menu.put(4, new MenuItem(4, "Coke", 50));
    }

    static void displayMenu() {
        System.out.println("\n--- MENU ---");
        for (MenuItem item : menu.values()) {
            System.out.println(item);
        }
    }

    static void placeOrder(Scanner sc) {
        System.out.print("How many orders to place? ");
        int numOrders = sc.nextInt();
        for (int i = 0; i < numOrders; i++) {
            Order order = new Order(nextOrderId++);
            displayMenu();
            while (true) {
                System.out.print("Enter item ID to add (0 to finish): ");
                int id = sc.nextInt();
                if (id == 0) break;
                MenuItem item = menu.get(id);
                if (item != null) {
                    order.addItem(item);
                    System.out.println(item.name + " added.");
                    break;
                } else {
                    System.out.println("Item not found.");
                }
            }

            if (!order.items.isEmpty()) {
                System.out.print("Enter payment method (Cash/Card/UPI): ");
                sc.nextLine();
                String payment = sc.nextLine();
                order.setPaymentMethod(payment);
                orderQueue.add(order);
                System.out.println("Order placed.");
            } else {
                System.out.println("No items selected.");
            }
        }
    }

    static void viewOrders() {
        if (orderQueue.isEmpty()) {
            System.out.println("No orders.");
        } else {
            for (Order order : orderQueue) {
                order.display();
                System.out.println();
            }
        }
    }

    static void bookTable(Scanner sc) {
        sc.nextLine();
        System.out.print("Customer Name: ");
        String name = sc.nextLine();
        System.out.print("Contact Number: ");
        String contact = sc.nextLine();
        System.out.print("Table Number: ");
        int tableNo = sc.nextInt();
        sc.nextLine();
        System.out.print("AC or Non-AC: ");
        String acType = sc.nextLine();
        System.out.print("Number of Members: ");
        int members = sc.nextInt();

        bookings.add(new Booking(name, contact, tableNo, acType, members));
        System.out.println("Table booked successfully.");
    }

    static void viewBookings() {
        if (bookings.isEmpty()) {
            System.out.println("No bookings.");
        } else {
            for (Booking b : bookings) {
                b.display();
                System.out.println();
            }
        }
    }
}