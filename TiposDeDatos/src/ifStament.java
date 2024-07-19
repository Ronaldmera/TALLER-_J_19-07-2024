public class ifStament {
    public static void main(String[] args) {
        boolean isBluetoothEnable = false;

        if(isBluetoothEnable){
            int cantidadDeConexiones = 1;
            System.out.println("La conexion es exitosa");
            cantidadDeConexiones++;
            System.out.println("La cantidad de conexiones es: "+cantidadDeConexiones);
        }else{
            System.out.println("No se pudo realizar la conexion");
        }


    }
}
