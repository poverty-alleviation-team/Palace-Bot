package com.github.palace.bot;

import com.github.palace.bot.builder.BotConfigurationBuilder;
import net.mamoe.mirai.Bot;
import net.mamoe.mirai.BotFactory;
import net.mamoe.mirai.event.GlobalEventChannel;
import net.mamoe.mirai.event.Listener;
import net.mamoe.mirai.event.events.GroupMessageEvent;
import net.mamoe.mirai.message.data.MessageChain;

/**
 * @author JHY
 * @date 2022/3/22 10:38
 */
public class MainApplication {
    public static void main(String[] args) {
        Bot bot = BotFactory.INSTANCE.newBot(1515023757, "", BotConfigurationBuilder.builder());
        bot.login();

        // 创建监听
        Listener<GroupMessageEvent> listener = GlobalEventChannel.INSTANCE.subscribeAlways(GroupMessageEvent.class, event -> {
            MessageChain chain = event.getMessage(); // 可获取到消息内容等, 详细查阅 `GroupMessageEvent`
            event.getSubject().sendMessage("Hello!"); // 回复消息
        });

    }
}
