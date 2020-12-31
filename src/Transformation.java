import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

public class Transformation { //Класс для преобразования из римских

    private static List<String> roman = new ArrayList<String>();// ловит индекс
    static {
        roman.add( "-");
        roman.add( "I");
        roman.add("II");
        roman.add("III");
        roman.add("IV");
        roman.add("V");
        roman.add("VI");
        roman.add("VII");
        roman.add("VIII");
        roman.add("IX");
        roman.add("X");
    }
    private final static TreeMap<Integer, String> map = new TreeMap<Integer, String>();//При получение число(индекс) выводит нужные символы
    static {
        map.put(100, "C");
        map.put(90, "XC");
        map.put(50, "L");
        map.put(40, "XL");
        map.put(10, "X");
        map.put(9, "IX");
        map.put(5, "V");
        map.put(4, "IV");
        map.put(1, "I");
    }

    public static String toRoman(int number) {
        int l = map.floorKey(number);
        if (number == l) {
            return map.get(number);
        }
        return map.get(l) + toRoman(number - l);
    }
    public static int toArabic(String number) {
        return roman.indexOf(number);
    }//вызывает массив для конвертации
}
