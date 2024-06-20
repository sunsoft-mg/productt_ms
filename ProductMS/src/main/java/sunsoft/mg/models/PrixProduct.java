package sunsoft.mg.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import sunsoft.mg.common.interfaces.HasId;

@Entity(name = "prix_product")
@AllArgsConstructor
@Getter
@Setter
public class PrixProduct implements HasId {
    @Id
    private Long id;
    @Column
    public String type_client;
    @Column
    public double pu_ttc;

    public PrixProduct() {

    }

    @Override
    public Integer getId() {
        return 0;
    }


}
