package br.com.crud.service;

import br.com.crud.bo.UsuarioBO;
import br.com.crud.entity.Usuario;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by eosilva on 04/12/2015.
 */
@Path("/usuario")
public class UsuarioService {
    @Inject
    private UsuarioBO bo;

    @POST
    @Path("/")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Usuario save(Usuario usuario){
        return bo.save(usuario);
    }

    @PUT
    @Path("/")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Usuario update(Usuario usuario){
        return bo.save(usuario);
    }

    @GET
    @Path("/")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Usuario> listAll(){ return bo.listAll(); }

    @DELETE
    @Path("/")
    public void remove(@QueryParam("ids") ArrayList<Long> ids){
        bo.remove(ids);
    }
}
