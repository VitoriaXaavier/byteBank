public class criaConta
{
    public static void main(String[] args)
    {
        conta conta1 = new conta(120, 63726);

        cliente titular = new cliente();

        titular.setNome("Vitoria");
        System.out.println("Titular da conta: " + titular.getNome());
        titular.setCpf("111.111.111-11");
        System.out.println("CPF: " + titular.getCpf());
        titular.setProfissao("Estudante");
        System.out.println("Profissão: " + titular.getProfissao());


        conta1.deposita(200);
        System.out.println("Saldo: " + conta1.pegaSaldo());

        conta1.deposita( (conta1.pegaSaldo() * 0.02) + conta1.pegaSaldo());
        System.out.println("O valor atual com os juros de 2% é de: " + conta1.pegaSaldo());



        System.out.println("__________________________________");

        conta segundaConta = new conta(67,98208);

        cliente titular2 = new cliente();

        titular.setNome("Andre");
        System.out.println("Titular da conta: " + titular.getNome());
        titular.setCpf("111.111.111-11");
        System.out.println("CPF: " + titular.getCpf());
        titular.setProfissao("Contador");
        System.out.println("Profissão: " + titular.getProfissao());

        segundaConta.deposita(304.5);
        System.out.println("Saldo: " + segundaConta.pegaSaldo());

        segundaConta.deposita ((segundaConta.pegaSaldo() * 0.02) + segundaConta.pegaSaldo());
        System.out.println("O valor atual com os juros de 2% é de: " + segundaConta.pegaSaldo());


    }
}
