public class FuncionesPesos {
    public static void main(String[] args) {
        System.out.println("PESOS A DOLARES: "+ conversor(2000000,"Pesos Colombianos"));
        System.out.println("PESOS DOLARES: "+ conversor(20000,"Pesos Mexicanos"));

    }

    /**
     * Description: Funcion que sirve para colocar un tipo de moneda y convierte la cantidad a dolares
     * @param cantidad: los pesos colombianos o mexicanos que se tengan
     * @param TipoMoneda: Tipo de peso colombiano o mexicano
     * @return cantidad
     */

    public static double conversor(double cantidad,String TipoMoneda){
        switch (TipoMoneda){
            case "Pesos Mexicanos":
                cantidad = cantidad*0.54;
                break;
            case "Pesos Colombianos":
                cantidad = cantidad*0.00024;
                break;
        }return cantidad;

    }

}
