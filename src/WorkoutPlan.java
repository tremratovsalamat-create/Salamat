import java.util.Objects;

public class WorkoutPlan {

    private String name;
    private int duration;
    private int calories;

    public WorkoutPlan(String name, int duration, int calories) {
        this.name = name;
        this.duration = duration;
        this.calories = calories;
    }

    // ENCAPSULATION
    public String getName() {
        return name;
    }

    public int getDuration() {
        return duration;
    }

    public int getCalories() {
        return calories;
    }

    @Override
    public String toString() {
        return "WorkoutPlan{name='" + name +
                "', duration=" + duration +
                ", calories=" + calories + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof WorkoutPlan)) return false;
        WorkoutPlan that = (WorkoutPlan) o;
        return name.equals(that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}

