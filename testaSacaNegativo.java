public class testaSacaNegativo
{
    public static void main(String[] args)
    {
        conta contaNegativa = new conta(421,73862);

        contaNegativa.deposita(100);
        contaNegativa.saca(200);

        System.out.println(contaNegativa.pegaSaldo());


    }
}
