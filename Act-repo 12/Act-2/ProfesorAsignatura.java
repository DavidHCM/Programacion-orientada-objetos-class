public class ProfesorAsignatura extends Profesor{

    protected String grado;

    public ProfesorAsignatura(String nombre, String apellidoPaterno, String apellidoMaterno)
    {
        super(nombre, apellidoPaterno, apellidoMaterno);
    }

    public ProfesorAsignatura(String nombre, String apellidoPaterno, String apellidoMaterno, DateD fechas,DateD fechaIngreso,String numeroEmpleado,String puesto,float sueldo,String departamento,String grado)
    {
        super(nombre, apellidoPaterno, apellidoMaterno,fechas,fechaIngreso,numeroEmpleado,puesto,sueldo,departamento);
        setGrado(grado);
    }

    public String getGrado()
    {
        return grado;
    }

    public void setGrado(String grado)
    {
        this.grado = grado;
    }

    public String toString()
    {
        return super.toString() + "\n" + "Grado: " + grado;
    }
}
