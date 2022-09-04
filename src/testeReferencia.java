public class testeReferencia
{
    public static void main(String[] args)
    {
        conta primeiraConta = new conta();

        primeiraConta.saldo = 300;
        System.out.println("saldo da primeira conta: " + primeiraConta.saldo);

        conta segundaConta = primeiraConta;
        System.out.println("O saldo da segunda conta: " + segundaConta.saldo);

        segundaConta.saldo += 100;
        System.out.println(" + 100. segunda conta " + segundaConta.saldo);

        System.out.println(" primeira conta " + primeiraConta.saldo);

        // não são contas reais, mas sim uma referencia a uma mesma conta. duas setas para uma conta.

    }
}
