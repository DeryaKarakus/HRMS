package kodlamaio.HRMS.business.abstracts;

import kodlamaio.HRMS.entities.concretes.Jobseeker;

import java.util.List;

public interface JobseekerService {
    List<Jobseeker> getALl();
    Jobseeker get(int jobseekerId);
    void add(Jobseeker jobseeker);
    void delete(Jobseeker jobseeker);
    void update(Jobseeker jobseeker);
    boolean existsByNationalId(String nationalid);

}
