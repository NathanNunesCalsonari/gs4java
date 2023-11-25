package br.com.fiap.previnatech.resource;


import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.Response;

import jakarta.ws.rs.core.MediaType;

import br.com.fiap.previnatech.model.Funcionario;
import br.com.fiap.previnatech.service.FuncionarioService;

import java.util.List;

@Path("/funcionario")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class FuncionarioResource {

    private FuncionarioService funcionarioService = new FuncionarioService();

    @GET
    public List<Funcionario> getAllFuncionarios() throws Exception {
        return funcionarioService.getAllFuncionarios();
    }

    @GET
    @Path("/{id}")
    public Funcionario getFuncionarioById(@PathParam("id") Long id) throws Exception {
        return funcionarioService.getFuncionarioById(id);
    }

    @POST
    public Response addFuncionario(Funcionario funcionario) throws Exception {
        funcionarioService.addFuncionario(funcionario);
        return Response.status(Response.Status.CREATED).entity("Funcionário adicionado com sucesso").build();
    }

    @PUT
    @Path("/{id}")
    public Response updateFuncionario(@PathParam("id") Long id, Funcionario funcionario) throws Exception {
        funcionario.setIdFunc(id);
        funcionarioService.updateFuncionario(funcionario);
        return Response.status(Response.Status.OK).entity("Funcionário atualizado com sucesso").build();
    }

    @DELETE
    @Path("/{id}")
    public Response deleteFuncionario(@PathParam("id") Long id) throws Exception {
        funcionarioService.deleteFuncionario(id);
        return Response.status(Response.Status.OK).entity("Funcionário removido com sucesso").build();
    }
}
