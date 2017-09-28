package info.hou8.coral.node;

import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

/**
 * 测试配置
 * @author : houkun
 * @since : 2017/9/18
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@Rollback(value = false)
@Transactional
public class BaseTestConfiguration {
}