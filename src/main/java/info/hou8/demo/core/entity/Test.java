package info.hou8.demo.core.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @author : houkun
 * @since : 2017/9/21
 */
@Entity
@Data
public class Test {

    @Id
    @GeneratedValue
    private Long id;

    @Column(unique = true, nullable = false)
    private String decription;
}
