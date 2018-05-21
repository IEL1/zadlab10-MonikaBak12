package pl.edu.ur.oopl10;

import java.util.Scanner;

/**
 *
 * @author mchla
 */
public class Main {

    public static void main(String[] args) {
        
    
        Scanner scanner = new Scanner(System.in);
        int dzielna = scanner.nextInt();
        int dzielnik = scanner.nextInt();
        
       
        try {
            
            int wynik = dzielna / dzielnik;
            System.out.println("Niewykonalne!!!");
        } 
        catch (ArithmeticException e) {
            System.out.print("Niepoprawna dzielna");
        
            
        }
        
    }

    }
    
