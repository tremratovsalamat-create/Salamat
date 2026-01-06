public class Main {
    public static void main(String[] args) {

        FitnessApp app = new FitnessApp();

        User user1 = new RegularUser("U1", "Alex", 21);
        User user2 = new RegularUser("U2", "Maria", 25);

        app.addUser(user1);
        app.addUser(user2);

        app.addWorkoutPlan(new WorkoutPlan("Cardio", 30, 300));
        app.addWorkoutPlan(new WorkoutPlan("Strength", 45, 450));
        app.addWorkoutPlan(new WorkoutPlan("Yoga", 60, 200));

        System.out.println("SEARCH USER:");
        System.out.println(app.findUserById("U1"));

        System.out.println("\nFILTER WORKOUTS (>=40 min):");
        for (WorkoutPlan plan : app.filterByDuration(40)) {
            System.out.println(plan);
        }

        System.out.println("\nSORTED BY CALORIES:");
        app.sortByCalories();
        for (WorkoutPlan plan : app.getPlans()) {
            System.out.println(plan);
        }
    }
}
