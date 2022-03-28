package Messege;

/**
 *
 * @author Tasyifa
 */
public class Sender {
    public static void main(String[] args) {
        StdMessenger std = new StdMessenger();
        System.out.println("===StdMessenger===\n");
        std.sendMessage("secret", "introduction", "Hai!");
        std.sendMessage("Tasyifa", "introduction", "What is your name?");
        
        MailMessenger mail = new MailMessenger();
        System.out.println("===MailMessenger===\n");
        mail.connect();
        mail.sendMessage("secret", "information", "Graduation");
        mail.sendMessage("Fika", "Introduction", "Halooo");
        mail.disconnect();
        mail.sendMessage("Tasyifa", "information", "Graduation");
    }
}
