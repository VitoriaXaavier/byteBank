public class testeGetSet
{
    public static void main(String[] args)
    {
        // construtor obriga a passar os parametros

        conta conta1 = new conta(10, 1245);

        cliente titular = new cliente();

        titular.setNome("Vitoria");
        System.out.println("Titular da conta: " + titular.getNome());
        titular.setCpf("111.111.111-11");
        System.out.println("CPF: " + titular.getCpf());
        titular.setProfissao("Estudante");
        System.out.println("Profissão: " + titular.getProfissao());

        System.out.println("Número da conta: " + conta1.getNumeroConta());
        System.out.println("Número da agencia: " + conta1.getAgencia());
        System.out.println("Total de contas: " + conta.getTotal());
    }
}
