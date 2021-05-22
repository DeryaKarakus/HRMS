package kodlamaio.HRMS.business.concretes;

import kodlamaio.HRMS.business.abstracts.SystemPersonnelService;
import kodlamaio.HRMS.dataAccess.abstracts.SystemPersonnelDao;
import kodlamaio.HRMS.entities.concretes.SystemPersonnel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SystemPersonnelManager implements SystemPersonnelService {

    private SystemPersonnelDao systemPersonnelDao;

    @Autowired
    public SystemPersonnelManager(SystemPersonnelDao systemPersonnelDao) {
        super();
        this.systemPersonnelDao = systemPersonnelDao;
    }

    @Override
    public List<SystemPersonnel> getAll() {
        return this.systemPersonnelDao.findAll();
    }

    @Override
    public SystemPersonnel get(int systemPersonnelId) {
        return this.systemPersonnelDao.findById(systemPersonnelId).orElse(null);
    }

    @Override
    public void add(SystemPersonnel systemPersonnel) {
        this.systemPersonnelDao.save(systemPersonnel);
    }

    @Override
    public void delete(SystemPersonnel systemPersonnel) {
        this.systemPersonnelDao.delete(systemPersonnel);
    }

    @Override
    public void update(SystemPersonnel systemPersonnel) {
        this.systemPersonnelDao.save(systemPersonnel);
    }
}
