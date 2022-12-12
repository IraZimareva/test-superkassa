package zimareva.model.utils;

import java.io.Serializable;

public class MyJson implements Serializable {
    private Double current;

    public MyJson() {
    }

    public Double getCurrent() {
        return current;
    }

    public void setCurrent(Double current) {
        this.current = current;
    }
}
