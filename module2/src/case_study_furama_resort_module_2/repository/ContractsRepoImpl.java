package case_study_furama_resort_module_2.repository;

import case_study_furama_resort_module_2.model.Contract;
import case_study_furama_resort_module_2.util.read_and_write.ReadAndWriteContract;

import java.util.List;
import java.util.Queue;

public class ContractsRepoImpl implements IContractsRepo{
    Queue<Contract> contractList = ReadAndWriteContract.readFile();
    @Override
    public void create(Queue<Contract> contractList) {
        save(contractList);
    }

    @Override
    public Queue<Contract> display() {
        return contractList;
    }

    @Override
    public void edit() {

    }

    @Override
    public void save(Queue<Contract> contractList) {
        ReadAndWriteContract.writeFile(contractList);
    }
}
