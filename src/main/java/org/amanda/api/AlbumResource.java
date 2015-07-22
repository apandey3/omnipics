package org.amanda.api;

import org.amanda.Album;

import javax.ws.rs.Consumes;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Arti Sharma <arti.sharma@gmail.com>
 */
@Path("/v1/albums")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class AlbumResource {
    //TODO: Add a GET method to list albums

    public List<Album> getAlbums(){
        List <Album> list = whatTodo();
        return list;
    }

    private List<Album> whatTodo() {
        return null;
    }
}
