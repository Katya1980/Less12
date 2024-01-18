import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {

        System.out.println("Введите строку:   ");

        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();

        String a = "\\b[A-Z]{2,6}\\b";

        Pattern pattern = Pattern.compile(a);
        Matcher matcher = pattern.matcher(line);

        System.out.println("Аббревиатуры:   ");
        while (matcher.find()){
            String group = matcher.group();
            System.out.println(group);

        }

        System.out.println("Задача со *");

        String text = "email: nikamotors2020@mail.ru document: 1423-1512-51, 4565-7894-52, 45612-1 tel number +(29)1234567 +(55)5647895 ";
        String  email = "\\b[a-zA-z0-9.+]+@[a-zA-z0-9.]+\\.[a-z|A-Z]{2,}\\b";
        String docnum = "\\b\\d{4}-\\d{4}-\\d{2}\\b";
        String tel = "\\+\\(\\d{2}\\)\\d{7}";

        Pattern patternemail = Pattern.compile(email);
        Matcher matcher1 = patternemail.matcher(text);

        Pattern patterndoc = Pattern.compile(docnum);
        Matcher matcher2 = patterndoc.matcher(text);

        Pattern patterntel = Pattern.compile(tel);
        Matcher matcher3 = patterntel.matcher(text);

        while (matcher1.find()){
            System.out.println("email: "+ matcher1.group());
        }
        while (matcher2.find()){
            System.out.println("docnum:  "+ matcher2.group());
        }
        while (matcher3.find()){
            System.out.println("telephone: "+ matcher3.group());
        }




    }
}