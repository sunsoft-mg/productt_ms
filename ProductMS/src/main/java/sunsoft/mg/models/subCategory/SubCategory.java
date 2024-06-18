package sunsoft.mg.models.subCategory;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import sunsoft.mg.common.exception.DataNotSuitable;

@Entity
@Table(name = "subcategory")
public class SubCategory extends SubCategoryBase{

    @Column
    String category;



    public SubCategory() {
        super();
    }


    public String getCategory() {
        return category;
    }

    public void setCategory(String category) throws DataNotSuitable {
        if(category == null || category.trim().isEmpty()){
            throw new DataNotSuitable("La catégorie est obligatoire");
        }
        this.category = category;
    }
}