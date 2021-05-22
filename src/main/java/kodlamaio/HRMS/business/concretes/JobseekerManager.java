package kodlamaio.HRMS.business.concretes;

import kodlamaio.HRMS.business.abstracts.JobseekerService;
import kodlamaio.HRMS.dataAccess.abstracts.JobseekerDao;
import kodlamaio.HRMS.entities.concretes.Jobseeker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobseekerManager implements JobseekerService {

    private JobseekerDao jobseekerDao;

    @Autowired
    public JobseekerManager(JobseekerDao jobseekerDao) {
        super();
        this.jobseekerDao = jobseekerDao;
    }

    @Override
    public List<Jobseeker> getALl() {
        return this.jobseekerDao.findAll();
    }

    @Override
    public Jobseeker get(int jobseekerId) {
        return this.jobseekerDao.findById(jobseekerId).orElse(null);
    }

    @Override
    public void add(Jobseeker jobseeker) {
        this.jobseekerDao.save(jobseeker);
    }

    @Override
    public void delete(Jobseeker jobseeker) {
        this.jobseekerDao.delete(jobseeker);
    }

    @Override
    public void update(Jobseeker jobseeker) {
        this.jobseekerDao.save(jobseeker);
    }

    @Override
    public boolean existsByNationalId(String nationalid) {
        return this.jobseekerDao.existsByNationalId(nationalid);
    }

}
