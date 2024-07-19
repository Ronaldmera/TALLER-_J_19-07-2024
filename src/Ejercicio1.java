public class Ejercicio1 {
    public static void main(String[] args) {
        /*
        1.	Encontrar, dentro de un arreglo de números enteros, un par de enteros que sumen un número dado. Ejemplo:
         Si la entrada es el arreglo [8, 7, 2, 5, 3, 1] y la suma objetivo es 10, los pares encontrados deben ser (8,2) y (7,3). 2.
         */

        int [] enteros = {1,4,5,7};
        int sumaObjetiv = 6;
        recorrido(enteros, sumaObjetiv);

    }
    public static void recorrido(int[] array, int sumaObjetivo){

        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j < array.length; j++) {
                int suma = array[i] + array[j];
                if(sumaObjetivo == suma){
                    System.out.println("Los numeros son: "+array[i]+ " y "+ array[j]);
                }else;
                //hola
            }

        }
    }
}
