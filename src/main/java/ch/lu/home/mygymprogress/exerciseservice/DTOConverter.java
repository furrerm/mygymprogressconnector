package ch.lu.home.mygymprogress.exerciseservice;

import ch.lu.home.mygymprogress.entities.SetsEntity;
import ch.lu.home.mygymprogress.dtos.SetDTO;

import java.util.List;
import java.util.stream.Collectors;

public class DTOConverter {

    public static List<SetDTO> coonvertSetEntitiesToDTOs(List<SetsEntity> setEntities) {
        return setEntities.stream().map(a -> new SetDTO(a.getId(), a.getWeight(), a.getRepetitions())).collect(Collectors.toList());
    }
}
