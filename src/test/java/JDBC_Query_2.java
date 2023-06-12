import utilities.ReusableMethods;

import java.sql.*;

public class JDBC_Query_2 {
    public static void main(String[] args) throws SQLException {

        /*
    Class.forName("com.mysql.cj.jdbc.Driver");

    Connection con = DriverManager.getConnection("jdbc:mysql://194.140.198.209/heallife_hospitaltraining",
            "heallife_hospitaltraininguser",
            "PI2ZJx@9m^)3");

    Statement st = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);


     */

        Statement st = ReusableMethods.createStatement(ReusableMethods.getConnection());
        ResultSet rs = st.executeQuery("SELECT * FROM heallife_hospitaltraining.staff");

        rs.next();
        System.out.println(rs.getString("name") + " " + rs.getString("id"));


        rs.next();
        rs.next();
        System.out.println(rs.getString("name") + " " + rs.getString("id"));

        rs.absolute(11);
        System.out.println(rs.getString("name") + " " + rs.getString("id"));

        rs.absolute(1);
        System.out.println(rs.getString("name") + " " + rs.getString("id"));



    }
}
/*

git init
git add .
git commit -m "first commit"
git branch -M main
git remote add origin https://github.com/mehmetfilik/JDBCTeam113.git
git push -u origin main
 */