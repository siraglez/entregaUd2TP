import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(("Introduzca la distancia recorrida (km): "));
        double distanciaRecorrida = scanner.nextDouble();

        System.out.println("Introduzca el tiempo transcurrido (horas): ");
        double tiempoTranscurrido = scanner.nextDouble();

        //Llamamos a la función que calcula la velocidad media
        double velocidadMedia = calcularVelocidadMedia(distanciaRecorrida, tiempoTranscurrido);

        System.out.println("La velocidad media es: " + velocidadMedia + " km/h");
    }

    //Función que calcula la velocidad media
    public static double calcularVelocidadMedia(double distancia, double tiempo) {
        if (tiempo == 0) {
            System.out.println("El tiempo no puede ser cero. Por favor comprueba que has introducido los datos correctamente.");
            return 0;
        }
        return distancia / tiempo;
    }
}
