package ch.lu.home.mygymprogress.entities;

import javax.persistence.*;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;

@Entity
@Table(name = "sets", schema = "public", catalog = "my_gym_progress")
public class SetsEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private BigInteger weight;
    private BigInteger repetitions;
    private int exercise_id;
    private LocalDateTime time;


    @Column(name = "id")
    public int getId() {
        return id;
    }

    @Basic
    @Column(name = "weight")
    public BigInteger getWeight() {
        return weight;
    }

    public void setWeight(BigInteger weight) {
        this.weight = weight;
    }

    @Basic
    @Column(name = "repetitions")
    public BigInteger getRepetitions() {
        return repetitions;
    }

    public void setRepetitions(BigInteger repetitions) {
        this.repetitions = repetitions;
    }


    @Basic
    @Column(name = "exercise_id")
    public int getExerciseId() {
        return exercise_id;
    }

    public void setExerciseId(int exerciseId) {
        this.exercise_id = exerciseId;
    }


    @Basic
    @Column(name = "time")
    public LocalDateTime getTime() {
        return this.time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SetsEntity that = (SetsEntity) o;
        return id == that.id &&
                Objects.equals(weight, that.weight) &&
                Objects.equals(repetitions, that.repetitions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, weight, repetitions);
    }
}
