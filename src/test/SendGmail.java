package test;
import library.EmailUtil;
public class SendGmail {


    public static void main(String[] args) {

        String userName = "ibrahimhocamm@gmail.com";
        String password = "Uludag424242";

        String[] receiver = {"sabihauludag@gmail.com", "ibrahimuludag42@gmail.com"};

        String subject = "ibrahim";

        String text = "Hi this is Ibrahim\n\tWhy are you so rude?";

        int times = 10;
        for (int i = 0; i <= times; i++) {
            for (String each : receiver) {
                EmailUtil.sendEmails(userName, password, each, subject, text);

            }
        }
        System.out.println("Completed");


    }

        /*
        String userName="ibrahimhocamm@gmail.com";
        String password="Uludag424242";

        String receiver="ibrahimuludag42@gmail.com";

        String subject="Ibrahim";

        String text="Hi this is Ibrahim\n\tWhy are you so rude?";

        EmailUtil.EmailUtility.sendEmails(userName,password,receiver,subject,text);
        System.out.println("Completed");



 */






        /*
        String userName="cybertek.batch@gmail.com";
        String password="CybertekBatch21";

        String receiver="cybertek.batch@gmail.com";

        String subject="Muhtar";

        String text="Hi this is Ibrahim\n\tWhy are you so rude?";

        EmailUtil.EmailUtility.sendEmails(userName,password,receiver,subject,text);
        System.out.println("Completed");

 */



}
