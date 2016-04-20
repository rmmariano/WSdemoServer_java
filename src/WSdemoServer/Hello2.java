/**
 * 
 */
package WSdemoServer;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

// http://localhost:8080/WSdemoServer/hello

// Nome do pacote inicial precisa ter o nome do projeto
@Path("/hello2")
public class Hello2 {
	@GET
	@Path("/hey_kid")
	@Produces("application/json")
	public void WSChecarVersao() {
		// http://localhost:8080/WSdemoServer/hello2/hey_kid
		//return "hey";
		System.out.println("hey kid");
	}
	
//	@GET
//	@Path("{id}")
//	@Produces("application/json")
//	public String getBanda(@PathParam("id") int id) {
//		System.out.println("hey id"+id);
//		return "id: "+id;
//	}
	
	@GET
	@Path("/get_something")
	@Produces("application/json")
	public String getSomething() {
		System.out.println("hey something");
		return "heyyy";
	}
	
	
}