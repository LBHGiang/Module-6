package case_study.injections.model;

public class ProductDto1 {
    private String name;
    private Integer quantity;

    public ProductDto1(String name, Integer quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    public ProductDto1() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
}
