
public class Person_Low extends Person{
    public Person_Low() {
        int a = random.nextInt(names.length);
        this.name = names[a];
        int b = random.nextInt(20,60);
        this.age = (byte)b;
        int c = random.nextInt(1000,2800);
        this.salary=c;
    }
    public boolean morningPreporation() {
        System.out.println(name + " проснулся. Встал с кровати.");
        System.out.println("Надел дешевые трусы. Пошел в ванну.");
        System.out.println("Умылся, почистил зубы, справил нужду. Готовит завтрак.");
        System.out.println("Завтракает приготовленной яичницей с беконом и выпил кофе.");
        System.out.println("Убрал и помыл посуду. Одевает мятую одежду.");
        System.out.println("Берет чемодан. Отправляется на работу на автобусе.");
        return inHome = false;
    }
    public void workFlow(){
        System.out.println("");
    }

}
