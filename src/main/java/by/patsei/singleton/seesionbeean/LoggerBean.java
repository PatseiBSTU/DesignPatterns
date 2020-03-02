package by.patsei.singleton.seesionbeean;


import javax.annotation.PostConstruct;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import java.util.logging.Logger;

@Startup
@Singleton
public class LoggerBean {

    private Logger logger;

    @PostConstruct
    public void start() {
        logger = Logger.getLogger("MyGlobalLogger");
        logger.info(" started first!!!");
    }

        public void loglnfo(String msg){
            logger.info(msg);
        }
    }

