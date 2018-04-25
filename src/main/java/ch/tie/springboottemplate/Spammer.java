package ch.tie.springboottemplate;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class Spammer {
  Logger logger = LoggerFactory.getLogger(Spammer.class);

  public Spammer(){
    Thread t = new Thread(() -> {
      while(true){
        logger.info("still here");
        logger.debug("still here");
      }
    });
    t.start();
  }
}
