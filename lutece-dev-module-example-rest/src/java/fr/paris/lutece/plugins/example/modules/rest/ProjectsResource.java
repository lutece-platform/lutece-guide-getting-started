package fr.paris.lutece.plugins.example.modules.rest;

import fr.paris.lutece.plugins.example.business.ProjectHome;
import jakarta.enterprise.context.RequestScoped;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@RequestScoped
@Path("/projects")
public class ProjectsResource {

	    @GET
	    @Produces(MediaType.APPLICATION_JSON)
	    public Response getProperties() {
	        return Response.ok(ProjectHome.getProjectsList()).build();
	    }
}
