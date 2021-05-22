package kodlamaio.HRMS.entities.concretes;


import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "System_personnel")
public class SystemPersonnel extends User{

    @Column(name = "personnel_id")
    private int personnelId;

    @Column(name = "personnel_first_name")
    private String personnelFirstName;

    @Column(name = "personnel_last_name")
    private String personnelLastName;

    public SystemPersonnel(int id, String email, String password, int personnelId, String personnelFirstName, String personnelLastName) {
        super(id, email, password);
        this.personnelId = personnelId;
        this.personnelFirstName = personnelFirstName;
        this.personnelLastName = personnelLastName;
    }
}
