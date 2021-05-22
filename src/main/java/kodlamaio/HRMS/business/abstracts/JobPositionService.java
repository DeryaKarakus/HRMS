package kodlamaio.HRMS.business.abstracts;

import kodlamaio.HRMS.entities.concretes.JobPosition;

import java.util.List;

public interface JobPositionService {
    List<JobPosition> getAll();
    JobPosition get(int jobPositionId);
    void add(JobPosition jobPosition);
    void delete(JobPosition jobPosition);
    void update(JobPosition jobPosition);

}
