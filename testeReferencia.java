public class testeReferencia
{
    public static void main(String[] args)
    {
        conta primeiraConta = new conta(132,14567);

        primeiraConta.deposita(300);
        System.out.println("saldo da primeira conta: " + primeiraConta.pegaSaldo());

        conta segundaConta = primeiraConta;
        System.out.println("O saldo da segunda conta: " + segundaConta.pegaSaldo());

        segundaConta.deposita(100);
        System.out.println(" + 100. segunda conta " + segundaConta.pegaSaldo());

        System.out.println(" primeira conta " + primeiraConta.pegaSaldo());

        // não são contas reais, mas sim uma referencia a uma mesma conta. duas setas para uma conta.

    }
}
