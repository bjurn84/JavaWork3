import java.util.ArrayList;
import java.util.Iterator;
import java.util.List; // Добавлен импорт класса List

public class Main {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(List.of("string", "s", "5", "10", "-12", "my_value"));

        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String element = iterator.next();
            if (element.matches("-?\\\\\\\\d+")) {
                iterator.remove();
            }
        }

        System.out.println(list); // output: ["string", "s", "my_value"]
    }
}
