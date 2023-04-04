import java.util.Calendar;

public class persona {
    protected DateD fechaNac;
    protected String nombre,apellidoPaterno,apellidoMaterno;
    protected int edad;

    // Constructores

    public persona(String nombre, String apellidoPaterno, String apellidoMaterno)
    {
        setters_name(nombre);
        setters_AP(apellidoPaterno);
        setters_AM(apellidoMaterno);
    }

    public persona(String nombre, String apellidoPaterno, String apellidoMaterno, DateD fechas)
    {
        this(nombre,apellidoPaterno,apellidoMaterno);
        setters_FNM(fechas);
    }




    // Setters

    public void setters_name(String nombre)
    {
        this.nombre = nombre;
    }

    public void setters_AP(String apellidoPaterno)
    {
        this.apellidoPaterno = apellidoPaterno;
    }

    public void setters_AM(String apellidoMaterno)
    {
        this.apellidoMaterno = apellidoMaterno;
    }

    public void setters_FNM(DateD fechas)
    {
        fechaNac = new DateD(fechas.DAY,fechas.MONTH,fechas.YEAR);
        fechaNac.mName = fechas.mName;

        Calendar c1 = Calendar.getInstance();
        int YearAct = c1.get(Calendar.YEAR);
        edad = YearAct - fechas.YEAR;
    }

    // Getters

    public String getters_name()
    {
        return nombre;
    }

    public String AP()
    {
        return apellidoPaterno;
    }

    public String AM()
    {
        return apellidoMaterno;
    }

    public DateD getters_FNM()
    {
        return fechaNac;
    }

    public int getEdad()
    {
        return edad;
    }


    public String toString()
    {
        return nombre + " " + apellidoPaterno + " " + apellidoMaterno + "\n" + "Fecha de nacimiento: " + fechaNac.DAY + " / " + fechaNac.MONTH + " / " + fechaNac.YEAR;
    }


}
