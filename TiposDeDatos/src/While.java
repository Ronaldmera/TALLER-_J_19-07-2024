import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        int respuesta = 4;
        while (respuesta != 0) {
            System.out.println("Selecciona una opcion: ");
            System.out.println("1. Movies");
            System.out.println("2. Series");
            System.out.println("3: Documentales");
            System.out.println("0: Salir");

            Scanner sc = new Scanner(System.in);
            respuesta = Integer.valueOf(sc.nextLine());
            switch (respuesta) {
                case 0:
                    System.out.println("Gracias por visitarnos");
                    break;
                case 1:
                    System.out.println("Bienvenido a Movies");
                    break;
                case 2:
                    System.out.println("Bienvenido a Series");
                    break;
                case 3:
                    System.out.println("Bienvenido a Documentales");
                    break;

                default:
                    System.out.println("Escogiste una opcion incorrecta");
            }


        }
    }
}
