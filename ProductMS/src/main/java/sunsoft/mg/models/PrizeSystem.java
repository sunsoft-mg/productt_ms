package sunsoft.mg.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import sunsoft.mg.common.interfaces.HasId;

import static sunsoft.mg.common.CommonService.generateUUID;

@Entity
@AllArgsConstructor
@Getter
@Setter
public class PrizeSystem implements HasId {
    @Id
    Integer id;

    @Column
    String name;
    @Column(updatable = false, nullable = false)
    public String uuid = generateUUID();

    public PrizeSystem() {

    }

    @Override
    public Integer getId() {
        return id;
    }
    
}
