package com.lt;

import com.lt.ecommerce.controller.*;
import com.lt.ecommerce.service.ConnectionService;

import java.sql.SQLException;
import java.util.Scanner;

public class App {

    private  static final ConnectionService connectionService = new ConnectionService();
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws SQLException {
        int option;
        do {
            System.out.println("--------Ecommerce--------");
            System.out.println("Please choose the option");
            System.out.println("1 Go to customer section");
            System.out.println("2 Go to shop section");
            System.out.println("3 Go to product section");
            System.out.println("4 Go to order section");
            System.out.println("5 Go to order delivery section");
            System.out.println("9 Exit");
            option = Integer.parseInt(scanner.nextLine());

            UserController userController = new UserController();
            ShopController shopController = new ShopController();
            ProductController productController = new ProductController();
            OrderController orderController = new OrderController();
            OrderDeliveryController orderDeliveryController = new OrderDeliveryController();
//            CartController cartController = new CartController();

            switch (option) {
                case 1: {
                    userController.run();
                    break;
                }
                case 2: {
                    shopController.run();
                    break;
                }
                case 3: {
                    productController.run();
                    break;
                }
                case 4: {
                    orderController.run();
                    break;
                }
                case 5: {
//                    cartController.run();
                    break;
                }
                case 6: {
                    orderDeliveryController.run();
                    break;
                }
            }

        } while(option != 9);
    }
}
