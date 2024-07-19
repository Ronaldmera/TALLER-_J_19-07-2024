public class UpdatingVariables {
    public static void main(String[] args) {
        int salario = 1000000;
        //bono
        salario += 200000;
        System.out.println(salario);
        //pension
        salario -= 100000;
        System.out.println(salario);
        //horas extra $10000
        salario += (2*10000);
        System.out.println(salario);

        //nombre
        String nombre = "Alberto";
        System.out.println(nombre);
        //concatenar

        nombre = nombre +" Mera";
        System.out.println(nombre);
        nombre = "Ronald " + nombre;
        System.out.println(nombre);

    }
}
