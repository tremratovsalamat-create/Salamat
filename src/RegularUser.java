public class RegularUser extends User {

    public RegularUser(String id, String name, int age) {
        super(id, name, age);
    }

    @Override
    public String getUserType() {
        return "Regular";
    }
}
