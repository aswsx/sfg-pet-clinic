package guru.springframework.sfgpetclinic.model;

import java.io.Serializable;

/**
 * @author Alex Gutorov
 * @version 1.0
 * @created 21/01/2022 - 13:51
 */
public class BaseEntity implements Serializable {
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
