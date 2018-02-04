
public class ProjectManager extends Manager implements Heading {

    protected int team;
    protected float teamPart;

    public ProjectManager(int id, String name,int worktime){
        super(id,name,worktime);
    }

    public void headPart(){
        this.teamPart = team*worktime*(float)0.15*(float)0.002*budget;
      //  this.payment+= teamPart;
    }

    public void getPart(){ //project part
        projPart = (float)0.002*budget;
    }

    void setTeam(int n){
        this.team = n;
        headPart();
   //     salary();
    }

    void salary(){
        getPart();
        this.payment = projPart + teamPart;
    }

}
