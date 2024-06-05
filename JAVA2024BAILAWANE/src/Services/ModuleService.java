package Services;

import java.util.List;

import Entities.Module;

import Repositories.ModuleRepository;

public class ModuleService {
    private ModuleRepository ModuleRepository= new ModuleRepository();


     public void ajouterModule(Module module){
        ModuleRepository.insertModule(module);
    }

    public List<Module>ListerModule(){
        return ModuleRepository.selectAll();
    }
}
