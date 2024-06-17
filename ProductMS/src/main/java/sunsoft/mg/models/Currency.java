package sunsoft.mg.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import sunsoft.mg.common.interfaces.HasId;

import static sunsoft.mg.common.CommonService.generateUUID;

@Entity
@AllArgsConstructor
@Getter
@Setter
public class Currency implements HasId {//devise
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(updatable = false, nullable = false)
    public String uuid = generateUUID();
    @Column(nullable = false, unique = true)
    private String currency;
    @Column
    private String sigle;
    @Column
    private Double percent = (double) 0;

    public Currency() {

    }
    @Override
    public Integer getId() {
        return id;
    }
}
