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
public class Place implements HasId {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;

    @Column(updatable = false, nullable = false)
    public String uuid = generateUUID();
    @Column
    String code;

    @Column
    String name;

    public Place() {

    }

    @Override
    public Integer getId() {
        return id;
    }
}
