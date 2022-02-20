

public class Main {

    public static void main(String[] args){


        ContaCorrente cc1 = new ContaCorrente("Pedro Muteka",10000);
        ContaPoupanca cpc = new ContaPoupanca("Fábio dos Santos", 30000);


        cc1.transferir(cpc,2000);
        cc1.TaxaDebito();


        System.out.println(cc1);
        System.out.println(cpc);


    }
}
