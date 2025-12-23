public class FitnessApp {
    private String appName;
    private int totalUsers;

    public FitnessApp(String appName) {
        this.appName = appName;
        this.totalUsers = 0;
    }

    public String getAppName() { return appName; }
    public int getTotalUsers() { return totalUsers; }

    public void setAppName(String appName) { this.appName = appName; }
    public void setTotalUsers(int totalUsers) { this.totalUsers = totalUsers; }

    public void addUser() {
        totalUsers++;
    }

    public String getInfo() {
        return "Приложение: " + appName + ", пользователей: " + totalUsers;
    }
}