package br.com.fiap.previnatech.resource;


import br.com.fiap.previnatech.model.Paciente;
import br.com.fiap.previnatech.service.PacienteService;
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

@Path("/paciente")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class PacienteResource {

    private PacienteService pacienteService = new PacienteService();

    @GET
    public List<Paciente> getAllPacientes() throws Exception {
        return pacienteService.getAllPacientes();
    }

    @GET
    @Path("/{id}")
    public Paciente getPacienteById(@PathParam("id") Long id) throws Exception {
        return pacienteService.getPacienteById(id);
    }

    @POST
    public Response addPaciente(Paciente paciente) throws Exception {
        pacienteService.addPaciente(paciente);
        return Response.status(Response.Status.CREATED).entity("Paciente adicionado com sucesso").build();
    }

    @PUT
    @Path("/{id}")
    public Response updatePaciente(@PathParam("id") Long id, Paciente paciente) throws Exception {
        paciente.setIdPaciente(id);
        pacienteService.updatePaciente(paciente);
        return Response.status(Response.Status.OK).entity("Paciente atualizado com sucesso").build();
    }

    @DELETE
    @Path("/{id}")
    public Response deletePaciente(@PathParam("id") Long id) throws Exception {
        pacienteService.deletePaciente(id);
        return Response.status(Response.Status.OK).entity("Paciente removido com sucesso").build();
    }
}
