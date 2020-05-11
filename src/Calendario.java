public class Calendario
{
    public int mes;
    public int ano;
    public int dia;

    @Override
    public String toString() {
        return "Calend" +
                "/" + mes +
                "/" + ano +
                "/=" + dia
                ;
    }

    public Calendario(int mes, int ano, int dia) {
        this.mes = mes;
        this.ano = ano;
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }
}
