import java.time.LocalTime;

public class DijitalSaat {
    public static void main(String[] args) {
        int saat,dakika,saniye;
        LocalTime saatim=LocalTime.now();
        saat=saatim.getHour();
        dakika=saatim.getMinute();
        saniye=saatim.getSecond();
        while (true) {
            saniye++;
            if(saniye>59)
            {
                dakika++;
                saniye=0;
            }
            if (dakika>59)
            {
                saat++;
                dakika=0;
            }
            if (saat>23)
                saat=0;

            System.out.print("\rsaat : "+saat+":"+dakika+":"+saniye);

            MyFunc.Bekle();
        }
        }
}