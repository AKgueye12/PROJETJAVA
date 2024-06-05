package Repositories;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import Entities.Cour;

public class CourRepository extends Database {
    private final String SQL_INSERT_COUR="INSERT INTO Cour (id , date , heure) VALUES (?,?,?)";
    private final String SQL_SELECT_COUR="select * from module";


     public List <Cour> selectAll(){
       List <Cour> cours= new ArrayList<>();
        try {
            ouvrirConnexion();
            initPrepareStatement(SQL_SELECT_COUR);
            ResultSet rs= executeSelect();
            while (rs.next()) {
            Cour cour = new Cour();
            cour.setId(rs.getInt("id")); 
            }
            rs.close();
            closeConnexion();
        } catch (Exception e) {
            System.out.println("Erreur de connexion à la BD");
        }
       return cours;

    }
    private void closeConnexion() {
    }

    public void insertCour(Cour Cour){
        try {
             ouvrirConnexion();
             initPrepareStatement(SQL_INSERT_COUR);
              statement.setInt(1,Cour.getId());
             executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
