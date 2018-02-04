interface Project{
    int budget=500000;
    void getPart();
}

public class Engineer extends Employee implements WorkTime, Project {

    protected int rate=0;
    protected int projHrs=0;
    protected float bonus=0;


    public Engineer(int id, String name, int worktime,int rate1) {
        super(id,name,worktime);
        this.rate = rate1;

    }

    void setProjHrs(int n){
        this.projHrs = n;
        getPart();
        salary();
    }


    public void getPart(){
        this.bonus = projHrs*(float)0.005*budget;
    }

    public void salary(){
        getPart();
     this.payment = bonus + rate*worktime;
    }
}
