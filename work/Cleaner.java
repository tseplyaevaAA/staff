
public class Cleaner extends  Personal {

    public Cleaner(int id, String name, int worktime, int rate)
    {
        super(id,name,worktime,rate);
    }

    public void salary() {
        this.payment =worktime*rate;
    }
}
