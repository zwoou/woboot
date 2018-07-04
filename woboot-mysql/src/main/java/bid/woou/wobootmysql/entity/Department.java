package bid.woou.wobootmysql.entity;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @Author: zwoou
 * @Date: 2018/5/26
 */
@Entity
@Table(name = "sys_department")
public class Department implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
