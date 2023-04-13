public class testing
{
    public static void main(String[] args)
    {
        Dia d1 = Dia.MIERCOLES;
        d1.cambiarIdioma(Idioma.INGLES);
        System.out.println(d1); // Imprime Wednesday
        Dia d2 = Dia.SABADO;
        System.out.println(d2);

        for (Idioma I:Idioma.values())
        {
            Dia.indice = I;
            for (Dia f:Dia.values()) {
                System.out.println(f);
            }
        }
    }
}