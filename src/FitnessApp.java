import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class FitnessApp {

    // DATA POOL
    private List<User> users = new ArrayList<>();
    private List<WorkoutPlan> plans = new ArrayList<>();

    public void addUser(User user) {
        users.add(user);
    }

    public void addWorkoutPlan(WorkoutPlan plan) {
        plans.add(plan);
    }

    // SEARCHING
    public User findUserById(String id) {
        for (User user : users) {
            if (user.getId().equals(id)) {
                return user;
            }
        }
        return null;
    }

    // FILTERING
    public List<WorkoutPlan> filterByDuration(int minDuration) {
        List<WorkoutPlan> result = new ArrayList<>();
        for (WorkoutPlan plan : plans) {
            if (plan.getDuration() >= minDuration) {
                result.add(plan);
            }
        }
        return result;
    }

    // SORTING
    public void sortByCalories() {
        plans.sort(Comparator.comparingInt(WorkoutPlan::getCalories));
    }

    public List<WorkoutPlan> getPlans() {
        return plans;
    }
}
