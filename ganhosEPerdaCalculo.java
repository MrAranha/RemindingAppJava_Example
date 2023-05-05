import Actions.Gasto;
import Actions.Ganho;
import Enums.*;

public class ganhosEPerdaCalculo {
    public static double SomaDeGanhosMes(Gasto[] gasto, Meses Mes)
    {
        double result = 0;
        for(int i = 0; i < gasto.length; i++)
        {
            if (gasto[i] != null)
              if (gasto[i].Mes != null)
                if (gasto[i].Mes == Mes)
                {
                    result += gasto[i].ValorGasto;
                }
        }
        return result;
    }    

    public static double SomaDeGastosMes(Ganho[] ganho, Meses Mes)
    {
        double result = 0;
        for(int i = 0; i < ganho.length; i++)
        {
            if (ganho[i] != null)
              if (ganho[i].Mes != null)
                if (ganho[i].Mes == Mes)
                {
                    result += ganho[i].ValorGanho;
                }
        }
        return result;
    }    
}
