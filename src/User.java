import java.util.Objects;

// DATA ABSTRACTION
public abstract class User {

    private String id;
    private String name;
    private int age;

    public User(String id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    // INCAPSULATION (GETTERS)
    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // INCAPSULATION (SETTERS)
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if (age > 0) {      // қарапайым валидация
            this.age = age;
        }
    }

    // POLYMORPHISM
    public abstract String getUserType();

    @Override
    public String toString() {
        return "User{id='" + id + "', name='" + name +
                "', age=" + age + ", type=" + getUserType() + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;
        User user = (User) o;
        return id.equals(user.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
