import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        int count = 0;
        while (true) {
            LocalDateTime currentTime = LocalDateTime.now();

            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
            DateTimeFormatter formatterForSec = DateTimeFormatter.ofPattern("ss");
            String myDateFormat = currentTime.format(formatter);
            String myDateFormatForSec=currentTime.format(formatterForSec);
            int strToInt = Integer.parseInt(myDateFormatForSec);
            if (strToInt - count == 0) {
                System.out.println(myDateFormat);
                ++count;
                if(count==60){
                    count=0;
                }
            }


        }
    }


}
