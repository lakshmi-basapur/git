
import java.text.SimpleDateFormat;
import java.util.Date;

public class statement extends AddAccount {




    public static void main(String[] args) {

        SimpleDateFormat sdf=new SimpleDateFormat("yyyy/MM/dd");
        Date date=new Date();
        System.out.println(sdf.format(date));
    }
}