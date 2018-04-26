package ch.tie.springboottemplate;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import ch.tie.spring.AppContext;

@Component
public class ApplicationContextProvider implements ApplicationContextAware {

  @Override
  public void setApplicationContext(ApplicationContext ctx) {
    AppContext.setApplicationContext(ctx);
  }
}
