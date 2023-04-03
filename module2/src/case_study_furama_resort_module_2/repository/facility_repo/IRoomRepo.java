package case_study_furama_resort_module_2.repository.facility_repo;

import case_study_furama_resort_module_2.model.facility.Room;

import java.util.Map;

public interface IRoomRepo {

    Map<Room, Integer> display();

    void add(Map<Room, Integer> roomMap);

    void edit();

    void save(Map<Room, Integer> roomMap);
}
