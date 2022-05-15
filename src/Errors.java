import java.util.regex.Pattern;

public class Errors {
    public static void main(String[] args) {
        String textFromlogFile ="WrongMsisdnError SuccessfulTransaction TimeOutError InternalError SuccessfulTransaction ExternalIDError SuccessfulTransaction WrongIDError InvalidArgumentError SuccessfulTransaction SuccessfulTransaction SuccessfulTransaction WrongMsisdnError";
        String[]str= textFromlogFile.split( " " );
        for (String s:str){
            if (Pattern.matches( ".*?Error",s ));
            System.out.println(s+" ");
        }
    }
}
