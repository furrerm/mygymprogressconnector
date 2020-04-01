package ch.lu.home.mygymprogress.exerciseservice;

import ch.lu.home.mygymprogress.SessionFactory;
import ch.lu.home.mygymprogress.entities.SetsEntity;
import ch.lu.home.mygymprogress.dtos.SetDTO;
import ch.lu.home.mygymprogress.dtos.ExerciseDTO;
import com.google.gson.Gson;
import org.hibernate.Session;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

@Path("/exercise-service")
public class ExerciseService {

    @GET
    @Path("/get-sets/{exercise}")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response getPropertyJSON(@PathParam("exercise") String exercise) {

        Gson jsonHandler = new Gson();
        ExerciseDTO exerciseDTO = jsonHandler.fromJson(exercise, ExerciseDTO.class);

        Session session = SessionFactory.getOpenSession().getSession();
        SetDataLoader setDataLoader = new SetDataLoader();
        List<SetsEntity> setsEntities = setDataLoader.findById(exerciseDTO.getId(), session);
        List<SetDTO> setDTOs = DTOConverter.coonvertSetEntitiesToDTOs(setsEntities);

        return Response
                .status(200)
                .entity(setDTOs)
                .build();
    }
}
