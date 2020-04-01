package ch.lu.home.mygymprogress.savesetservice;

import ch.lu.home.mygymprogress.dtos.SupersetDTO;
import ch.lu.home.mygymprogress.entities.SetsEntity;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

public class SetConverter {

    public static List<SetsEntity> convertSetDTOsToSetEntity(SupersetDTO supersetDTO) {
        LocalDateTime time = LocalDateTime.now();
        return supersetDTO.getSets().stream().map(a -> {
            SetsEntity setEntity = new SetsEntity();
            setEntity.setExerciseId(a.getId());
            setEntity.setRepetitions(a.getRepetitions());
            setEntity.setWeight(a.getWeight());
            setEntity.setTime(time);
            return setEntity;
        }).collect(Collectors.toList());
    }
}
