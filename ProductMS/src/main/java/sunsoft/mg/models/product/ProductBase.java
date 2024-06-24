package sunsoft.mg.models.product;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import sunsoft.mg.common.interfaces.HasId;

import static sunsoft.mg.common.CommonService.generateUUID;

@MappedSuperclass
@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
public class ProductBase implements HasId {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;

    @Column(updatable = false, nullable = false)
    public String uuid = generateUUID();

    @Column
    String code;

    @Column
    String designation;

    @Column
    boolean autoUpdatePrize;

    @Column
    Double charge;

    @Column
    Double rebate;

    @Column
    Double margin;

    @Column
    boolean discount;

    @Column
    Double discountPercent;

    @Column
    Double minQuantity;

    @Column
    Double maxQuantity;

    @Override
    public Integer getId() {
        return id;
    }

    
}
