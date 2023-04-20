public class BDrawer <T,U>
{
    private T obj1 = null;
    private U obj2 = null;

    public void put1(T o)
    {
        if(this.obj1 == null)
        {
            this.obj1 = o;
        }
    }

    public T peek1()
    {
        return this.obj1;
    }

    public T remove1()
    {
        T tmp = this.obj1;
        this.obj1 = null;
        return tmp;
    }

    // ==============================================================

    public void put2(U o)
    {
        if(this.obj2 == null)
        {
            this.obj2 = o;
        }
    }

    public U peek2()
    {
        return this.obj2;
    }

    public U remove2()
    {
        U tmp = this.obj2;
        this.obj2 = null;
        return tmp;
    }


}
