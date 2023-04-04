public class Profesor extends Empleado
{
    protected String Departamento;
    protected float Sueldo;



    public Profesor(String nombre, String apellidoPaterno, String apellidoMaterno)
    {
        super(nombre, apellidoPaterno, apellidoMaterno);
    }

    public Profesor(String nombre, String apellidoPaterno, String apellidoMaterno, DateD fechas,DateD fechaIngreso,String numeroEmpleado,String puesto,float sueldo,String departamento)
    {
        super(nombre, apellidoPaterno, apellidoMaterno,fechas,fechaIngreso,numeroEmpleado,puesto);
        setSueldo(sueldo);
        setDepartamento(departamento);
    }

    // Getters

    public String getDepartamento()
    {
        return Departamento;
    }

    public float getSueldo()
    {
        return Sueldo;
    }

    // Setters

    public void setDepartamento(String Departamento)
    {
        this.Departamento = Departamento;
    }

    public void setSueldo(float Sueldo)
    {
        this.Sueldo = (Sueldo <= 0.0f) ? 1.0f : Sueldo;
    }

    public String toString()
    {
        return super.toString() + "\n" + "Departamento: " + Departamento + "\nSueldo: " + Sueldo;
    }
}
