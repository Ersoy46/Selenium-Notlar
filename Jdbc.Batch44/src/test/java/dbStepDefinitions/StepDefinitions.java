package dbStepDefinitions;

import io.cucumber.java.en.Given;
import org.openqa.selenium.support.ui.Select;

import java.sql.*;

public class StepDefinitions {

    String url="jdbc:sqlserver://184.168.194.58:1433;databaseName=hotelmycamp ; user=techproed;password=P2s@rt65";
    String username="techproed";
    String password="P2s@rt65";

    Connection connection;
    Statement statement;
    ResultSet resultSet;


    @Given("kullanıcı HMC veri tabanina baglanir")
    public void kullanıcı_hmc_veri_tabanina_baglanir() throws SQLException {
connection= DriverManager.getConnection(url,username,password);
statement=connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);

    }
    @Given("kullanici {string} tablosundaki {string} verilerini alir")
    public void kullanici_tablosundaki_verilerini_alir(String table, String field) throws SQLException {
        String readQuery="SELECT"+ field+ "FROM"+ table;
      resultSet= statement.executeQuery(readQuery);

    }
    @Given("kullanici {string} sutunundaki verileri okur")
    public void kullanici_sutunundaki_verileri_okur(String string) {
        System.out.println(resultSet);
    }

}
