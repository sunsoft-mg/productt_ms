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
public class Category implements HasId {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;
    @Column(updatable = false, nullable = false)
    public String uuid = generateUUID();
    @Column(nullable = false,unique = true)
    String code;

    @Column(nullable = false,unique = true)
    String name;
    
    @Column
    boolean canBeSold;

    @Column
    boolean seeInSold;

    @Column
    Double margin;

    @Column
    String printer;

    public Category() {

    }

    @Override
    public Integer getId() {
        return id;
    }

}
