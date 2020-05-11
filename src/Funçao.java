public class Funçao
{

    public void dias_do_ano(Calendario x)
    {
        int dias_decorridos;
        dias_decorridos=x.mes;
        dias_decorridos=dias_decorridos*30;
        dias_decorridos=dias_decorridos-x.dia;
        System.out.println("dias decorridos "+dias_decorridos);

    }
    public void dias_do_ano(Calendario x,String mes)
    {

        int dias_decorridos;
        dias_decorridos=Integer.parseInt(mes);
        dias_decorridos=dias_decorridos*30;
        dias_decorridos=dias_decorridos-x.dia;
        System.out.println("dias decorridos "+dias_decorridos);

    }


}
