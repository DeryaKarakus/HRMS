package kodlamaio.HRMS.entities.concretes;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;


@Data
@Entity
@Table(name = "Jobseeker")
public class Jobseeker extends User{

    @Column(name = "jobseeker_id")
    private int jobseekerId;

    @Column(name = "first_name")
    private String firstname;

    @Column(name = "last_name")
    private String lastname;

    @Column(name = "nationalid")
    private String nationalId;

    @Column(name = "birth_date")
    private Date birthdate;

    public Jobseeker(int id, String email, String password, int jobseekerId, String firstname, String lastname, String nationalId, Date birthdate) {
        super(id, email, password);
        this.jobseekerId = jobseekerId;
        this.firstname = firstname;
        this.lastname = lastname;
        this.nationalId = nationalId;
        this.birthdate = birthdate;
    }
}
