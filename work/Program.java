public class Program {
    public static void main(String argc[]){

    Cleaner a = new Cleaner(1,"Klavdia Vasilevna", 35, 200);
        a.salary();
        a.info();

    Driver b = new Driver(2,"Vasya Petrov", 100, 350);
        b.salary();
        b.info();
        b.setNigthhrs(10);
        b.info();

    Engineer c = new Engineer(3,"Michael", 50 , 900);
        c.salary();
        c.info();
        c.setProjHrs(10);
        //c.salary();
        c.info();

    Tester d = new Tester (4, "Igor", 30, 500 );
        d.salary();
        d.info();
        d.setProjHrs(10);
        d.info();

    Programmer f = new Programmer(4, "Alexey", 30, 600);
        f.salary();
        f.info();
        f.setProjHrs(15);
       //f.salary();
        f.info();

    TeamLeader g = new TeamLeader(5,"Ivan", 30, 600);
        g.salary();
        g.info();
        g.setProjHrs(20);
        //g.salary();
        g.info();
        g.setTeam(10);
        //g.salary();
        g.info();

    Manager m = new Manager(6, "Petr", 30);
        m.getPart();
        m.info();

    ProjectManager x = new ProjectManager(7,"Ivan",30);
        x.salary();
        x.info();
        x.setTeam(10);
        x.salary();
        x.info();


    SeniorManager n = new SeniorManager(8, "Oleg", 40);
        n.salary();
        n.info();
        n.setTeam(5);
        n.salary();
        n.info();
    }
}
