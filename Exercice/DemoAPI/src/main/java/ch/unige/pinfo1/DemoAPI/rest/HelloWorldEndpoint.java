package ch.unige.pinfo1.DemoAPI.rest;


import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.QueryParam;
import javax.ws.rs.DefaultValue;
import javax.ws.rs.core.Response;
import javax.ws.rs.GET;
import javax.ws.rs.Produces;


@Path("/hello")
public class HelloWorldEndpoint {

	@GET
	@Produces("text/html")
	public String doGet() {
		return "<h1>Hello from Thorntail!</h1>";
	}
	
	@GET
	@Produces("text/html")
	@Path("/plusage/{name}")
	public String hello_name(@PathParam("name") String name,
			@DefaultValue("25") @QueryParam("age") int age) {
		return "hello "+name+"! Nice to see you! You are " + age + " years old";
	}
}
