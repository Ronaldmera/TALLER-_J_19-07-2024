public class Arrays {
    public static void main(String[] args) {
        String[] versionesAndroid= new String[17];
        String diasSemana [] = new  String[7];
        String cuidades[][] = new String[4][2];// para calcular la cantidad de elementos del array se multiplica las columnas * las filas
        int[][][] numeros = new int[2][2][2];
        versionesAndroid[0]= "Apple pie";
        versionesAndroid[1]= "Banana Bread";
        versionesAndroid[2]= "Cupcake";
        versionesAndroid[3]= "Donut";
        System.out.println(versionesAndroid[0]);
        System.out.println(versionesAndroid[1]);
        System.out.println(versionesAndroid[2]);
        System.out.println(versionesAndroid[3]);
        System.out.println();
        System.out.println();
        for (int i = 0; i < versionesAndroid.length; i++) {
            System.out.println(versionesAndroid[i]);

        }
        System.out.println();
        //forEach
        for (String versionAndroid: versionesAndroid){
            System.out.println(versionAndroid);
        }
        for (int i = 0; i < diasSemana.length; i++) {
            System.out.println(diasSemana[i]);

        }
        //fila//columna
        cuidades[0] [0]= "Colombia";
        cuidades[0] [1]= "Medellin";
        cuidades[1] [0]= "Mexico";
        cuidades[1] [1]= "DF";
        cuidades[2] [0]= "Colombia";
        cuidades[2] [1]= "Bogotá";
        cuidades[3] [0]= "México";
        cuidades[3] [1]= "Puerto";
        System.out.println(cuidades[0][0]);
        System.out.println(cuidades[0][1]);
        System.out.println(cuidades[1][0]);
        System.out.println(cuidades[1][1]);
        System.out.println(cuidades[2][0]);
        System.out.println(cuidades[2][1]);
        System.out.println(cuidades[3][0]);
        System.out.println(cuidades[3][1]);
        System.out.println();
        for (int i = 0; i < cuidades.length; i++) {
            for (int j = 0; j < cuidades[i].length; j++) {
                System.out.println(cuidades[i][j]);

            }

        }




    }
}
