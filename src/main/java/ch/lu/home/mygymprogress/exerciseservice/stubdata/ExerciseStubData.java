package ch.lu.home.mygymprogress.exerciseservice.stubdata;

import ch.lu.home.mygymprogress.JsonEntity;

import java.util.Arrays;
import java.util.List;

public enum ExerciseStubData {

    DUMBELL(new JsonEntity<List<ExerciseSet>>("DumbellSets", Arrays.asList(new ExerciseSet(20.5f,10),new ExerciseSet(21.5f,11),new ExerciseSet(22.5f,12)))),
    PUSHUPS(new JsonEntity<>("PushUpSets", Arrays.asList(new ExerciseSet(10.5f,7),new ExerciseSet(11.5f,9),new ExerciseSet(12.5f,11)))),
    BENCHPRESS(new JsonEntity<>("BenchPressSets", Arrays.asList(new ExerciseSet(30.5f,13),new ExerciseSet(31.5f,14),new ExerciseSet(32.5f,15))));

    private JsonEntity<List<ExerciseSet>> sets;

    ExerciseStubData (JsonEntity<List<ExerciseSet>> sets){
        this.sets = sets;
    }

    public JsonEntity<List<ExerciseSet>> getSets() {
        return this.sets;
    }

}
