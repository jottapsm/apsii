package br.unipe.apsii;

import java.util.ArrayList;
import java.util.List;

public class GerenteDeFiguras {

    private List<FiguraGeometrica> figuras;

    public GerenteDeFiguras() {
        figuras = new ArrayList<FiguraGeometrica>();
    }

    public void adicionaFigura(FiguraGeometrica figura) {
        figuras.add(figura);
    }

    public void imprimeFiguras() {
        for (FiguraGeometrica figura : figuras) {
            System.out.println(figura.getNomeFigura());
        }
    }

    public double getMaiorAreaDeFigura() {
        double maior = 0;

        for (FiguraGeometrica figura : figuras) {
            if (figura.calculaArea() > maior) {
                maior = figura.calculaArea();
            }
        }

        return maior;
    }

    public double getAreaTotal() {
        double total = 0;

        for (FiguraGeometrica figura : figuras) {
            total = total + figura.calculaArea();
        }

        return total;
    }
}


