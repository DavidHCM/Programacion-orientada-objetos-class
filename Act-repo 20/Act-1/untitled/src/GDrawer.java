public class GDrawer <Type>
{
    private Type objectInside = null;

    public void put(Type o)
    {
        if(this.objectInside == null)
        {
            this.objectInside = o;
        }
    }

    public Type peek()
    {
        return this.objectInside;
    }

    public Type remove()
    {
        Type tmp = this.objectInside;
        this.objectInside = null;
        return tmp;
    }


    @Override
    public String toString()
    {
        if(this.objectInside == null)
        {
            return "Cajon Vacio";
        }
        else
        {
            return "Cajon de: " + this.objectInside;
        }
    }

}
