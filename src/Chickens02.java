public class Chickens02 {
    public static void main(String[] args) {
        //Put yout code here
        int segunda = 100, terca = 121, quarta = 117;
        int mediaDiaria = (segunda+terca+quarta)/3;
        System.out.println("Media diaria: "+mediaDiaria);
        double mediaMensal = mediaDiaria*30;
        System.out.println("Media mensal: "+mediaMensal);
        double valorAoMes = mediaMensal * 0.18;
        System.out.println("Lucro com base na media mensal: "+valorAoMes);
    }
    
}
