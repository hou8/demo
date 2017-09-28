package info.hou8.coral.node.core.entity;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * 内容分类实体类
 *
 * @author : houkun
 * @since : 2017/9/25
 */
@Entity
@Getter
@Setter
@EqualsAndHashCode
public class NodeCategory {

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private Long id;

    private String slug;

    private String description;

    private LocalDateTime createTime;

    private LocalDateTime updateTime;

    @OneToMany(mappedBy = "category", cascade = CascadeType.ALL)
    private List<Node> nodeList = new ArrayList<>();
}
