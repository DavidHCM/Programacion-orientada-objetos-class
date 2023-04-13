public enum Dia
{
    LUNES,MARTES,MIERCOLES,JUEVES,VIERNES,SABADO,DOMINGO;

    private int indice;

    Dia()
    {
        indice = 0;
    }

    public String fr[] = {"lundi","mardi","mercredi","jeudi","vendredi","samedi","dimache"};
    public String en[] = {"monday","tuesday","wednesday","thursday","friday","satuday","sunday"};
    public String es[] = {"lunes","martes","miercoles","jueves","viernes","sabado","domingo"};


    public void cambiarIdioma(Idioma lan){
        indice = lan.ordinal();
    }


    public String toString()
    {
        switch(indice)
        {
            case 0: return es[this.ordinal()];
            case 1: return en[this.ordinal()];
            case 2: return fr[this.ordinal()];
            default: return es[this.ordinal()];
        }
    }



}
