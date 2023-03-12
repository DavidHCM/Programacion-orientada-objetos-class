public class Rectangle {
    private double base = 1.0;
    private double height = 1.0;
    
    //Intento del final:
    private final double minBase;
    //------------------------------------

    //Este es el constructor que no retorna ningun tipo de dato
    public Rectangle(double base, double height){
    	minBase = 2.0;
        setBase(base);
        setHeight(height);
    }

    //Constructor:
    public Rectangle() {
    	minBase = 1.0;
    }
    
    //Destructor:
    protected void finalize()
    {
    	System.out.println("Se destruye: " + this);
    }
    


    //------------------------------------
    public double getHeight(){
        return height;
    }
    public double getBase(){
        return base;
    }
    //------------------------------------

    //metodos publicos para el cambio de atributos
    //------------------------------------
    public void setHeight(double height){
        if(height>= 1.0 && height <= 100){
            this.height = height;
        }
    }

    //Estos son metodos setters:
    public void setBase(double base){
        if(base>= 1.0 && base <= 100){
            this.base = base;
        }
    }
    //------------------------------------
    //El this me sirve para diferenciar para un elemento de atributo de un argumento


    //De poner un metodo de clase en private entonces solo tendra alcanse de uso solo en la clase de Rectangle y no la de usuario
    //De test rectangle:
    //Ejemplo: private double area(){}

    //------------------------------------
    public double area()
    {
        return this.base * this.height;
    }

    public double perimeter()
    {
        return 2 * (this.base + this.height);
    }

    public void print()
    {
        System.out.println(base + ", " + height + ", " + this.area() + ", " + this.perimeter());
        System.out.println("Area: " + this.area() + " Perimetro: " + this.perimeter());
    }
    //------------------------------------


    //Aqui se estan sobrescribiendo un metodo y se nota al tener la flecha hacia arriba al lado.
    public String toString(){
        //return "{base: " + base + ", height: "+ height + "}";
        return String.format("{base: %.2f, height: %.2f}",this.base,this.height);
    }


    public boolean equals(Object ObjEjem){
        if(!(ObjEjem instanceof Rectangle)){
            return false;
        }
        else{
            Rectangle r = (Rectangle)ObjEjem;
            return height == r.height && base == r.base;
        }

    }

    public Rectangle clone() {
        return new Rectangle(this.base, this.height);
    }


}
