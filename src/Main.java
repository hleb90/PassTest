import java.util.ArrayList;

/**
 * Created by Глеб on 06.12.2016.
 */
public class Main {
    public static void main(String[] args){

        ArrayList<AbstractStudent> list = new ArrayList<>();
        CleverStudent student1 = new CleverStudent("Шилов", "Глеб", "Сергеевич", 20);
        CleverStudent student2 = new CleverStudent("Иванов", "Петр", "Геннадьевич", 12);
        CleverStudent student3 = new CleverStudent("Шпак", "Григорий", "Савельевич", 14);
        CleverStudent student4 = new CleverStudent("Купоросов", "Евгений", "Вячеславович", 14);
        UsualStudent student5 = new UsualStudent("Смоляков", "Денис", "Игоревич", 17);
        UsualStudent student6 = new UsualStudent("Купреев", "Александр", "Аркадьевич", 10);
        UsualStudent student7 = new UsualStudent("Тимошенко", "Денис", "Витальевич", 19);
        UsualStudent student8 = new UsualStudent("Саакашвили", "Дмитрий", "Семенович", 20);
        UsualStudent student9 = new UsualStudent("Грузинов", "Олег", "Иванович", 3);
        GeniusStudent student10 = new GeniusStudent("Морозов", "Геннадий", "Сергеевич", 3);
        list.add(student1);
        list.add(student2);
        list.add(student3);
        list.add(student4);
        list.add(student5);
        list.add(student6);
        list.add(student7);
        list.add(student8);
        list.add(student9);
        list.add(student10);
        for (int i = 0; i < list.size(); i ++){
            list.get(i).passTest()
        }

    }
}
