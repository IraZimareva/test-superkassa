package zimareva.model;

import org.hibernate.annotations.Type;
import zimareva.model.utils.MyJson;

import javax.persistence.*;

@Entity
@Table(name = "sk_example_table ")
public class SkExampleTable {
    @Id
    @SequenceGenerator(name = "id_seq", sequenceName = "id_sequence")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "id_seq")
    private Long id;
    @Column(name = "obj")
    @Type(type = "MyJsonType")
    private MyJson obj;

    public SkExampleTable() {
    }

    public Long getId() {
        return id;
    }

    public MyJson getObj() {
        return obj;
    }

    public void setObj(MyJson obj) {
        this.obj = obj;
    }
}
