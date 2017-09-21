package info.hou8.demo.core.dao;

import info.hou8.demo.core.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * 书籍仓库类
 *
 * @author : houkun
 * @since : 2017/9/19
 */
public interface BookDao extends JpaRepository<Book, Long> {

    /**
     * 根据isbn查找书籍
     *
     * @param isbn
     * @return
     */
    Book findByIsbn(String isbn);

}
