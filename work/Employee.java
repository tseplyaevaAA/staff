 class Employee {
    protected int id;
    protected String name;
    protected int worktime;
    protected float payment;

    public Employee(int id, String name, int worktime1) {
        this.id = id;
        this.name=name;
        this.worktime = worktime1;
    }

    void info(){
        System.out.println(id+ " "+name+" "+ worktime+" "+ payment);
    }

    }
