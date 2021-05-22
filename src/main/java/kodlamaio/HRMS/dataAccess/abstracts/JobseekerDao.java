package kodlamaio.HRMS.dataAccess.abstracts;

import kodlamaio.HRMS.entities.concretes.Jobseeker;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobseekerDao extends JpaRepository<Jobseeker,Integer> {
    boolean existsByNationalId(String nationalid);
}
