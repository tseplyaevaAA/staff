public class Tester extends Engineer {

    public Tester(int id, String name, int worktime,int rate)
    {
        super(id,name,worktime,rate);

    }

    void setProjHrs(int n){
        this.projHrs = n;
        getPart();
        salary();
    }

    public void getPart(){
        this.bonus = projHrs*(float)0.0001*budget;
    }

    public void salary() {
        getPart();
        this.payment =worktime*rate+ bonus;
    }
}
