package kodlamaio.HRMS.business.concretes;

import kodlamaio.HRMS.business.abstracts.JobPositionService;
import kodlamaio.HRMS.dataAccess.abstracts.JobPositionDao;
import kodlamaio.HRMS.entities.concretes.JobPosition;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class JobPositionManager  implements JobPositionService {

    private JobPositionDao jobPositionDao;

    @Autowired
    public JobPositionManager(JobPositionDao jobPositionDao) {
        super();
        this.jobPositionDao = jobPositionDao;
    }

    @Override
    public List<JobPosition> getAll() {
        return this.jobPositionDao.findAll();
    }

    @Override
    public JobPosition get(int jobPositionId) {
        return this.jobPositionDao.findById(jobPositionId).orElse(null);
    }

    @Override
    public void add(JobPosition jobPosition) {
        this.jobPositionDao.save(jobPosition);
    }

    @Override
    public void delete(JobPosition jobPosition) {
        this.jobPositionDao.delete(jobPosition);
    }

    @Override
    public void update(JobPosition jobPosition) {
        this.jobPositionDao.save(jobPosition);
    }
}
