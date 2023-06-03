import java.sql.*;

public class JDBC_Query_1 {
    public static void main(String[] args) throws SQLException {
        // 1- Kullanilacak veritabani icin dogru surucuyu yukle
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            // forName icin exception firlatmak istiyordu biz istemedik
            // Bu yuzden try catch yaptik
        }

        //  2- Database baglantisi kurulur.
        /*
            URL: "jdbc:mysql://194.140.198.209/heallife_hospitaltraining";
            USERNAME= "heallife_hospitaltraininguser";
            PASSWORD="PI2ZJx@9m^)3";
         */

            Connection con = DriverManager.getConnection("jdbc:mysql://194.140.198.209/heallife_hospitaltraining",
                    "heallife_hospitaltraininguser",
                    "PI2ZJx@9m^)3");

        // Olusturulan conenction bir objeye atanmasa da calisir
        // ancak ilerde ilgili connection'i kullanmak istersek ona ulasamayiz.
        // O yuzden onu Connection nesnesine atama yapariz.

        // "jdbc:mysql://localhost:3306/sys?serverTimezone=UTC", "root", "1234"

        //3- SQL sorgularini yapabilmek icin suite hazirla

        Statement st = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
        // INSENSITIVE - hassas olmasin (her yere oynayabilir), READ_ONLY - sadece okumak istiyorum
        // DATABASE ayarlarinda bu kodlar sabittir

        // ResultSet'i olusturmak icin Statement'e ihtiyac vardir
        // Statement'i kullanmak icin de Connection'a ihtiyac vardir

        // 4- SQL sorgularini hazirla ve calistir

        /*
        typejdbc:mysql

        host/ip194.140.198.209

        port3306

        database_nameheallife_hospitaltraining

        usernameheallife_hospitaltraininguser

        passwordPI2ZJx@9m^)3

         */

        String query = "SELECT * FROM heallife_hospitaltraining.staff";
        ResultSet rs = st.executeQuery(query);
        // MySQL'den sonuclari ResultSet>> Set olarak alir
        // ResultSet : icerisinde index yapisi barindirmayan ve
        // data depolanmasina imkan taniyan bir collection turudur

        rs.next();
        System.out.println(rs.getString("name"));

    /*


git init
git add .
git commit -m "first commit"
git branch -M main
git remote add origin https://github.com/mehmetfilik/SeleniumJDBCTeam113.git
git push -u origin main

     */





    }
}
