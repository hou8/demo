package info.hou8.demo.core.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * 书籍实体类
 *
 * @author : houkun
 * @since : 2017/9/19
 */
@Data
@Entity
public class Book {

    @Id
    @GeneratedValue
    private Long id;

    private String reader;

    private String isbn;

    private String title;

    private String author;

    private String description;

    private String newColumn;
}
