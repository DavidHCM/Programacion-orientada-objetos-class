public class Empleado extends persona
{

    protected DateD fechaIngreso;
    protected String numeroEmpleado;
    protected String puesto;

    public Empleado(String nombre, String apellidoPaterno, String apellidoMaterno)
    {
        super(nombre,apellidoPaterno,apellidoMaterno);
    }

    public Empleado(String nombre, String apellidoPaterno, String apellidoMaterno, DateD fechas,DateD fechaIngreso,String numeroEmpleado,String puesto)
    {
        super(nombre,apellidoPaterno,apellidoMaterno,fechas);
        setFechaIngreso(fechaIngreso);
        setNumeroEmpleado(numeroEmpleado);
        setPuesto(puesto);
    }

    //  Getters

    public DateD getFechaIngreso()
    {
        return fechaIngreso;
    }

    public String getnumeroEmpleado()
    {
        return numeroEmpleado;
    }

    public String getPuesto()
    {
        return puesto;
    }

    // Setters

    public void setFechaIngreso(DateD fechaIngreso)
    {
        fechaIngreso = new DateD(fechaIngreso.DAY,fechaIngreso.MONTH,fechaIngreso.YEAR);
    }

    public void setNumeroEmpleado(String NumEmp)
    {
        numeroEmpleado = NumEmp;
    }

    public void setPuesto(String puesto)
    {
        this.puesto = puesto;
    }

    public String toString()
    {
        return super.toString() + "\n" + "Empleado: " + numeroEmpleado + "\nPuesto: " + puesto;
    }
}
