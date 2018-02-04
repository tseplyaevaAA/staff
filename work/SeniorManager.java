public class SeniorManager extends ProjectManager {

    public SeniorManager(int id, String name,int worktime){
        super(id,name,worktime);
    }

    public void headPart(){
        this.teamPart = team*worktime*(float)0.2*(float)0.0025*budget;
    }

    public void getPart(){ //project part
        projPart = (float)0.009*budget;
    }

    void setTeam(int n){
        this.team = n;
        headPart();
        //salary();
    }

    void salary(){
        getPart();
        this.payment = projPart + teamPart;
    }
}
