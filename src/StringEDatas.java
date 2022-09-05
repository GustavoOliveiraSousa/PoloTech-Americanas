import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.TextStyle;
import java.util.Locale;

public class StringEDatas {
    public static void main(String[] args) {
        String nome = "Gustavo";

        //ISO 8601
        LocalDate hoje = LocalDate.now();
        Locale Brasil = new Locale("pt","BR");
        //System.out.println(hoje.getDayOfWeek().getDisplayName(TextStyle.FULL,Brasil));

        String diaSemana = hoje.getDayOfWeek().getDisplayName(TextStyle.FULL,Brasil);
        String saudacao;
        LocalDateTime agora = LocalDateTime.now();
        if (agora.getHour() >= 0 && agora.getHour() < 12 ) {
            saudacao = "Tenha um ótimo Dia !!!";
        } else if (agora.getHour() >= 12 && agora.getHour() < 18) {
            saudacao = "Tenha uma ótima Tarde!";
        } else if (agora.getHour() >= 18 && agora.getHour() < 24) {
            saudacao = "Tenha uma ótima Noite";
        }else {
            saudacao = "Olá";
        }

        System.out.printf("Olá, %s. Hoje é: %s%n%s%n",nome,diaSemana,saudacao.toUpperCase());
    }
}
