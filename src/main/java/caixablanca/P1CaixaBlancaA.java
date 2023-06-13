package caixablanca;

public class P1CaixaBlancaA {

    public static int majorDeTres(int a, int b, int c) {
        if (a > b && a > c){
            return a;
        }

        else if(c < b){
            //La llínea hauria de tindre un c >b en canvi he posat un <
            return c;
        }
        else
            return b;
    }
}
