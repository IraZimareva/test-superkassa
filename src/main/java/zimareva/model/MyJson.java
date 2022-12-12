package zimareva.model;

import java.io.Serializable;

public class MyJson implements Serializable {
    private Long current;

    public MyJson() {
    }

    public Long getCurrent() {
        return current;
    }

    public void setCurrent(Long current) {
        this.current = current;
    }
}
