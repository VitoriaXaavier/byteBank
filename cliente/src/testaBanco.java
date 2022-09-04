public class testaBanco
{
    public static void main(String[] args)
    {
        cliente titular = new cliente();

        titular.nome = "Paulo Silva";
        titular.cpf = "222.222.222-22";
        titular.profissao = "professor";

        conta contaPaulo = new conta();
        contaPaulo.deposita(100);

        contaPaulo.titular = titular;
        System.out.println(contaPaulo.titular.nome);
        System.out.println(contaPaulo.titular.cpf);
        System.out.println(contaPaulo.titular.profissao);





    }
}
