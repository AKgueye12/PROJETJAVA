package Services;

import java.util.List;

import Entities.Cour;
import Repositories.CourRepository;

public class CourService {
    private CourRepository courRepository= new CourRepository();


     public void ajouterCour(Cour cour){
        courRepository.insertCour(cour);
    }

    public List<Cour>ListerCour(){
        return courRepository.selectAll();
    }
}
