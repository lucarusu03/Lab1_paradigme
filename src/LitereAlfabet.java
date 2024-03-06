public class LitereAlfabet {
    static char c;
    static int i;
    static void afisLitere(){
        for(i=97;i<=122;i++) {
            c = (char)i;
            System.out.print(c + " ");
        }
        System.out.println();
        for(i=65;i<=90;i++){
            c = (char)i;
            System.out.print(c+ " ");
        }
    }
}
