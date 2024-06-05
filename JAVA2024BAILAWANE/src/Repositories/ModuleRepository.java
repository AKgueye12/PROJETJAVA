package Repositories;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import Entities.Module;

public class ModuleRepository extends Database {
    private final String SQL_SELECT_MODULE="select * from module";
    private final String SQL_INSERT_MODULE="INSERT INTO module (nomModule) VALUES (?)";

    public List <Module> selectAll(){
       List <Module> modules= new ArrayList<>();
        try {
            ouvrirConnexion();
            initPrepareStatement(SQL_SELECT_MODULE);
            ResultSet rs= executeSelect();
            while (rs.next()) {
            Module module = new Module();
            module.setId(rs.getInt("id")); 
            module.setNomModule(rs.getString("nomModule"));
            modules.add(module);
            }
            rs.close();
            closeConnexion();
        } catch (Exception e) {
            System.out.println("Erreur de connexion à la BD");
        }
       return modules;

    }
    private void closeConnexion() {
    }


    public void insertModule(Module module){
        try {
             ouvrirConnexion();
             initPrepareStatement(SQL_INSERT_MODULE);
              statement.setInt(1,module.getId());
              statement.setString(2, module.getNomModule());
             executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }



}
