
interface WorkTime{
   void salary();
}

public   class Personal extends Employee implements WorkTime {

    protected int rate=0;

    public Personal(int id, String name, int worktime,int rate1){
        super(id,name,worktime);
        this.rate = rate1;
    }

    public void salary(){
        this.payment = worktime*rate;
    }

}
