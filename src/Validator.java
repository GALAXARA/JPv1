
public class Validator {

    public static void validator(String a, String sign, String b){
        int a1 = 0;
        int b1= 0;
        int Res = 0;

        boolean trans = false;//нужен для перекидывания в ответ римских символов
        try {
            a1 = Integer.parseInt(a);
            b1 = Integer.parseInt(b);
        } catch (Exception e) {
            try {
                a1 = Transformation.toArabic(a);
                b1 = Transformation.toArabic(b);
                trans = true;
            } catch (Exception e1) {
                System.out.println("Вы ввели не верные данные");
            }
        }
        if(a1 < 1 || a1 > 10 || b1 < 1 || b1 > 10){
            System.out.println("Введены неверные данные");
            System.exit(0);
        }
        Invoke go;
        if(sign.equals("+")){//Сравнивает знак и перенаправляет в нужный класс для вычислений
            go = new ADDITION();
            Res = go.invoke(a1,b1);
        }
        if(sign.equals("-")){
            go = new SUBSTRACTION();
            Res = go.invoke(a1,b1);
        }
        if(sign.equals("*")){
            go = new MULTIPLICATION();
            Res = go.invoke(a1,b1);
        }
        if(sign.equals("/")){
            go = new DIVISION();
            Res = go.invoke(a1,b1);
        }
        if (trans){
            String roman = Transformation.toRoman(Res);
            System.out.println(roman);

        }
        else System.out.println(Res);
    }
}