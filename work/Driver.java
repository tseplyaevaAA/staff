public class Driver extends  Personal {
    private int nigthhrs;

    public Driver(int id, String name, int worktime,int rate) {
        super(id, name,worktime,rate);
        this.nigthhrs = 0;
    }

    public void setNigthhrs(int nigthhrs1){
        this.nigthhrs = 10;
        //пересчет
        this.payment =0;
        salary();
    }

    public void salary() {
        this.payment = (float)(worktime-nigthhrs)*rate + (float)nigthhrs*(float)(1.05*rate);
    }
}
