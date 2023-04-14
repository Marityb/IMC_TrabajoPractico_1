import java.text.DecimalFormat;
import java.util.Scanner;

public class imc {

    private static final Scanner SCANNER = new java.util.Scanner(System.in);

    public static void main(String[] args) {
    
        System.out.println("***DESCUBRE TU INDICE DE MASA CORPORAL***");
        
        DecimalFormat df = new DecimalFormat("###,###.#");

        System.out.println("ingresa tu peso:");
        double peso = SCANNER.nextDouble();

        System.out.println("ingresa tu altura:");
        double altura = SCANNER.nextDouble();

        double alturaAlCuadrado = Math.pow(altura, 2);
        double imc = peso / alturaAlCuadrado;

        System.out.println("Tu indice de masa coerporal es: " + df.format(imc));
        
        if (imc <= 15) {
            
            System.out.println("***Tu estado es de Delgadez muy severa");
        }
        if (imc >= 15 && imc <= 15.9) {

            System.out.println("***Tu estado es de Delgadez severa");
        }
        
        if (imc >= 16 && imc <= 18.4) {
            
            System.out.println("***Tu estado es de Delgadez.");
   
        }
        if (imc >= 18.5 && imc <= 24.9) {
 
            System.out.println("***Estás en el peso correcto");
        }
        if (imc >= 25 && imc <= 29.9) {
         
            System.out.println("***Tu estado es de Sobrepeso");
        }
        
        if (imc >= 30 && imc <= 34.9) {
           
            System.out.println("***Tu estado es de Obesidad moderada");
        }
        
        if (imc >= 35 && imc <= 39.9) {
           
            System.out.println("***Tu estado es de Obesidad severa");
        }
        
        if (imc >= 40) {
           
            System.out.println("***Tu estado es: Obesidad Mórbida");
        }
    }

    public static Scanner getScanner() {
        return SCANNER;
    }
 }