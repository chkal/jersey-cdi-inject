package de.chkal.jersey;

import javax.enterprise.context.ApplicationScoped;
import javax.ws.rs.core.Configuration;
import javax.ws.rs.core.Context;

@ApplicationScoped
public class ContextAwareBean {

  @Context
  private Configuration configuration;

  public String getInjectionState() {
    return "Configuration: " + configuration;
  }

}
