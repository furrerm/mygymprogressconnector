package ch.lu.home.mygymprogress.supersetservice;

import ch.lu.home.mygymprogress.SessionFactory;
import ch.lu.home.mygymprogress.entities.RoutineEntity;
import ch.lu.home.mygymprogress.dtos.ExerciseGroupDTO;
import org.hibernate.Session;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

@Path("/routine-service")
public class ExerciseGroupService {

    @GET
    @Path("/get-json-routines")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getPropertyJSON() {

        Session session = SessionFactory.getOpenSession().getSession();
        List<RoutineEntity> routines = ExerciseGroupDataLoader.loadAllData(RoutineEntity.class, session);
        List<ExerciseGroupDTO> exerciseGroups = ExerciseGroupConverter.convertGroupEntitiesToDTO(routines);

        return Response
                .status(200)
                .entity(exerciseGroups)
                .build();
    }
}
