package br.com.fiap.previnatech.resource;


import br.com.fiap.previnatech.model.Medico;
import br.com.fiap.previnatech.service.MedicoService;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

import java.util.List;

@Path("/medico")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class MedicoResource {

    private MedicoService medicoService = new MedicoService();

    @GET
    public List<Medico> getAllMedicos() {
        return medicoService.getAllMedicos();
    }

    @GET
    @Path("/{id}")
    public Medico getMedicoById(@PathParam("id") Long id) {
        return medicoService.getMedicoById(id);
    }

}
