package miPrincipal;

public class Alfabeto {
    public static void main(String[] args) {
        System.out.println("");
        metodoA('Z');
        System.out.println("");
    }
    static void metodoA(char c){
        if(c>'A')
        System.out.println(c);
        metodoB(c);
    }
    static void metodoB(char c){
        metodoA(--c);
    }
    
}