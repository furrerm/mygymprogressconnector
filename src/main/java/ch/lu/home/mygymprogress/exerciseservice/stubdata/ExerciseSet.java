package ch.lu.home.mygymprogress.exerciseservice.stubdata;

public class ExerciseSet {
    private float weight;
    private int reps;

    public ExerciseSet(float weight, int reps) {
        this.weight = weight;
        this.reps = reps;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public int getReps() {
        return reps;
    }

    public void setReps(int reps) {
        this.reps = reps;
    }
}
