package kodlamaio.HRMS.business.abstracts;

import kodlamaio.HRMS.entities.concretes.SystemPersonnel;

import java.util.List;

public interface SystemPersonnelService {
    List<SystemPersonnel> getAll();
    SystemPersonnel get(int systemPersonnelId);
    void add(SystemPersonnel systemPersonnel);
    void delete(SystemPersonnel systemPersonnel);
    void update(SystemPersonnel systemPersonnel);
}
