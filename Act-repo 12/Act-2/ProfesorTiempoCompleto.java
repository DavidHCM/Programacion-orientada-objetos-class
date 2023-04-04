public class ProfesorTiempoCompleto extends ProfesorAsignatura{

    protected String TiempoAsignacion;

    public ProfesorTiempoCompleto(String nombre, String apellidoPaterno, String apellidoMaterno)
    {
        super(nombre, apellidoPaterno, apellidoMaterno);
    }

    public ProfesorTiempoCompleto(String nombre, String apellidoPaterno, String apellidoMaterno, DateD fechas,DateD fechaIngreso,String numeroEmpleado,String puesto,float sueldo,String departamento,String grado,String TiempoAsignacion)
    {
        super(nombre, apellidoPaterno, apellidoMaterno,fechas,fechaIngreso,numeroEmpleado,puesto,sueldo,departamento,grado);
        setTiempoAsignacion(TiempoAsignacion);
    }

    public void setTiempoAsignacion(String TiempoAsignacion)
    {
        this.TiempoAsignacion = TiempoAsignacion;
    }

    public String getTiempoAsignacion()
    {
        return TiempoAsignacion;
    }

    public String toString()
    {
        return super.toString() + "\n" + "Tiempo asignado: " + TiempoAsignacion;
    }
}
