import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ExportLocalDBFileToCSV {
    public static void main(String[] args) {
    	// Replace with the path to your SQLite database file
        String jdbcUrl = "jdbc:firebirdsql://localhost:3050/C:/etonselect/DATA/ETONDB.GDB\r\n"; 
        String csvFilePath = "output.csv";

        try (Connection connection = DriverManager.getConnection(jdbcUrl);
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery("SELECT * FROM EMPLOYEEDATA")) {

            // Create a FileWriter and BufferedWriter for the CSV file
            BufferedWriter writer = new BufferedWriter(new FileWriter(csvFilePath));

            // Write CSV header
            writer.write("EMPLOYEEID NAME, FAULTCNTR, FAULTSONSTDSAM, FAULTSOFFSTDSAM, EMPLOYEESTATUS, REPSTATUS, WORKPLACE, OFFSTD, OFFSTDTEXT\n");

            // Iterate through the database result set and write data to CSV
            while (resultSet.next()) {
                String column1Value = resultSet.getString("EMPLOYEEID NAME");
                String column2Value = resultSet.getString("FAULTCNTR");
                String column3Value = resultSet.getString("FAULTSONSTDSAM");
                String column4Value = resultSet.getString("FAULTSOFFSTDSAM");
                String column5Value = resultSet.getString("EMPLOYEESTATUS");
                String column6Value = resultSet.getString("REPSTATUS");
                String column7Value = resultSet.getString("WORKPLACE");
                String column8Value = resultSet.getString("OFFSTD");
                String column9Value = resultSet.getString("OFFSTDTEXT");

                // Escape special characters if needed
                column1Value = escapeSpecialCharacters(column1Value);
                column2Value = escapeSpecialCharacters(column2Value);
                column3Value = escapeSpecialCharacters(column3Value);
                column4Value = escapeSpecialCharacters(column4Value);
                column5Value = escapeSpecialCharacters(column5Value);
                column6Value = escapeSpecialCharacters(column6Value);
                column7Value = escapeSpecialCharacters(column7Value);
                column8Value = escapeSpecialCharacters(column8Value);
                column9Value = escapeSpecialCharacters(column9Value);
                // Write data to CSV
                writer.write(column1Value + "," + column2Value + "\n" +column3Value + "\n" +column4Value+ "\n" 
                +column5Value+ "\n" +column6Value+ "\n" +column7Value+ "\n" +column8Value+ "\n" +column9Value);
            }

            // Close the CSV writer
            writer.close();

            System.out.println("Data exported successfully to " + csvFilePath);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static String escapeSpecialCharacters(String input) {
        // You may need to implement character escaping logic here if your data contains special characters
        // For example, you can replace double quotes with two double quotes to escape them.
        // input = input.replace("\"", "\"\"");
        return input;
    }
}
