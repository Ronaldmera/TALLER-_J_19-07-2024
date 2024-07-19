public class ejercicioCasting {
    public static void main(String[] args) {
        char c = 'z';
        int cCambio = c;
        System.out.println(cCambio);
        System.out.println((int) c);

        int i = 250;
        long iCambio = i;
        short cambio = (short) iCambio;

        System.out.println(iCambio);
        System.out.println(cambio);


        double d = 301.067;
        long dCambio = (long) d;

        System.out.println((long) d);
        System.out.println(dCambio);


        int iDos = 100;
        int mejora = iDos += 5000.66;
        float nueva = mejora;
        System.out.println(nueva);
        System.out.println((float) mejora);

        int iTres = 737;
        int nuevaDOs = iTres *= 100;
        byte otra = (byte) nuevaDOs;
        System.out.println(otra);
        System.out.println((byte)nuevaDOs);





    }
}
