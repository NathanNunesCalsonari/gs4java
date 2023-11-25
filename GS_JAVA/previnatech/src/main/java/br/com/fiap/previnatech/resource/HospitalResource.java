package br.com.fiap.previnatech.resource;

import br.com.fiap.previnatech.model.Hospital;
import br.com.fiap.previnatech.service.HospitalService;
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

@Path("/hospital")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class HospitalResource {

    private HospitalService hospitalService = new HospitalService();

    @GET
    public List<Hospital> getAllUnidadesHospitalares() throws Exception {
        return hospitalService.getAllUnidadesHospitalares();
    }

    @GET
    @Path("/{id}")
    public Hospital getUnidadeHospitalarById(@PathParam("id") Long id) throws Exception {
        return hospitalService.getUnidadeHospitalarById(id);
    }

    @POST
    public Response addUnidadeHospitalar(Hospital hospital) throws Exception {
    	hospitalService.addUnidadeHospitalar(hospital);
        return Response.status(Response.Status.CREATED).entity("Unidade Hospitalar adicionada com sucesso").build();
    }

    @PUT
    @Path("/{id}")
    public Response updateUnidadeHospitalar(@PathParam("id") Long id, Hospital hospital) throws Exception {
    	hospital.setIdHospital(id);
        hospitalService.updateUnidadeHospitalar(hospital);
        return Response.status(Response.Status.OK).entity("Unidade Hospitalar atualizada com sucesso").build();
    }

    @DELETE
    @Path("/{id}")
    public Response deleteUnidadeHospitalar(@PathParam("id") Long id) throws Exception {
    	hospitalService.deleteUnidadeHospitalar(id);
        return Response.status(Response.Status.OK).entity("Unidade Hospitalar removida com sucesso").build();
    }
}
