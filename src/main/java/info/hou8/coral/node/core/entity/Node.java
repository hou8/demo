package info.hou8.coral.node.core.entity;

import lombok.Data;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.time.LocalDateTime;

/**
 * 内容实体类
 *
 * @author : houkun
 * @since : 2017/9/25
 */
@Entity
@Data
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(
        name = "type",
        discriminatorType = DiscriminatorType.STRING
)
public abstract class Node {

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private Long id;

    private String title;

    @Type(type = "text")
    private String content;

    private LocalDateTime createTime;

    private LocalDateTime updateTime;

    @ManyToOne(optional = false)
    @JoinColumn(name = "categoryId", nullable = false)
    private NodeCategory category;

}
