import java.util.Random;

public abstract class Person {
    Random random = new Random();
    protected String name;
    protected byte age;
    protected int salary;
    protected int randomTrafficAccident;
    final protected static String[] names = {"Bob", "Mathew", "Marie", "Sergey","Maxim","Axmed","Andrew","Arnold","Dmitriy","Elizabeth"};
    protected void getDates(){
        System.out.println("Имя: "+name+", Возраст: "+age+", Ежедневная зарплата: "+salary);
    }
    public abstract boolean morningPreporation();
    protected void process(){
        System.out.println(name+" в пути...");
        randomTrafficAccident=random.nextInt(1,11);
    }
    protected boolean inHome=true;
    protected boolean atWork=false;
    protected boolean arrival(){
        if(randomTrafficAccident/2==0){
            System.out.println(name+" прибыл на работу.");
            return atWork=true;
        }else{
            System.out.println(name+" прибыл на работу с опозданием.");
            return atWork=true;
        }
    }
    public abstract void workFlow();
}
