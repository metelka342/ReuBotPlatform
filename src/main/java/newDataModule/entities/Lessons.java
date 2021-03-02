package newDataModule.entities;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Data
@Entity
@NoArgsConstructor
@Table(schema = "public", name = "lessons")
public class Lessons {

    @Id
    @Column(name = "id")
    private Long idLesson;
    @Column(name = "id_schedule")
    private Long idSchedule;
    @Column(name = "id_discipline")
    private Long idDiscipline;
    @Column(name = "id_teacher")
    private Long idTeacher;
    @Column(name = "number")
    private Long lessonNum;
    @Column(name = "information")
    private String information;

    public Long getIdLesson() {
        return idLesson;
    }

    public void setIdLesson(Long idLesson) {
        this.idLesson = idLesson;
    }


    public Long getIdSchedule() {
        return idSchedule;
    }

    public void setIdSchedule(Long idSchedule) {
        this.idSchedule = idSchedule;
    }


    public Long getIdDiscipline() {
        return idDiscipline;
    }

    public void setIdDiscipline(Long idDiscipline) {
        this.idDiscipline = idDiscipline;
    }


    public Long getIdTeacher() {
        return idTeacher;
    }

    public void setIdTeacher(Long idTeacher) {
        this.idTeacher = idTeacher;
    }

    public Long getLessonNum() {
        return lessonNum;
    }

    public void setLessonNum(Long lessonNum) {
        this.lessonNum = lessonNum;
    }

    public String getInformation() {
        return information;
    }

    public void setInformation(String information) {
        this.information = information;
    }


}
