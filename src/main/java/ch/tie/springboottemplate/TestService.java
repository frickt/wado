package ch.tie.springboottemplate;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import ch.tie.iengine.request.invoker.DefaultInvoker;
import ch.tie.iengine.response.ServerResponse;
import ch.tie.iengine.server.services.IEngine;

@Service
public class TestService {

  private final Logger logger = LoggerFactory.getLogger(TestService.class);

  public TestService(IEngine iEngine) {
    ServerResponse response = iEngine.call("", new DefaultInvoker());
    logger.info(response.toString());
  }
}
