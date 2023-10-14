
public class Person_Middle extends Person{
    public Person_Middle(){
            int a = random.nextInt(names.length);
            this.name=names[a];
            int b = random.nextInt(20,60);
            this.age = (byte)b;
            int c = random.nextInt(3000,7000);
            this.salary=c;
    }
    public boolean morningPreporation() {
        System.out.println(name + " проснулся.");
        System.out.println("Встал с кровати. Надел трусы. Пошел в ванну.");
        System.out.println("Умылся, почистил зубы, справил нужду. Готовит завтрак.");
        System.out.println("Завтракает приготовленной лазаньей и выпил кофе.");
        System.out.println("Убрал и помыл посуду. Гладит одежду.");
        System.out.println("Надевает выглаженную одежду.");
        System.out.println("Берет чемодан. Отправляется на работу на машине.");
        return inHome = false;
    }
    public void workFlow(){
        System.out.println("");
    }
}
