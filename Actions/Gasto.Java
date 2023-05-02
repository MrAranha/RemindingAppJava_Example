package Actions;

import Enums.*;

public class Gasto {
    public String NomeGasto;
    public double ValorGasto;
    public Meses Mes;

    public Gasto() {
    }

    public Gasto(String NomeGasto, double ValorGasto, Meses Mes) {
        this.ValorGasto = ValorGasto;
        this.NomeGasto = NomeGasto;
        this.Mes = Mes;
    }
}