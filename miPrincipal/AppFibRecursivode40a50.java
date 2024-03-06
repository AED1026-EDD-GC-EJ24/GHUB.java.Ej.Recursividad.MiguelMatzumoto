package miPrincipal;

public class AppFibRecursivode40a50 {

public static void main(String[]args) {

}

public static void menu() {

System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

System.out.println("~~~ Optimizando Fibonacci Recursivo ~~~~");

System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

Performance p = new Performance();

int desde = 40;

int hasta = 50;

double ant = -1;

for(int i=desde;i<hasta;i++) {

//comenzamos tomando el tiempo

p.start();

//invocamos a la funcion recursiva

double f = Appfibonacci.fibonacciRec(i);

//detenemos el tiempo

p.stop();

System.out.println("f("+i+")= "+f+", "+p.getMillis()+"ms, "+AppFibonacci.getContador()+" veces");

if (ant>=0)

System.out.println("Incr = "+f/ant);

else

System.out.println();

ant = f ; //ahora eltermino sera el que reinicie el calulculo

}

}

}