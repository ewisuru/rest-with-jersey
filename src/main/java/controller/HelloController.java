package controller;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

@Path("/hello")
public class HelloController {

    @GET
    @Path("/world")
    public String sayHello(/*@PathParam("name") String name*/){
        String name = "world";
        return "Hello " + name;
    }
}
