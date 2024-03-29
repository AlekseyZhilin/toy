import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;


public class Main {
    public static void main(String[] args) {

        Toy toy1 = new Toy(1,"конструктор", 2);
        Toy toy2 = new Toy(2,"робот", 2);
        Toy toy3 = new Toy(3,"кукла", 6);

        System.out.println("---Список игрушек---");
        System.out.println(toy1);
        System.out.println(toy2);
        System.out.println(toy3);
        System.out.println("--------------------");

        ArrayList<Toy> arrayList = new ArrayList<>();
        arrayList.add(toy1);
        arrayList.add(toy2);
        arrayList.add(toy3);
        arrayList.add(toy1);
        arrayList.add(toy2);
        arrayList.add(toy3);
        arrayList.add(toy1);
        arrayList.add(toy2);
        arrayList.add(toy3);
        arrayList.add(toy3);

        PriorityQueue<Toy> queue = new PriorityQueue<>(Comparator.reverseOrder());
        queue.addAll(arrayList);

        printQueue(queue);
    }

    public static <Toy> void printQueue(PriorityQueue<Toy> queue){
        try(Writer writer = new BufferedWriter(new OutputStreamWriter(
                new FileOutputStream("toy.txt"), StandardCharsets.UTF_8))) {
            for (int i=0; i < 10; i++) {
                Toy el = queue.poll();
                System.out.println(el);
                writer.write(el.toString());
                writer.write('\n');
            }
        } catch (IOException e) {
            System.out.println("не удалось записать файл");
        }

    }
}
