public class TestPersona {

    public static void main(String[] args)
    {
        DateD test2 = new DateD(22, 3, 2003);
        DateD test3 = new DateD(1, 1,2023);
        ProfesorTiempoCompleto test1 = new ProfesorTiempoCompleto("David","Hernandez","Camacho",test2,test3,"742787","Profesor",1.1F,"Ingeniera","Tercer Grado","Tiempo Completo");

        System.out.println(test1);
    }

}