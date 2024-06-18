package sunsoft.mg.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import sunsoft.mg.common.interfaces.HasId;
@Entity
@AllArgsConstructor
@Getter
@Setter
public class Category implements HasId {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;

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
