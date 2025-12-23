public class WorkoutPlan {
    private String name;
    private int duration;
    private int calories;

    public WorkoutPlan(String name, int duration, int calories) {
        this.name = name;
        this.duration = duration;
        this.calories = calories;
    }

    public String getName() { return name; }
    public int getDuration() { return duration; }
    public int getCalories() { return calories; }

    public void setName(String name) { this.name = name; }
    public void setDuration(int duration) { this.duration = duration; }
    public void setCalories(int calories) { this.calories = calories; }

    public String getInfo() {
        return "Тренировка: " + name + ", " + duration + " мин, " + calories + " калорий";
    }
}


