package sunsoft.mg.models.subCategory;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import sunsoft.mg.common.exception.DataNotSuitable;
import sunsoft.mg.common.interfaces.HasId;

import static sunsoft.mg.common.CommonService.generateUUID;

@MappedSuperclass
@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
public class SubCategoryBase implements HasId {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;

    @Column
    String code;
    @Column(updatable = false, nullable = false)
    public String uuid = generateUUID();
    @Column
    String name;

    @Column
    boolean canBeSold;

    @Column
    boolean SeeInSold;

    @Column
    Double margin;

    @Override
    public Integer getId() {
        return id;
    }
    
}
