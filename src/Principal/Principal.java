package Principal;

import Methods.Query_currency;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String menu = """ 
            Please choose one of the following options:
            1) USD -> ARS
            2) ARS -> USD
            3) USD -> BRL
            4) BRL -> USD
            5) USD -> BOB
            6) BOB -> USD
            7) Exit
            """;
        int choice = 0;
        int value = 0;
        boolean exit = true;
        String convertedAmount = "";
        Query_currency query_currency = new Query_currency();

        while (exit){
            System.out.println(menu);
            choice = teclado.nextInt();
            switch (choice){
                case 1:
                    System.out.println("Write the value you wish to convert");
                    value = teclado.nextInt();
                    convertedAmount = query_currency.getConvertedAmount("USD", "ARS", value);
                    System.out.println(convertedAmount);
                    break;
                case 2:
                    System.out.println("Write the value you wish to convert");
                    value = teclado.nextInt();
                    convertedAmount = query_currency.getConvertedAmount("ARS", "USD", value);
                    System.out.println(convertedAmount);
                    break;
                case 3:
                    System.out.println("Write the value you wish to convert");
                    value = teclado.nextInt();
                    convertedAmount = query_currency.getConvertedAmount("USD", "BRL", value);
                    System.out.println(convertedAmount);
                    break;
                case 4:
                    System.out.println("Write the value you wish to convert");
                    value = teclado.nextInt();
                    convertedAmount = query_currency.getConvertedAmount("BRL", "USD", value);
                    System.out.println(convertedAmount);
                    break;
                case 5:
                    System.out.println("Write the value you wish to convert");
                    value = teclado.nextInt();
                    convertedAmount = query_currency.getConvertedAmount("USD", "BOB", value);
                    System.out.println(convertedAmount);
                    break;
                case 6:
                    System.out.println("Write the value you wish to convert");
                    value = teclado.nextInt();
                    convertedAmount = query_currency.getConvertedAmount("BOB", "USD", value);
                    System.out.println(convertedAmount);
                    break;
                case 7:
                    exit = false;
                    System.out.println("Thanks for using the program");
                    break;
                default:
                    System.out.println("Please choose another option");
                    break;
            }
        }
    }
}