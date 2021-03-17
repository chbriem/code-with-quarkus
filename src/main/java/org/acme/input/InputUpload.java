package org.acme.input;

import javax.annotation.security.RolesAllowed;
import javax.ws.rs.Consumes;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.jboss.resteasy.annotations.GZIP;

@RolesAllowed("ROLE_INTERFACES")
@Path("/input")
public class InputUpload {

    @Path("text")
    @Consumes(MediaType.TEXT_PLAIN)
    @PUT
    @Produces(MediaType.TEXT_PLAIN)
    public String upload(@GZIP String a_text) {
        System.out.println(a_text);
        return "OK";
    }
}
