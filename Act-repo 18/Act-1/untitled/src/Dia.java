import javax.naming.Binding;

public enum Dia
{
    LUNES,MARTES,MIERCOLES,JUEVES,VIERNES,SABADO,DOMINGO;

    public static Idioma indice;


    public String fr[] = {"lundi","mardi","mercredi","jeudi","vendredi","samedi","dimache"};
    public String en[] = {"monday","tuesday","wednesday","thursday","friday","satuday","sunday"};
    public String es[] = {"lunes","martes","miercoles","jueves","viernes","sabado","domingo"};


    public void cambiarIdioma(Idioma sent){
        indice = sent;
    }


    public String toString()
    {
        switch(indice)
        {
            case ESPAÑOL: return es[this.ordinal()];
            case INGLES: return en[this.ordinal()];
            case FRANCES: return fr[this.ordinal()];
            default: return es[this.ordinal()];
        }
    }



}
