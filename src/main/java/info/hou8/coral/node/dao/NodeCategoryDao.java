package info.hou8.coral.node.dao;

import info.hou8.coral.node.core.entity.NodeCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * 内容分类实体类 数据访问对象
 *
 * @author : houkun
 * @since : 2017/9/25
 */
@Repository
public interface NodeCategoryDao extends JpaRepository<NodeCategory, Long> {
}
