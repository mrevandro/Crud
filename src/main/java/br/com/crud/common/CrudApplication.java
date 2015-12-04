package br.com.crud.common;

import br.com.crud.service.AlunoService;
import br.com.crud.service.UsuarioService;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by eosilva on 04/12/2015.
 */
@ApplicationPath("/ws")
public class CrudApplication extends Application {

    @Override
    public Set<Class<?>> getClasses() {
        HashSet<Class<?>> lista = new HashSet<Class<?>>();

        lista.add(AlunoService.class);
        lista.add(UsuarioService.class);

        return lista;
    }
}
