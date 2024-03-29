package academy.learnprogramming.console;

import academy.learnprogramming.config.AppConfig;
import academy.learnprogramming.MessageGenerator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Main {

    private static final Logger log = LoggerFactory.getLogger(Main.class);

    //private static final String CONFIG_LOCATION = "beans.xml";

    public static void main(String[] args) {
        log.info("Guess The Number Game");
        // create context (container)
          ConfigurableApplicationContext context
//                = new ClassPathXmlApplicationContext(CONFIG_LOCATION);
                  = new AnnotationConfigApplicationContext(AppConfig.class);

        // get number generator bean from context (container)
        //NumberGenerator numberGenerator
               // = context.getBean("numberGenerator", NumberGenerator.class);
        // NoSuchBeanDefinitionException: No bean named 'numberGenerator' available - Tag#3
        //          = context.getBean(NumberGenerator.class);

        // call method next() to get a random number
        //int number = numberGenerator.next();

        // log generated number
        //log.info("number = {}", number);

        // get game bean from context (container)
        //Game game = context.getBean(Game.class);

        // call reset method
        //game.reset();

        MessageGenerator messageGenerator =
                context.getBean(MessageGenerator.class);
        log.info(messageGenerator.getMainMessage());
        log.info(messageGenerator.getResultMessage());

        // close context (container)
        context.close();


    }
}
