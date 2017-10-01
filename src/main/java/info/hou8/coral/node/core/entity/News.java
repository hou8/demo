package info.hou8.coral.node.core.entity;

import lombok.Data;
import lombok.ToString;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 * @author : houkun
 * @since : 2017/9/28
 */
@Entity
@DiscriminatorValue("N")
@Data
@ToString(callSuper = true)
public class News extends Node {
}
