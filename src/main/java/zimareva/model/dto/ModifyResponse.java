package zimareva.model.dto;

public class ModifyResponse {
    private Double current;

    public ModifyResponse() {
    }

    public ModifyResponse(Double current) {
        this.current = current;
    }

    public Double getCurrent() {
        return current;
    }

    public void setCurrent(Double current) {
        this.current = current;
    }
}
