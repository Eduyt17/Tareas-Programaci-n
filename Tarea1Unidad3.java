public class Main {
    public static void main(String[] args) {
        // Datos de entrada
        String nombreCliente = "Carlos Martinez";
        String direccionIP = "192.168.0.1";
        int numeroCliente = 12345;

        // Cifrado del nombre del cliente
        String nombreCifrado = cifrarNombre(nombreCliente);
        
        // Cifrado de la dirección IP
        String ipCifrada = cifrarIP(direccionIP);
        
        // Cifrado del número de cliente
        double numeroCifrado = cifrarNumeroCliente(numeroCliente);
        
        // Formato final
        String datosCifrados = nombreCifrado + "|" + ipCifrada + "|" + numeroCifrado;
        System.out.println("Datos cifrados: " + datosCifrados);
    }

    // Función para cifrar el nombre del cliente
    public static String cifrarNombre(String nombre) {
        // Intercambiar la primera y última letra
        char primeraLetra = nombre.charAt(0);
        char ultimaLetra = nombre.charAt(nombre.length() - 1);
        nombre = ultimaLetra + nombre.substring(1, nombre.length() - 1) + primeraLetra;

        // Reemplazar vocales por números
        nombre = nombre.replace('a', '1')
                       .replace('e', '2')
                       .replace('i', '3')
                       .replace('o', '4')
                       .replace('u', '5');
        
        return nombre;
    }

    // Función para convertir la IP a hexadecimal
    public static String cifrarIP(String ip) {
        String[] octetos = ip.split("\\.");
        String ipHex = "";
        
        for (int i = 0; i < octetos.length; i++) {
            int valor = Integer.parseInt(octetos[i]);
            ipHex += Integer.toHexString(valor);
            if (i < octetos.length - 1) {
                ipHex += ".";
            }
        }
        
        return ipHex;
    }

    // Función para cifrar el número de cliente
    public static double cifrarNumeroCliente(int numero) {
        return (numero * 3 + 15) / 2.0;
    }
}
