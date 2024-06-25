package sunsoft.mg.models.product;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import sunsoft.mg.common.interfaces.HasId;
import sunsoft.mg.models.*;
import sunsoft.mg.models.subCategory.SubCategory;

import static sunsoft.mg.common.CommonService.generateUUID;

@Entity
@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
public class Product implements HasId {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;

    @Column(updatable = false, nullable = false)
    public String uuid = generateUUID();

    @Column
    String code;

    @Column
    String designation;

    @Column(name = "prize_system")
    String prize_system;

    @Column
    String classement;

    @Column(name = "tarif_auto")
    Double tarif_auto;
    @Column
    Double charge;

    @Column
    Double rebate;

    @Column
    Double margin;

    @Column(name = "sans_remise")
    boolean sans_remise;

    @Column
    boolean discount;

    @Column
    Double discountPercent;

    @Column(name = "qte_min_remise")
    Double qte_min_remise;
    @Column(name = "taux_remise")
    Double taux_remise;
    @Column(name = "taux_com")
    Double taux_com;

    @Column(name = "min_quantity")
    Double minQuantity;

    @Column(name = "max_quantity")
    Double maxQuantity;

    @Column(name = "prix_achat_devise")
    Double prix_achat_devise;

    @Column(name = "charge_defaut")
    Double charge_defaut;
    @Column
    Double poids;
    @Column
    Double pu;
    @Column
    String devise;
    @Column
    String color;
    @Column
    String subcategory;

    @Column
    String place;

    @Column(name = "default_provider")
    String defaultProvider;

    @Column(name = "code_datapharme")
    String code_datapharme;

    @Column
    String codedcidet;
    @Column(name = "isService")
    Boolean isService;

    @Column(name = "en_sommeil")
    Boolean en_sommeil;
    @Column(name = "vendable")
    Boolean vendable;

    @Column(name = "consultable_vente")
    Boolean consultable_vente;

    @Column(name = "scan_saisie")
    Boolean scan_saisie;
    @Column
    String unit;
    @Column
    String tva;

    @Column
    Integer source;
    @Column
    String brand;

    @Override
    public Integer getId() {
        return id;
    }
}