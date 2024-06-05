import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Services.CourService;
import Services.ModuleService;
import Entities.Cour;
import Entities.Module;
import Entities.Professeur;

public class AppView {
    public static void main(String[] args) throws Exception {
        int choix; 
        Scanner sc = new Scanner(System.in);
        CourService courService = new CourService();
        ModuleService moduleService= new ModuleService();
        do {
            System.out.println("1-Ajouter un module");
            System.out.println("2-Lister les modules ");
            System.out.println("3-Ajouter cours");
            System.out.println("4-Lister cours");
            System.out.println("5-lister les cours d'un module et d'un professeur ");
            System.out.println("6-Quitter");
            choix=sc.nextInt();
            sc.nextLine();
        } while (choix!=6);

        switch (choix) {
          case 1:
          System.out.println("Entrez le nom du module");
          String  Module =sc.nextLine();
          Module mod= new Module();
          mod.setNomModule(Module);
         moduleService.ajouterModule(mod);
          System.out.println("le module ajouter avec succes ");
        break;
        
         case 2:
         System.out.println("les Modules ci-aprés");
         List<Module> modules= moduleService.ListerModule();
         for (Module module : modules) {
           System.out.println(module.getNomModule());
            }
            case 3:
        System.out.println("Entrez l'ID du cour ");
        int   id =sc.nextInt();
          Cour cours = new Cour();
          cours.setId(id);
          courService.ajouterCour(cours);
          System.out.println("Cour ajouter avec succès"); 
         break;
          case 4:
          System.out.println("les cours ci-aprés");
          List<Cour> Cours= courService.ListerCour();
          for (Cour cour : Cours) {
            System.out.println(cour.getId()+" ");
             }
          break;
               
        default:
        break;
       }
        
    }
}
