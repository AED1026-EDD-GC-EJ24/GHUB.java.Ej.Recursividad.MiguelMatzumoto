package miPrincipal;

import java.util.Hashtable;
import java.util.Scanner;

public class AppFibonacci {
    public static void menu(){
        System.out.println("*****************************");
        System.out.println("*****Serie de Fibonacci******");
        System.out.println("*****************************");

        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese un valor:");
        int n= entrada.nextInt();

        //invoco a funcion iterativa
        double f=fibonacciIte(n);
        System.out.println(f);

        //invoco a la funcion iterativa
        f= fibonacciRec(n);
        System.out.println(f);


    }
    static double fibonacciIte(int n){
        double f=1, r1=1, r2=2;
        for(int i=3; i<=n;i++){
            f=r1+r2;
            r1 = r2;
        }
        return f;


    }
    static double fibonacciRec(int n){
        cont++;
        double f;
        if(n<=2)
            f=1;
        else
            f=fibonacciRec(n-1)+fibonacciRec(n-2);
        return f;
    }
    static long getContador(){
        return cont;
    }
    static double fibonacciRecOptimizado(int x, Hashtable<Integer, Double>t){
        //primero verificamos esta en la tabla
        Double d = t.get(x);
        //si no esta entonces lo calculamos y lo ingresamos a la tabla
        if(d==null){
            d=fibonacciRecOptimizado(x-1, t)+fibonacciRecOptimizado(x-2, t);
            t.put(x, d);
        }
        return d;
    }
    
}
