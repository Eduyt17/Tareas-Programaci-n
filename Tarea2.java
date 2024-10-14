public class Main {
    public static void main(String[] args) {
        // 1. 3 < 5 && 7 >= 2
        evaluar(3 < 5 && 7 >= 2, "3 < 5 && 7 >= 2");

        // 2. 10 != 8 || 15 == 15
        evaluar(10 != 8 || 15 == 15, "10 != 8 || 15 == 15");

        // 3. !(5 > 6) && 2 <= 3
        evaluar(!(5 > 6) && 2 <= 3, "!(5 > 6) && 2 <= 3");

        // 4. (8 == 8 || 3 < 1) && 6 > 2
        evaluar((8 == 8 || 3 < 1) && 6 > 2, "(8 == 8 || 3 < 1) && 6 > 2");

        // 5. 12 != 10 && (4 < 8 || 9 == 9)
        evaluar(12 != 10 && (4 < 8 || 9 == 9), "12 != 10 && (4 < 8 || 9 == 9)");

        // 6. (3 + 5) == 8 || (7 * 2) <= 14
        evaluar((3 + 5) == 8 || (7 * 2) <= 14, "(3 + 5) == 8 || (7 * 2) <= 14");

        // 7. !(9 <= 5) && (4 == 4 || 6 != 6)
        evaluar(!(9 <= 5) && (4 == 4 || 6 != 6), "!(9 <= 5) && (4 == 4 || 6 != 6)");

        // 8. 10 % 2 == 0 || (5 > 1 || 12 != 10)
        evaluar(10 % 2 == 0 || (5 > 1 || 12 != 10), "10 % 2 == 0 || (5 > 1 || 12 != 10)");

        // 9. (3 * 3 == 9) && !(8 < 5 || 7 >= 9)
        evaluar((3 * 3 == 9) && !(8 < 5 || 7 >= 9), "(3 * 3 == 9) && !(8 < 5 || 7 >= 9)");

        // 10. !(5 + 5 != 10) && (2 * 3 > 5 || 6 == 7)
        evaluar(!(5 + 5 != 10) && (2 * 3 > 5 || 6 == 7), "!(5 + 5 != 10) && (2 * 3 > 5 || 6 == 7)");

        // Puedes continuar con las demás expresiones siguiendo el mismo patrón
    }

    // Método para evaluar y mostrar los resultados
    public static void evaluar(boolean expresion, String descripcion) {
        if (expresion) {
            System.out.println("El resultado de la operación " + descripcion + " es verdadero");
        } else {
            System.out.println("El resultado de la operación " + descripcion + " es falso");
        }
    }
}
