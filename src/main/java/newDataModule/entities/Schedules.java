package newDataModule.entities;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Date;

@Data
@Entity
@NoArgsConstructor
@Table(schema = "public", name = "schedules")
public class Schedules {

    @Id
    @Column(name ="id")
    private Long id;

    @Column(name = "groupname")
    private String groupName;

    @Column(name = "date")
    private Date date;

    @Column(name = "hashcode")
    private Long hashcode;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Long getHashcode() {
        return hashcode;
    }

    public void setHashcode(Long hashcode) {
        this.hashcode = hashcode;
    }
}
