package miPrincipal;
public class AppLadrillos {
    public static void menu(){
        //Soulucion iterativa
        for (int i=0;i<10;i++){
            dibujarHilera();
        }
        //Solucion recursiva
        int n=0;
        dibujarPared(n);
    }
    public static void dibujarPared(int n){
        if (n<10)
        dibujarPared(n+1); 
        System.out.println("XXXXXXXXXXXXXXXXXXX"+n);
    }
    public static void dibujarHilera(){
        System.out.println("XXXXXXXXXXXXXXXXXXX");
    }
}