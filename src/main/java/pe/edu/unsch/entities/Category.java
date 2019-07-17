package pe.edu.unsch.entities;
// Generated 17-jul-2019 1:08:02 by Hibernate Tools 5.1.7.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Category generated by hbm2java
 */
@Entity
@Table(name = "category", catalog = "divisimabd")
public class Category implements java.io.Serializable {

	private int idcategory;
	private String name;
	private String status;
	private String parentid;

	public Category() {
	}

	public Category(int idcategory, String name, String status, String parentid) {
		this.idcategory = idcategory;
		this.name = name;
		this.status = status;
		this.parentid = parentid;
	}

	@Id

	@Column(name = "idcategory", unique = true, nullable = false)
	public int getIdcategory() {
		return this.idcategory;
	}

	public void setIdcategory(int idcategory) {
		this.idcategory = idcategory;
	}

	@Column(name = "name", nullable = false, length = 45)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "status", nullable = false, length = 45)
	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Column(name = "parentid", nullable = false, length = 45)
	public String getParentid() {
		return this.parentid;
	}

	public void setParentid(String parentid) {
		this.parentid = parentid;
	}

}