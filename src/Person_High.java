
public class Person_High extends Person{
    public Person_High(){
            int a = random.nextInt(names.length);
            this.name = names[a];
            int b = random.nextInt(20,60);
            this.age = (byte)b;
            int c = random.nextInt(100000,500000);
            this.salary=c;
    }
    @Override
    public boolean morningPreporation() {
        System.out.println(name + " проснулся.");
        System.out.println("Встал с кровати в пижаме. Пошел в ванну.");
        System.out.println("Умылся, почистил зубы, справил нужду.");
        System.out.println("Завтракает приготовленным стейком и выпил кофе.");
        System.out.println("Надевает выглаженную одежду. Берет чемодан.");
        System.out.println("Отправляется на работу на машине с личным водителем.");
        return inHome = false;
    }
    public void workFlow(){
        System.out.println("");
    }
}
