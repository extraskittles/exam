package Framework.Mybatis.pojo;

import java.io.Serializable;
import java.util.Arrays;

public class People implements Serializable {
    private int id;
    private String[] hobbits;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String[] getHobbits() {
        return hobbits;
    }

    public void setHobbits(String[] hobbits) {
        this.hobbits = hobbits;
    }

    @Override
    public String toString() {
        return "People{" +
                "id=" + id +
                ", hobbits=" + Arrays.toString(hobbits) +
                '}';
    }
}
