package miPrincipal;

import java.util.Scanner;

public class Principal {
    
    public static void main(String[] args) throws Exception {
        Scanner consola = new Scanner(System.in);
        int opc =0;
        do{
            System.out.println("*************************");
            System.out.println("      RECURSIVIDAD       ");
            System.out.println("*************************");
            System.out.println("1) LADRILLOS");
            System.out.println("2) Facotrial");
            System.out.println("3) NUMEROS NATURALES");
            System.out.println("4) Suma digitos");
            System.out.println("5) Recursividad indirecta");
            System.out.println("6) Maximo Comun divisor");
            System.out.println("7)");
            System.out.println("0) SALIR");
            System.out.print("Selecciona opción:");
            opc=consola.nextInt();

            switch (opc){
            case 1:
               AppLadrillos.menu();
               break;
            case 2:
                AppFactorial.menu();
                break;
            case 3:
                AppNaturales.menu();
                break;
               
            case 0:
               System.out.println("ADIOS!");
               consola.close();
               break;
               

            default:
               System.out.println("Valor incorrecto, intente de nuevo!");

        }
       
    }while (opc != 0);
		
    }
}


