
public class Manager extends Employee implements Project {

    protected float projPart=0;

    public Manager(int id, String name, int worktime){
        super(id,name, worktime);
    }

    public void getPart(){
     this.projPart = (float)0.02*budget;
     salary();
    }

    void salary(){
        this.payment = projPart;
    }

}
