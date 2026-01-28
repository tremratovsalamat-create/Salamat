import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBConnection {

    private static final String URL =
            "jdbc:postgresql://localhost:5432/assignment01_salamat";
    private static final String USER = "postgres";
    private static final String PASSWORD = "Sala12345.";

    // 1) Connection method
    public static Connection connect() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }

    // 2) TEST method (SELECT)
    public static void testSelect() {
        try (Connection con = connect()) {

            String sql = "SELECT id, title, calories FROM workout_plans";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                System.out.println(
                        rs.getInt("id") + " | " +
                                rs.getString("title") + " | " +
                                rs.getInt("calories")
                );
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // 3) MAIN inside DBConnection (уақытша, тек тексеру үшін)
    public static void main(String[] args) {
        System.out.println("DBConnection running...");
        testSelect();
    }
}
