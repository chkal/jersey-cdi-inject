package de.chkal.jersey;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/test")
public class MyResource {

  @Inject
  private ContextAwareBean contextAwareBean;

  @GET
  public String greet() {
    return contextAwareBean.getInjectionState();
  }

}
