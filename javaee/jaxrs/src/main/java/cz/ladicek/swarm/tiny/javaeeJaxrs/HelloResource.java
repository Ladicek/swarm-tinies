package cz.ladicek.swarm.tiny.javaeeJaxrs;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Path("/")
public class HelloResource {
    @GET
    public Response get() {
        return Response.ok().entity("Hello from JAX-RS").build();
    }
}
