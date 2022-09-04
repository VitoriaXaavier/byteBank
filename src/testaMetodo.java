public class testaMetodo
{
    public static void main(String[] args)
    {
        conta conta1 = new conta();

        conta1.saldo = 100;
        conta1.deposita(50);
        System.out.println(" Saldo da conta 1 é de: " +conta1.saldo);

        boolean retirada = conta1.saca(20);

        System.out.println(" Conseguiu realizar o saque? " + retirada);
        System.out.println(" Após o saque o saldo da conta 1 é de: " + conta1.saldo);

        conta conta2 = new conta();

        conta2.deposita(1000);
       boolean transferencia = ( conta2.transfere(300,conta1));
       if(transferencia)
       {
           System.out.println("Transferencia realizada com suscesso!");
       }
       else
       {
           System.out.println("Infelizmente você não possui saldo suficiente!");
       }

    }
}
