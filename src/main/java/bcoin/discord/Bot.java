package bcoin.discord;

import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.entities.Activity;

import javax.security.auth.login.LoginException;

public class Bot {
    public static void main(String[] args)  throws LoginException, InterruptedException {
        String token = "OTEyNzcyODg3MzUyNTk4NjA5.YZ0z_g.3beM9dSx27sFgHnFkzBkmv7HtpE";
        JDA jda = JDABuilder.createDefault(token)
                .addEventListeners(new Listener())
                .addEventListeners(new MessageListener())
                .setActivity(Activity.playing("Watching brust")).build();
        jda.awaitReady();
    }
}
