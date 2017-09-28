package info.hou8.coral.node.dao;

import info.hou8.coral.node.BaseTestConfiguration;
import info.hou8.coral.node.core.entity.Node;
import info.hou8.coral.node.core.entity.NodeCategory;
import lombok.extern.slf4j.Slf4j;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * @author : houkun
 * @since : 2017/9/25
 */
@Slf4j
public class NodeDaoTest extends BaseTestConfiguration {

    @Autowired
    private NodeDao nodeDao;
    @Autowired
    private NodeCategoryDao nodeCategoryDao;


    @Before
    @Transactional
    public void before(){
        NodeCategory category = new NodeCategory();
        category.setSlug("news");
        category.setDescription("新闻");
        nodeCategoryDao.save(category);

        Node n = new Node();
        n.setTitle("第一篇新闻");
        n.setContent("好多内容");
        n.setCategory(category);
//        category.getNodeList().add(n);
        nodeDao.save(n);
    }

    @Test
    public void testNodeDao() {

        List<Node> nodeList = nodeDao.findAll();
        assertEquals(1, nodeList.size());
        assertEquals("news", nodeList.get(0).getCategory().getSlug());

        List<NodeCategory> categoryList = nodeCategoryDao.findAll();
        assertEquals(1, categoryList.size());
        assertEquals(1, categoryList.get(0).getNodeList().size());
        assertEquals("第一篇新闻", categoryList.get(0).getNodeList().get(0).getTitle());
    }

}