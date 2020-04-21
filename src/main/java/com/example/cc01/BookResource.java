package com.example.cc01;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.Collection;
import java.util.Optional;

@Component
@Path("/books")
@Produces(MediaType.APPLICATION_JSON)
public class BookResource {

    BooksManagement bookshelf = new BooksManagement();

    @GET
    public Response books(@QueryParam("title") String title) {
        Collection<Book> books = bookshelf.getByTitle(title);
        if (books != null) {
            return Response.ok(books).build();
        } else {
            return Response.status(404).entity("Not Found").build();
        }
    }

    @GET
    @Path("/{isbn}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response byIsbn(@PathParam("isbn") String isbn) {
        Optional<Book> book = bookshelf.getByIsdn(isbn);
        if (book.isPresent()) {
            return Response.ok(book.get()).build();
        } else {
            return Response.status(404).entity("Not Found").build();
        }
    }

}
