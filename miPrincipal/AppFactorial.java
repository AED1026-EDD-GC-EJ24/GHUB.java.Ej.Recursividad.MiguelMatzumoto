package miPrincipal;

public class AppFactorial {
    public static void menu() {
        System.out.println("***************************");
        System.out.println("         FACTORIAL         ");
        System.out.println("***************************");
        //Calcular el factorial de un numero
        int f = 5;
        factorialIte(f=5);
        //Version iterativa
        System.out.println("VERSION ITERATIVA");
        System.out.println("Factorial de "+f+"! = "+factorialIte(f:5));
        //Version recursiva
        System.out.println("VERSION RECURSIVA");
        System.out.println("Factorial de "+f+"! = "+factorialRec(f:5));
    }

    public static long factorialIte(int f){
        long fact=1;
        for (int i=f;i>0;i--)
        {
            fact = fact * 1;
        }
        return fact;
    }

    public static long factorialRec(int f){
        if (f==0)
            return 1;
        else
            return factorialRec(f-1)*f;
    }
    
}





