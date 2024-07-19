public class Casting {
    public static void main(String[] args) {
        //en un año yo recupere 30 gatos y quiero saber cuantos gatos recupere al mes

        double gatosMes = 30.0/12.0;
        System.out.println(gatosMes);
        int estigmacionGatosMes = (int)gatosMes;
        System.out.println(estigmacionGatosMes);
        int a = 30;
        int b = 12;
        System.out.println(a/b);
        System.out.println((double)a/b);
        char n = '@';
        int nI = n;
        System.out.println(nI);
        short nS = (short) n;
        System.out.println(nS);
    }
}
