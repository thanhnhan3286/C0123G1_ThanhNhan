package case_study_furama_resort_module_2.repository.facility_repo;

import case_study_furama_resort_module_2.model.facility.Villa;
import case_study_furama_resort_module_2.util.read_and_write.ReadAndWriteVilla;

import java.util.Map;

public class VillaRepoImpl implements IVillaRepo {
    private static final String PATH_FILE_VILLA = "src\\case_study_furama_resort_module_2\\data\\villa.csv";
    static Map<Villa, Integer> villaMap = ReadAndWriteVilla.readFile(PATH_FILE_VILLA);

    @Override
    public Map<Villa, Integer> display() {
        return villaMap;
    }

    @Override
    public void add(Map<Villa, Integer> villaMap) {

    }

    @Override
    public void edit() {

    }

    @Override
    public void save(Map<Villa, Integer> villaMap) {
        ReadAndWriteVilla.writeFile(PATH_FILE_VILLA, villaMap);
    }
}
