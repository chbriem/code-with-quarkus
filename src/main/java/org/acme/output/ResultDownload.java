package org.acme.output;

import javax.annotation.security.RolesAllowed;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.jboss.resteasy.annotations.GZIP;

@RolesAllowed("ROLE_INTERFACES")
@Path("result")
public class ResultDownload {

    @GET
    @GZIP
    @Produces(MediaType.TEXT_PLAIN)
    public String getResult() {
        return "This is the Result: Everything OK";
    }
}
