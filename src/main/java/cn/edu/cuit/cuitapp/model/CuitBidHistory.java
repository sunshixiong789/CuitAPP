package cn.edu.cuit.cuitapp.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;
import java.sql.Timestamp;


/**
 * Table:
 * @author sunshixiong on 2018/01/30.
 */
@Entity
@Data
public class CuitBidHistory implements Serializable {

    private static final long serialVersionUID = -8640213901174406658L;
	@Id
	@GeneratedValue
   	private Integer id;
	private String price;
	private String cuitCommodityName;
	private String cuitUserName;
	private Timestamp endTime;
	private String end_price;
}