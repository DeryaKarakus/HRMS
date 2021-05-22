package kodlamaio.HRMS.business.concretes;

import kodlamaio.HRMS.business.abstracts.EmployerService;
import kodlamaio.HRMS.dataAccess.abstracts.EmployerDao;
import kodlamaio.HRMS.entities.concretes.Employer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployerManager implements EmployerService {

    private EmployerDao employerDao;

    @Autowired
    public EmployerManager(EmployerDao employerDao) {
        super();
        this.employerDao = employerDao;
    }

    @Override
    public List<Employer> getAll() {
        return this.employerDao.findAll();
    }

    @Override
    public Employer get(int employerId) {
        return this.employerDao.findById(employerId).orElse(null);
    }

    @Override
    public void add(Employer employer) {
        this.employerDao.save(employer);
    }

    @Override
    public void delete(Employer employer) {
        this.employerDao.delete(employer);
    }

    @Override
    public void update(Employer employer) {
        this.employerDao.save(employer);
    }

    @Override
    public void addPhoneNumber(String phoneNumber) {
        this.employerDao.addPhoneNumber(phoneNumber);
    }

    @Override
    public boolean existsPhoneNumber(String phoneNumber) {
        return this.employerDao.existsPhoneNumber(phoneNumber);
    }
}
