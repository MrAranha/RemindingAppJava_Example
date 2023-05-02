package Actions;

import Enums.*;

public class Ganho {

    public String NomeGanho;
    public double ValorGanho;
    public Meses Mes;

    public Ganho() {
    }

    public Ganho(String NomeGanho, double ValorGanho, Meses Mes) {
        this.ValorGanho = ValorGanho;
        this.NomeGanho = NomeGanho;
        this.Mes = Mes;
    }
}
