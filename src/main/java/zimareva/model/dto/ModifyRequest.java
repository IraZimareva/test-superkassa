package zimareva.model.dto;

public class ModifyRequest {
    private Long id;
    private Double add;

    public ModifyRequest() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getAdd() {
        return add;
    }

    public void setAdd(Double add) {
        this.add = add;
    }
}
