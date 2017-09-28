package info.hou8.coral.node.core.entity;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
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
@Getter
@Setter
@EqualsAndHashCode
public class Node {

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
