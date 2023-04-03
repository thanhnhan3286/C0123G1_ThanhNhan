package case_study_furama_resort_module_2.repository.facility_repo;

import case_study_furama_resort_module_2.model.facility.House;


import java.util.Map;

public interface IHouseRepo {
    Map<House,Integer> display();
    void add(Map<House,Integer> houseMap);
    void edit();
    void save(Map<House,Integer> houseMap);
}
