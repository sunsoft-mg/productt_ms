package sunsoft.mg.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import sunsoft.mg.common.interfaces.HasId;

import static sunsoft.mg.common.CommonService.generateUUID;
@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
@Entity
public class CodeProduct implements HasId {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;
    @Column(updatable = false, nullable = false)
    public String uuid = generateUUID();
    @Column
    String value;
    @Override
    public Integer getId() {
        return 0;
    }
}
