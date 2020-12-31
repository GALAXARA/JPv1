import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Calc {

    public static void main(String[] args) throws IOException {
        List<String> list = new ArrayList<String>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String read = reader.readLine(); //Вводим данные в строку
        try {
            for (String object : read.split(" ", 50)) {//Записывает в массив убирая пробел, записывает в массив validotor
                list.add(object);
            }
            Validator.validator(list.get(0), list.get(1), list.get(2));//Читает и проспуская пробел записывает
        } catch (Exception e){
            System.out.println(e);//Выводится ошибка при неверном введении данных
        }
    }
}
