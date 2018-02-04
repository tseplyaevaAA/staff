interface Heading{
    void headPart();
}



public class TeamLeader extends Programmer implements Heading  {

    protected float team=0;
    protected float teamPart=0;

    public TeamLeader(int id, String name, int worktime,int rate)
    {
        super(id,name,worktime,rate);


    }

    void setProjHrs(int n){
        this.projHrs = n;
        getPart();
        salary();
    }

    public void headPart(){
        this.teamPart = team*worktime*(float)0.15*rate;
    }


    void setTeam(int n){
        this.team = n;
        headPart();
        salary();
    }

    public void getPart(){
        this.bonus = projHrs*(float)0.00025*budget;
    }


    public void salary() {
        getPart();
        this.payment =worktime*rate+ bonus+ teamPart;
    }
}
