


public class ContaCorrente extends Conta {

    public ContaCorrente(String titular, double saldo){
        super(titular,saldo);
    }

    public Boolean TaxaDebito(){
        if(this.getSaldo()>0){
            this.setSaldo(getSaldo()-200);
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Conta{" +
                "nome='" + this.getTitular() + '\'' +
                ", saldo=" + this.getSaldo() +
                '}';
    }


}
