package sunsoft.mg.models.product;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import sunsoft.mg.models.*;
import sunsoft.mg.models.subCategory.SubCategory;

@Entity
@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
public class Product extends ProductBase {
    @ManyToOne
    @JoinColumn(name = "category")
    Category category;

    @ManyToOne
    @JoinColumn(name = "subcategory")
    SubCategory subCategory;

    @ManyToOne
    @JoinColumn(name = "place")
    Place place;

    @Column
    String defaultProvider;

    @ManyToOne
    @JoinColumn(name = "unit")
    Unit unit;

    @ManyToOne
    @JoinColumn(name = "tva")
    Tva tva;

    @ManyToOne
    @JoinColumn(name = "prize_system")
    PrizeSystem prizeSystem;

    @ManyToOne
    @JoinColumn(name = "brand")
    Brand brand;

}