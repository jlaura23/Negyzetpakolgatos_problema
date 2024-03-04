package negyzetpakolgatas;

public class Negyzetpakolgatas {
    public static void main(String[] args) {
        // Kezdeti állapot
        char[][] kezdetiAllapot = {
                {'C', ' ', ' '},
                {'A', 'B', ' '}
        };

        // Végállapot
        char[][] vegAllapot = {
                {'A'},
                {'B'},
                {'C'}
        };

        // Kezdeti állapot kiíratása
        System.out.println("Kezdeti állapot:");
        kiir(kezdetiAllapot);

        // Mozgatások végrehajtása
        char[][] aktualisAllapot = mozgatasokVege(kezdetiAllapot);

        // Végállapot kiíratása
        System.out.println("\nVégállapot:");
        kiir(vegAllapot);
    }

    // A négyzetek mozgatása
    public static char[][] mozgatasokVege(char[][] kezdetiAllapot) {
        char[][] aktualisAllapot = kezdetiAllapot;

        // C négyzet mozgatása a B négyzet alá
        char temp = aktualisAllapot[0][1];
        aktualisAllapot[0][1] = aktualisAllapot[1][0];
        aktualisAllapot[1][0] = temp;

        return aktualisAllapot;
    }

    // A mátrix kiíratása
    public static void kiir(char[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] != ' ' ? matrix[i][j] : " ");
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
