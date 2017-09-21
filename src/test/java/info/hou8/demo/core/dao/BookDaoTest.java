package info.hou8.demo.core.dao;

import info.hou8.demo.core.entity.Book;
import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author : houkun
 * @since : 2017/9/19
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class BookDaoTest {

    @Autowired
    private BookDao bookDao;

    @Test
    public void test() throws Exception {
        Book book = bookDao.findByIsbn("test003");
        log.info(book.toString());
        Assert.assertNotNull(book);
        book.setTitle("改变标题");
        bookDao.save(book);
    }



}