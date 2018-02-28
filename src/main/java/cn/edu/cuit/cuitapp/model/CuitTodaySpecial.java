package cn.edu.cuit.cuitapp.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;


/**
 * Table:
 * @author sunshixiong on 2018/01/30.
 */
@Entity
@Data
public class CuitTodaySpecial implements Serializable {

    private static final long serialVersionUID = -7223886272783158572L;

	@Id
	@GeneratedValue
   	private Integer id;
	private String startTime;
	private String endTime;
	private Integer cuitCommodityId;
}