import Enums.*;
import java.util.*;

public class escolhaMeses {
    public static Meses mesEscolha() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Mês do ano:");
        int mesIndex = 1;
        for (Meses meses : Meses.values()) {
            System.out.print("\n" + mesIndex + ": " + meses);
            mesIndex++;
        }
        System.out.println("");
        int value = scanner.nextInt();
        scanner.close();
        switch (value) {
            case 1:
                return Meses.JANEIRO;
            case 2:
                return Meses.FEVEREIRO;
            case 3:
                return Meses.MARCO;
            case 4:
                return Meses.ABRIL;
            case 5:
                return Meses.MAIO;
            case 6:
                return Meses.JUNHO;
            case 7:
                return Meses.JULHO;
            case 8:
                return Meses.AGOSTO;
            case 9:
                return Meses.SETEMBRO;
            case 10:
                return Meses.OUTUBRO;
            case 11:
                return Meses.NOVEMBRO;
            case 12:
                return Meses.DEZEMBRO;
            default:
                System.out.println("Somente números de 1 a 12!");
                System.exit(0);
        }
        return null;
    }
}