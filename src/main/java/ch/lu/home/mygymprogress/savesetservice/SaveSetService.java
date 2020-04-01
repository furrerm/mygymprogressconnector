package ch.lu.home.mygymprogress.savesetservice;

import ch.lu.home.mygymprogress.SessionFactory;
import ch.lu.home.mygymprogress.dtos.ExerciseGroupDTO;
import ch.lu.home.mygymprogress.dtos.SupersetDTO;
import ch.lu.home.mygymprogress.entities.RoutineEntity;
import ch.lu.home.mygymprogress.entities.SetsEntity;
import ch.lu.home.mygymprogress.exerciseservice.DTOConverter;
import ch.lu.home.mygymprogress.exerciseservice.SetDataLoader;
import ch.lu.home.mygymprogress.dtos.SetDTO;
import ch.lu.home.mygymprogress.dtos.ExerciseDTO;
import ch.lu.home.mygymprogress.supersetservice.ExerciseGroupConverter;
import ch.lu.home.mygymprogress.supersetservice.ExerciseGroupDataLoader;
import com.google.gson.Gson;
import org.hibernate.Session;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

@Path("/save-sets-service")
public class SaveSetService {

    @POST
    @Consumes({MediaType.APPLICATION_JSON,MediaType.APPLICATION_FORM_URLENCODED})
    @Produces({MediaType.APPLICATION_JSON, MediaType.TEXT_HTML, MediaType.APPLICATION_FORM_URLENCODED})
    public Response getPropertyJSON(String superset) {

        Gson jsonHandler = new Gson();
        SupersetDTO supersetDTO = jsonHandler.fromJson(superset, SupersetDTO.class);


        Session session = SessionFactory.getOpenSession().getSession();
        List<SetsEntity> sets = SetConverter.convertSetDTOsToSetEntity(supersetDTO);
        SetDataSaver.sveTheList(sets, session);

        return Response
                .status(200)
                .build();
    }
}
