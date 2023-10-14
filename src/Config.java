import java.util.ArrayList;
import java.util.Scanner;

public class Config {
    static Scanner scanner = new Scanner(System.in);
    byte inputDays;
    byte peopleLow, peopleMiddle, peopleHigh;
    ArrayList<Object> arrayLow = new ArrayList<>();
    ArrayList<Object> arrayMiddle = new ArrayList<>();
    ArrayList<Object> arrayHigh = new ArrayList<>();
    public byte inputOne() {
        do {
            System.out.print("Введите количество дней, которые вы хотите наблюдать(количество не должно превышать 10 дней):");
            inputDays = scanner.nextByte();
        } while (inputDays < 0 || inputDays > 10);
        return inputDays;
    }
    public byte inputPeopleLow() {
        do {
            System.out.print("Введите количество людей, который работают на низкооплачиваемой работе(количество людей не должно превышать 10 человек): ");
            peopleLow = scanner.nextByte();
        } while (peopleLow < 0 || peopleLow > 10);
        return peopleLow;
    }
    public byte inputPeopleHigh() {
        do {
            System.out.print("Введите количество людей, который работают на высокооплачиваемой работе(количество людей не должно превышать 10 человек): ");
            peopleHigh = scanner.nextByte();
        } while (peopleHigh < 0 || peopleHigh > 10);
        return peopleHigh;
    }
    public byte inputPeopleMiddle() {
        do {
            System.out.print("Введите количество людей, который работают на средне-ооплачиваемой работе(количество людей не должно превышать 10 человек): ");
            peopleMiddle = scanner.nextByte();
        } while (peopleMiddle < 0 || peopleMiddle > 10);
        return peopleMiddle;
    }
    public void generatePeople(){
        for (int i=0; i<peopleLow;i++){
            arrayLow.add(new Person_Low());
        }
        for (int i=0; i<peopleMiddle;i++){
            arrayMiddle.add(new Person_Middle());
        }
        for (int i=0; i<peopleHigh;i++){
            arrayHigh.add(new Person_High());
        }
    }
    public void info(){
        System.out.println("Количество дней:"+inputDays);
        System.out.println("Количество людей низкого класса: "+peopleLow);
        System.out.println("Количество людей среднего класса: "+peopleMiddle);
        System.out.println("Количество людей высокого класса: "+peopleHigh);
        System.out.println("Список живущих людей в городе:");
        for (Object obj : arrayLow) {
            ((Person_Low) obj).getDates();
        }
        for (Object obj : arrayMiddle) {
            ((Person_Middle) obj).getDates();
        }
        for (Object obj : arrayHigh) {
            ((Person_High) obj).getDates();
        }
    }
    public void morning(){
        for (Object obj : arrayLow) {
            ((Person_Low) obj).morningPreporation();
        }
        for (Object obj : arrayMiddle) {
            ((Person_Middle) obj).morningPreporation();
        }
        for (Object obj : arrayHigh) {
            ((Person_High) obj).morningPreporation();
        }
    }
    public void process(){
        for (Object obj : arrayLow) {
            ((Person_Low) obj).process();
        }
        for (Object obj : arrayMiddle) {
            ((Person_Middle) obj).process();
        }
        for (Object obj : arrayHigh) {
            ((Person_High) obj).process();
        }
    }
    public void arrival(){
        for (Object obj : arrayLow) {
            ((Person_Low) obj).arrival();
        }
        for (Object obj : arrayMiddle) {
            ((Person_Middle) obj).arrival();
        }
        for (Object obj : arrayHigh) {
            ((Person_High) obj).arrival();
        }
    }

}
