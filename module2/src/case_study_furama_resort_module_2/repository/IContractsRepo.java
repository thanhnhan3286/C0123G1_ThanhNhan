package case_study_furama_resort_module_2.repository;

import case_study_furama_resort_module_2.model.Contract;

import java.util.List;
import java.util.Queue;

public interface IContractsRepo {
    void create (Queue<Contract> contractList);
    Queue<Contract> display();
    void edit();
    void save (Queue<Contract> contractList);
}
