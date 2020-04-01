package ch.lu.home.mygymprogress.supersetservice.stubData;

import ch.lu.home.mygymprogress.JsonEntity;

import java.util.Arrays;
import java.util.List;

public enum Groups {
    CHEST(new JsonEntity<List<String>>("Chest", Arrays.asList(new String[] {"benchpress", "flying", "dumbells"}))),
    BICEPS(new JsonEntity<List<String>>("Biceps", Arrays.asList(new String[] {"curls", "side", "curls"}))),
    TRICEPS(new JsonEntity<List<String>>("Triceps", Arrays.asList(new String[] {"tr1", "tr2", "tr3"})));

    private JsonEntity<List<String>> jsonEntity;

    Groups (JsonEntity<List<String>> jsonEntity){
        this.jsonEntity = jsonEntity;
    }

    public JsonEntity<List<String>> getJsonEntity() {
        return jsonEntity;
    }
}
