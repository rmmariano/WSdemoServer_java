/**
 * 
 */
package WSdemoServer;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

// http://localhost:8080/WSdemoServer/hello

// Nome do pacote inicial precisa ter o nome do projeto
@Path("/hello")
public class Hello {

  // This method is called if TEXT_PLAIN is request
  @GET
  @Produces(MediaType.TEXT_PLAIN)
  public String sayPlainTextHello() {
    return "Hello Jersey TEXT";
  }

  // This method is called if XML is request
  @GET
  @Produces(MediaType.TEXT_XML)
  public String sayXMLHello() {
    return "<?xml version=\"1.0\"?> <hello> Hello Jersey XML </hello>";
  }

  // This method is called if HTML is request
  @GET
  @Produces(MediaType.TEXT_HTML)
  public String sayHtmlHello() {
    return "<html> <title>" + "Hello Jersey HTML" + "</title>"
        + "<body><h1>" + "Hello Jersey HTML" + "</body></h1>" + "</html> ";
  }

} 

// Fonte: http://www.vogella.com/tutorials/REST/article.html