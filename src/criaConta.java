public class criaConta
{
    public static void main(String[] args)
    {
        conta conta1 = new conta();

        conta1.cliente = "Vitoria Alves";

        System.out.println("Nome do titular: " + conta1.cliente);


        conta1.saldo = 200;
        System.out.println("Saldo: " + conta1.saldo);

        conta1.saldo = (conta1.saldo * 0.02) + conta1.saldo;
        System.out.println("O valor atual com os juros de 2% é de: " + conta1.saldo);

        conta1.agencia = 002;
        System.out.println("Agencia: " + conta1.agencia);

        conta1.numeroConta = 123456;
        System.out.println("Conta: " + conta1.numeroConta);

        System.out.println("__________________________________");

        conta segundaConta = new conta();

        segundaConta.cliente = "Andre Silva";


        System.out.println("Nome do titular: " + segundaConta.cliente);


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
