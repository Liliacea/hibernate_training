package Model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "product_category")

public class ProductCategory extends Model{
    @Column(name = "title")
    private String title;
    @ManyToOne (fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "parent_product_category", referencedColumnName = "id")
    private ProductCategory parentProductCategory;

    @OneToMany(mappedBy = "productCategory")
    private Set<Product> products = new HashSet<Product>();
    public ProductCategory() {
    super();
    }

    public Set<Product> getProducts() {
        return products;
    }

    public void setProducts(Set<Product> products) {
        this.products = products;
    }

    public ProductCategory(Integer id) {
        super(id);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public ProductCategory getParentProductCategory() {
        return parentProductCategory;
    }

    public void setParentProductCategory(ProductCategory parentProductCategory) {
        this.parentProductCategory = parentProductCategory;
    }

    @Override
    public String toString() {
        return "ProductCategory{" +
                "title='" + title + '\'' +
                ", products=" + products +
                '}';
    }
}
