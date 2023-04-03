package case_study_furama_resort_module_2.repository.facility_repo;


import case_study_furama_resort_module_2.model.facility.Villa;


import java.util.Map;

public interface IVillaRepo {
    Map<Villa, Integer> display();

    void add(Map<Villa, Integer> villaMap);

    void edit();

    void save(Map<Villa, Integer> villaMap);
}
