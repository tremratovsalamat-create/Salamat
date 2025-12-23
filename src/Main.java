public class Main {
    public static void main(String[] args) {
        System.out.println("=== Fitness Tracker ===");

        User user1 = new User("Анна", 25, 60.0);
        User user2 = new User("Петр", 30, 75.0);

        WorkoutPlan plan1 = new WorkoutPlan("Бег", 30, 300);
        WorkoutPlan plan2 = new WorkoutPlan("Йога", 45, 200);

        FitnessApp app = new FitnessApp("MyFitness");
        app.addUser();
        app.addUser();

        System.out.println(user1.getInfo());
        System.out.println(user2.getInfo());
        System.out.println(plan1.getInfo());
        System.out.println(plan2.getInfo());
        System.out.println(app.getInfo());

        System.out.println("\n=== Сравнение ===");
        System.out.println("user1 == user2: " + (user1 == user2));
        System.out.println("Имена равны: " + user1.getName().equals(user2.getName()));
    }
}