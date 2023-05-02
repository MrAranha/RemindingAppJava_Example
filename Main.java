import java.io.*; 
import java.util.*;
import Actions.Ganho;
import Actions.Gasto;

public class Main {
    public static void main(String[] args) {
        boolean Menu = true;
        int escolha = 0;
        Scanner scanner = new Scanner(System.in);
        
        Ganho[] ganho = new Ganho[64];
        int ganhoIndex = 0;
        
        Gasto[] gasto = new Gasto[64];
        int gastoIndex = 0;

        System.out.println("Selecione o tipo de gasto:");
        while (Menu) {
            System.out.println("1: Ganho");
            System.out.println("2: Gasto");
            System.out.println("3: Relatorio");
            try {
                escolha = scanner.nextInt();
                if (escolha < 1 || escolha > 3) {
                    System.out.println("Apenas insira números de 1 a 3!");
                }
            } catch (Exception ex) {
                System.out.println("Apenas insira números de 1 a 3!");
                Menu = false;
            }
            switch (escolha) {
                case 1:
                    System.out.print("Insira o nome de seu ganho:");
                    String nome = scanner.next();
                    System.out.print("Insira valor de seu ganho:");
                    double value = scanner.nextInt();
                    Ganho newGanho = new Ganho(nome, value);
                    ganho[ganhoIndex] = newGanho; 
                    ganhoIndex++;
                    break;
                case 2:
                    System.out.print("Insira o nome de seu gasto:");
                    String nomeGasto = scanner.next();
                    System.out.print("Insira valor de seu gasto:");
                    double valueGasto = scanner.nextInt();
                    Gasto newgasto = new Gasto(nome, value);
                    gasto[gastoIndex] = newgasto; 
                    gastoIndex++;
                    break;
                case 3:
                    break;
                default:
                    break;
            }
        }
    }
}