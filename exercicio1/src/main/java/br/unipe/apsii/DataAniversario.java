package br.unipe.apsii;
public class DataAniversario {

    private int dia;
    private int mes;

    public DataAniversario(int dia, int mes) {
        this.dia = dia;
        this.mes = mes;
    }

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }


    public boolean equals(Object obj) {
        if (obj instanceof DataAniversario) {
            DataAniversario outra = (DataAniversario) obj;

            return this.dia == outra.dia &&
                    this.mes == outra.mes;
        }

        return false;
    }
}