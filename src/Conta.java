




public abstract class Conta{

    private String titular;
    private double saldo;




    public Conta(String titular, double saldo){
        this.titular = titular;
        this.saldo = saldo;
    }


    public Boolean depositar(double valor){
        if(valor>0){
            this.saldo += valor;
            return true;
        }
        return false;
    }

    public Boolean sacar(double valor){
        if(this.saldo>=valor){
            this.saldo -= valor;
            return true;
        }
        return false;
    }

    public Boolean transferir(Conta conta, double valor){
        if(valor>0){
            conta.depositar(valor);
            this.saldo -= valor;
            return true;
        }
        return false;
    }

    public String consultar(){

        return "Nome: "+this.titular
                    +"Saldo: "+this.saldo;
    }


    @Override
    public String toString() {
        return "Conta{" +
                "nome='" + titular + '\'' +
                ", saldo=" + saldo +
                '}';
    }



    /**
     * @return String return the nome
     */
    public String getTitular() {
        return titular;
    }

    /**
     * @param titular the nome to set
     */
    public void setTitular(String titular) {
        this.titular = titular;
    }

    /**
     * @return double return the saldo
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * @param saldo the saldo to set
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

}
