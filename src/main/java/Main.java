import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;


public class Main {
    
    private static final String url = "jdbc:mysql://localhost:3306/test";
    private static final String user = "root";
    private static final String password = "1";

    private static Connection connection = null;
    private static Statement statement = null;
    private static ResultSet resSet = null;

    public static void main(final String... args)
    throws Exception {

        String queryUpdate = "INSERT INTO table_1 VALUES ('1111111111', 'kjfhsdkj')";
        String querySelect = "SELECT * FROM table_1";

        try {

            Class.forName("com.mysql.cj.jdbc.Driver").newInstance();

            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "1");
            statement = connection.createStatement();
            resSet = statement.executeQuery(querySelect);

            while (resSet.next()) {
                String key = resSet.getString(1);
                String value = resSet.getString(2);
                System.out.println("selected: " + key + " " + value);
            }

            Config config = new Config();
            config.setOptions(args);
            
            // statement.executeUpdate(query);

            connection.close();
            statement.close();
            resSet.close();

        } catch (SQLException sqlEx) {
            sqlEx.printStackTrace();
        } catch (Exception exc) {
            exc.printStackTrace();
            System.err.print("Something went wrong!");
        } finally {
            // try { connection.close(); } catch ( SQLException exc) { }
            // try { statement.close(); } catch ( SQLException exc) { }
            // try { resSet.close(); } catch ( SQLException exc) { }
        }
    }

    // private void connectDB() {

    // }
}