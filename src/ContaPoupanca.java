


public class ContaPoupanca extends Conta {



    public ContaPoupanca(String titular, double saldo){
        super(titular,saldo);
    }

    public Boolean Rendimento(){
        if(this.getSaldo()>0){
            this.setSaldo(getSaldo()*1.5/100);
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
