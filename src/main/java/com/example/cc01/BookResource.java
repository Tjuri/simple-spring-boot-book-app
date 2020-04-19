package com.example.cc01;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.Collection;

@Component
@Path("/books")
@Produces(MediaType.APPLICATION_JSON)
public class BookResource {

    BooksManagement bookshelf = new BooksManagement();

//    @GET
//    @Produces(MediaType.TEXT_PLAIN)
//    public String getIt() {
//        return "Got it!";
//    }

    @GET
    public Response books(@QueryParam("title") String title) {
        Collection<Book> books = bookshelf.getByTitle(title);
        return Response.ok(books).build();
    }

    @GET
    @Path("/{isbn}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response byIsbn(@PathParam("isbn") String isbn) {
        Book book = bookshelf.getByIsdn(isbn);
        return Response.ok(book).build();
    }

}
