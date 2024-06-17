package sunsoft.mg.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import sunsoft.mg.common.exception.DataNotSuitable;
import sunsoft.mg.common.interfaces.HasId;

import static sunsoft.mg.common.CommonService.generateUUID;

@Entity
@AllArgsConstructor
@Getter
@Setter
public class Color implements HasId {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(updatable = false, nullable = false)
    public String uuid = generateUUID();
    @Column(nullable = false)
    private String description;
    @Column
    private String reference;
    @Column
    private Boolean textcolor = false;
    @Column
    private String fontcolor;

    public Color() {

    }

    public void setDescription(String description) throws DataNotSuitable {
        if(description == null || description.trim().isEmpty()){
            throw new DataNotSuitable("La description est obligatoire");
        }
        this.description = description;
    }
    @Override
    public Integer getId() {
        return id;
    }
}
