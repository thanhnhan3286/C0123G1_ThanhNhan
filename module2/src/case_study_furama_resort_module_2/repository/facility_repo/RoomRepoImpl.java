package case_study_furama_resort_module_2.repository.facility_repo;

import case_study_furama_resort_module_2.model.facility.Room;
import case_study_furama_resort_module_2.util.read_and_write.ReadAndWriteRoom;

import java.util.Map;

public class RoomRepoImpl implements IRoomRepo {
    private static final String PATH_FILE_ROOM = "src\\case_study_furama_resort_module_2\\data\\room.csv";
    static Map<Room, Integer> roomMap = ReadAndWriteRoom.readFile(PATH_FILE_ROOM);

    @Override
    public Map<Room, Integer> display() {
        return roomMap;
    }

    @Override
    public void add(Map<Room, Integer> roomMap) {

    }

    @Override
    public void edit() {

    }

    @Override
    public void save(Map<Room, Integer> roomMap) {
        ReadAndWriteRoom.writeFile(PATH_FILE_ROOM, roomMap);
    }
}
