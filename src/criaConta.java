public class criaConta
{
    public static void main(String[] args)
    {
        conta primeiraConta = new conta();

        primeiraConta.titular = "vitoria alves";
        System.out.println("Nome do titular: " + primeiraConta.titular);

        primeiraConta.saldo = 200;
        System.out.println("Saldo: " + primeiraConta.saldo);

        primeiraConta.saldo = (primeiraConta.saldo * 0.02) + primeiraConta.saldo;
        System.out.println("O valor atual com os juros de 2% é de: " + primeiraConta.saldo);

        primeiraConta.agencia = 002;
        System.out.println("Agencia: " + primeiraConta.agencia);

        primeiraConta.numeroConta = 123456;
        System.out.println("Conta: " +primeiraConta.numeroConta);

        System.out.println("__________________________________");

        conta segundaConta = new conta();

        segundaConta.titular = "andre silva";
        System.out.println("Nome do titular: " + segundaConta.titular);

        segundaConta.saldo = 304.5;
        System.out.println("Saldo: " + segundaConta.saldo);

        segundaConta.saldo = (segundaConta.saldo * 0.02) + segundaConta.saldo;
        System.out.println("O valor atual com os juros de 2% é de: " + segundaConta.saldo);

        segundaConta.agencia = 101;
        System.out.println("Agencia: " + segundaConta.agencia);

        segundaConta.numeroConta = 12375;
        System.out.println("Conta: " + segundaConta.numeroConta);

    }
}
