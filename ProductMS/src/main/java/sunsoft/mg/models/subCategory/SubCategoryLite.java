package sunsoft.mg.models.subCategory;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "subcategorylite")
public class SubCategoryLite extends SubCategoryBase {
    @Column
    String categoryId;

    @Column
    String categoryName;

//    public SubCategoryLite(Integer id, String code, String name, boolean canBeSold, boolean SeeInSold, Double margin) {
//        super(id, code, name, canBeSold, SeeInSold, margin);
//    }

    public SubCategoryLite() {
        super();
    }

    public String getCategoryName(){
        return categoryName;
    }

    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }
    
}