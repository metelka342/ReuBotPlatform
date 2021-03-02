package newDataModule.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.swing.*;


@Data
@Entity
@NoArgsConstructor
@Table(schema = "public", name = "disciplines")
public class Discipline {

    @Id
    @Column(name = "id")
    private Long idDiscipline;

    @Column(name = "name")
    private String disciplineName;

   /* public String getDisciplineName() {
        return disciplineName;
    }

    public void setDisciplineName(String disciplineName) {
        this.disciplineName = disciplineName;
    }

    public Long getId() {
        return idDiscipline;
    }

    public void setId(Long idDiscipline) {
        this.idDiscipline = idDiscipline;
    }*/


}
