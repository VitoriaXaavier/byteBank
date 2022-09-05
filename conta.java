public class conta {

    private double saldo;
    private int agencia;
    private int numeroConta;
    private static int total;
    private String titular;

    //construtor
    public conta(int agencia, int numeroConta)
    {
        conta.total++;
        System.out.println("O total de contas é: " + conta.total);
        this.agencia = agencia;
        this.numeroConta = numeroConta;
        System.out.println("Agencia: " + agencia);
        System.out.println("Conta: " + numeroConta);
    }


    public void deposita(double valor)
    {
        this.saldo += valor;
    }

    public boolean saca(double valor)
    {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            return true;
        } else {
            return false;
        }
    }
   public boolean transfere(double valor, conta destino)
    {
        if(this.saldo >= valor)
        {
            this.saldo -= valor;
            destino.deposita(valor);
            return true;
        }
        else
        {
            return false;
        }
    }

    public double pegaSaldo()
    {
        return this.saldo;
    }

    public int getNumeroConta()
    {
        return this.numeroConta;
    }

    public void setNumeroConta(int novoNumeroConta)
    {
        if (numeroConta <= 0)
        {
            System.out.println("Valor < ou = a 0 não pode");
            return;
        }
        this.numeroConta = novoNumeroConta;
    }

    public int getAgencia()
    {
        return this.agencia;
    }

    public void setAgencia(int novaAgencia)
    {
        if (agencia <= 0)
        {
            System.out.println("Valor < ou = a 0 são proibidos");
            return;
        }
        this.agencia = novaAgencia;
    }
    public String getTitular()
    {
        return this.titular;
    }

    public void setTitular(String novoTitular)
    {
        this.titular = novoTitular;
    }

    public static int getTotal()
    {
        return conta.total;
    }
}
