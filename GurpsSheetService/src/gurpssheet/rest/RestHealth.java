/**
 * 
 */
package gurpssheet.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;



/**
 * @author jwalker
 *
 */
@Path("health")
public class RestHealth {
	@GET
	//@Path("health")
	@Produces(MediaType.APPLICATION_JSON)
	public String health() {
		return "{'Status': 'OK'}";
	}
}
