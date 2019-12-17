package app.db.entity;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "t_dummy", schema = "startup")
public class Dummy {
    private int dummyId;
    private String dummyTitle;
    private String dummyAuthor;
    private Date dummyDate;

    @Id
    @Column(name = "dummy_id")
    public int getDummyId() {
        return dummyId;
    }

    public void setDummyId(int dummyId) {
        this.dummyId = dummyId;
    }

    @Basic
    @Column(name = "dummy_title")
    public String getDummyTitle() {
        return dummyTitle;
    }

    public void setDummyTitle(String dummyTitle) {
        this.dummyTitle = dummyTitle;
    }

    @Basic
    @Column(name = "dummy_author")
    public String getDummyAuthor() {
        return dummyAuthor;
    }

    public void setDummyAuthor(String dummyAuthor) {
        this.dummyAuthor = dummyAuthor;
    }

    @Basic
    @Column(name = "dummy_date")
    public Date getDummyDate() {
        return dummyDate;
    }

    public void setDummyDate(Date dummyDate) {
        this.dummyDate = dummyDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Dummy dummy = (Dummy) o;

        if (dummyId != dummy.dummyId) return false;
        if (!Objects.equals(dummyTitle, dummy.dummyTitle)) return false;
        if (!Objects.equals(dummyAuthor, dummy.dummyAuthor)) return false;
        return Objects.equals(dummyDate, dummy.dummyDate);
    }

    @Override
    public int hashCode() {
        int result = dummyId;
        result = 31 * result + (dummyTitle != null ? dummyTitle.hashCode() : 0);
        result = 31 * result + (dummyAuthor != null ? dummyAuthor.hashCode() : 0);
        result = 31 * result + (dummyDate != null ? dummyDate.hashCode() : 0);
        return result;
    }
}
