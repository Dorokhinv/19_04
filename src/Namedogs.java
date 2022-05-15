import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Namedogs {
    public static void main(String[] args) {
        String text="Рекс Лорд Лом Шарик Бобик Шалун"; //name of dogs
        Pattern pattern= Pattern.compile( "\\b[Л][а-я]+\\b" );  //ищем все имена на Л
        Matcher matcher= pattern.matcher(text);
        while (matcher.find()){
            System.out.println(text.substring( matcher.start(),matcher.end() ));
        }
    }
}
