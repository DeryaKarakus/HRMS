package kodlamaio.HRMS.entities.concretes;


import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "Job_position")
public class JobPosition {

    @Column(name = "job_position_id")
    private int jobPositionId;

    @Column(name = "job_position_name")
    private String jobPositionName;

    public JobPosition(int jobPositionId, String jobPositionName) {
        this.jobPositionId = jobPositionId;
        this.jobPositionName = jobPositionName;
    }
}
