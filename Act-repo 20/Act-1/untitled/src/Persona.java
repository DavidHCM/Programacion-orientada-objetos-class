import java.util.Date;

public class Persona {
    protected Date fechaNac;
    protected String nombre,apellidoPaterno,apellidoMaterno;
    protected int edad;

    // Constructores

    public Persona(String nombre, String apellidoPaterno, String apellidoMaterno)
    {
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
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



    public void setters_AGE(int edad)
    {
        this.edad = edad;
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



    public int getEdad()
    {
        return edad;
    }

    /*
    public String toString()
    {
        return System.out.println();
    }
     */

}
