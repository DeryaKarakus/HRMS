package kodlamaio.HRMS.business.abstracts;

import kodlamaio.HRMS.entities.concretes.Employer;

import java.util.List;

public interface EmployerService {
    List<Employer> getAll();
    Employer get(int employerId);
    void add(Employer employer);
    void delete(Employer employer);
    void update(Employer employer);
    void addPhoneNumber(String phoneNumber);
    boolean existsPhoneNumber(String phoneNumber);

}
