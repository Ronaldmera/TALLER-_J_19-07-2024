public class Funciones {
    public static void main(String[] args) {
        double y = 3;
        double area = areaCirculo(y);
        System.out.println(area);
        double areaC = areaCuadrada(4);
        System.out.println(areaC);

    }
    public static double areaCirculo(double r) {
        return Math.pow(r,2);
    }
    public static double areaCuadrada(double lado) {
        return lado*lado;
    }
}
