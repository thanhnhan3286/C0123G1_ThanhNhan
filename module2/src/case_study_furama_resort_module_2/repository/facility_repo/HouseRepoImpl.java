package case_study_furama_resort_module_2.repository.facility_repo;

import case_study_furama_resort_module_2.model.facility.House;
import case_study_furama_resort_module_2.util.read_and_write.ReadAndWriteHouse;

import java.util.Map;

public class HouseRepoImpl implements IHouseRepo {
    private static final String PATH_FILE_HOUSE = "src/case_study_furama_resort_module_2/data/house.csv";
    static Map<House, Integer> houseMap = ReadAndWriteHouse.readFile(PATH_FILE_HOUSE);

    @Override
    public Map<House, Integer> display() {
        return houseMap;
    }

    @Override
    public void add(Map<House, Integer> houseMap) {

    }

    @Override
    public void edit() {
    }

    @Override
    public void save(Map<House, Integer> houseMap) {
        ReadAndWriteHouse.writeFile(PATH_FILE_HOUSE, houseMap);
    }
}
