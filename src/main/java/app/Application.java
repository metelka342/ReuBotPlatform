package app;

import data.NewParser;
import data.ParserPK_21;
import data.Schedule;
import newDataModule.dao.DAO;
import newDataModule.dao.GroupDAO;
import newDataModule.entities.Group;
import org.checkerframework.checker.units.qual.K;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.engine.spi.SessionFactoryDelegatingImpl;
import spark.Session;
import view.discord.bot.DiscordBotView;
import view.telegram.bot.BotViewTelegram;
import view.vk.bot.VkBotView;

import java.util.ArrayList;

public class Application {

    public static void main(String[] args) {
    /*    ParserPK_21 parserPK_21 = new ParserPK_21();
        System.out.println(parserPK_21.parse());*/

       /* my bullshit
        NewParser newParser = new NewParser();
        System.out.println( newParser.getHTML());
        newParser.getHTML().forEach(System.out::println);*/

        SessionFactory factory = null;

        try {
            factory = new Configuration().configure().buildSessionFactory();
         /*   DAO<Group,String> groupStringDAO = new GroupDAO(factory);
            final Group result = groupStringDAO.read("PKo-21");
*/
           // DAO<Group, String> groupStringDAO = new GroupDAO(factory);
            GroupDAO groupStringDAO = new GroupDAO(factory);
            Group group = new Group();
/*            group.setGroupName("PKo-23");

            groupStringDAO.create(group);*/
       /*     group.setIdGroup(1L);
            group.setGroupName("Monke fly");

            groupStringDAO.update(group);
*/

            groupStringDAO.delete(2L);

/*
            Group result = groupStringDAO.read("PKo-21");
            System.out.println("Group1: " + result);
            result = groupStringDAO.read("PKo-22");
            System.out.println("Group2: "+ result);*/

        } finally {
            if (factory != null) {
                factory.close();
            }
        }
    }
}