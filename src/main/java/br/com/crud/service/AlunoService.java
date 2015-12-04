package br.com.crud.service;

import br.com.crud.bo.AlunoBO;
import br.com.crud.entity.Aluno;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by eosilva on 04/12/2015.
 */
@Path("/aluno")
public class AlunoService {
    @Inject
    private AlunoBO bo;

    @POST
    @Path("/")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Aluno save(Aluno aluno){
        return bo.save(aluno);
    }

    @PUT
    @Path("/")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Aluno update(Aluno aluno){
        return bo.save(aluno);
    }

    @GET
    @Path("/")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Aluno> listAll(){
        return bo.listAll();
    }

    @GET
    @Path("/")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Aluno> listByFilter(@QueryParam("search") String search, @QueryParam("filter") String filter,
                                    @QueryParam("active") Boolean active){
        return bo.listByFilter(search, filter, active);
    }

    @DELETE
    @Path("/")
    public void remove(@QueryParam("ids") ArrayList<Long> ids){
        bo.remove(ids);
    }
}
