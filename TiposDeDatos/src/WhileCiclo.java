public class WhileCiclo {
    static boolean isTurnOnlight= true;
    public static void main(String[] args) {
        for (int i = 1; i <=10 ; i++) {
            printSOS();
        }

        System.out.println(turnOnOffLight());


    }
    public static void printSOS (){
        System.out.println("...___...");
    }
    public static boolean turnOnOffLight(){
        isTurnOnlight=(isTurnOnlight)?false:true;
        return isTurnOnlight;
    }
}
