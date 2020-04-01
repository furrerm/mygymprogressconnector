package ch.lu.home.mygymprogress.supersetservice;

import ch.lu.home.mygymprogress.entities.RoutineEntity;
import ch.lu.home.mygymprogress.dtos.ExerciseDTO;
import ch.lu.home.mygymprogress.dtos.ExerciseGroupDTO;

import java.util.List;
import java.util.stream.Collectors;

public class ExerciseGroupConverter {

    public static List<ExerciseGroupDTO> convertGroupEntitiesToDTO(List<RoutineEntity> routineEntities) {


        return routineEntities.stream().map(a -> {
            ExerciseGroupDTO dto =  new ExerciseGroupDTO(a.getName(), a.getId());
            List<ExerciseDTO> exercises = a.getExercises().stream().map(b -> new ExerciseDTO(b.getId(), b.getName())).collect(Collectors.toList());
            dto.setExercises(exercises);
            return dto;
        }).collect(Collectors.toList());

    }

}
