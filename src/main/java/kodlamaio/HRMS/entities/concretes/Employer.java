package kodlamaio.HRMS.entities.concretes;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "Employer")
public class Employer extends User{

    @Column(name = "employer_id")
    private int employerId;

    @Column(name = "company_name")
    private String companyName;

    @Column(name = "website")
    private String website;

    @Column(name = "phone_number")
    private String phoneNumber;

    public Employer(int id, String email, String password, int employerId, String companyName, String website, String phoneNumber) {
        super(id, email, password);
        this.employerId = employerId;
        this.companyName = companyName;
        this.website = website;
        this.phoneNumber = phoneNumber;
    }
}
