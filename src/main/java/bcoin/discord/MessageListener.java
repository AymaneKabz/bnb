package bcoin.discord;

import bcoin.Legends;
import bcoin.Stats;
import net.dv8tion.jda.api.entities.MessageChannel;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

import static bcoin.QuotaRetriever.pickLegend;

public class MessageListener extends ListenerAdapter {
    Stats stats = new Stats();

    @Override
    public void onMessageReceived(MessageReceivedEvent event)
    {
        String message = event.getMessage().getContentRaw();
        MessageChannel channel = event.getChannel();
        if(message.toLowerCase().contains("!hey pick")) {
                Legends legend =  pickLegend();
                stats.increase(legend);
                channel.sendMessage(legend.name()) /* => RestAction<Message> */
                        .queue();
        }else if(message.toLowerCase().contains("!hey show stats")) {
            channel.sendMessage(stats.toString()) /* => RestAction<Message> */
                .queue();
        }else if(message.toLowerCase().contains("thank you")) {
            channel.sendMessage("3awedha l mok") /* => RestAction<Message> */
                    .queue();
        }


    }




}
