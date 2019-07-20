package ir.iasco.example.entities;

import java.util.*;

import javax.persistence.*;

import org.hibernate.annotations.GenericGenerator;
import ir.asta.wise.core.validation.constraints.*;
import javax.validation.constraints.*;
import org.hibernate.validator.constraints.*;
import org.hibernate.envers.*;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.gfaces.facelet.DataModel;
import ir.asta.wise.core.data.annotation.*;
import ir.asta.wise.core.datamanagement.*;
import ir.asta.wise.core.data.jpa.*;

import lombok.*;

/*PROTECTED REGION ID(MyPostEntity : Imports) ENABLED START*/

/*PROTECTED REGION END*/

@Entity
@Table(name = "MY_POST")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id", doNotUseGetters = true, callSuper = false)
@EntityGenDirective(menuParent = "root", securityParent = "root")
public class MyPostEntity extends AbstractBaseEntity<java.lang.Long>
		implements
			Comparable<MyPostEntity> {
	private static final long serialVersionUID = 1L;

	/*PROTECTED REGION ID(MyPostEntity Attributes) ENABLED START*/

	/*PROTECTED REGION END*/

	// primary key
	@Id
	@Column(name = "MY_POST_ID")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private java.lang.Long id;

	// fields
	@Basic
	@Column(name = "POST_CODE", nullable = true, unique = false)
	@PropertyGenDirective(searchMethod = SearchMethod.EQUAL, editorType = EditorType.AUTO)
	private java.lang.Long postCode;

	@Basic
	@Column(name = "TITLE", nullable = true, unique = false)
	@PropertyGenDirective(searchMethod = SearchMethod.LIKE, editorType = EditorType.TEXT)
	private java.lang.String title;

	// collections

	@OneToMany(targetEntity = ir.iasco.example.entities.MyResponsibleEntity.class, mappedBy = "post", cascade = {})
	@RelationGenDirective(editorType = RelationEditorType.SUGGEST)
	private Set<ir.iasco.example.entities.MyResponsibleEntity> responsibilites;

	public int compareTo(ir.iasco.example.entities.MyPostEntity obj) {
		if (obj.hashCode() > hashCode())
			return 1;
		else if (obj.hashCode() < hashCode())
			return -1;
		else
			return 0;
	}
	@Override
	public String toString() {
		return toString(getTitle());
	}
	@Override
	@Transient
	protected String getToStringTemplate() {
		return "%s";
	}
	/**
	 * Don't remove this method
	 * This is related to some Lombok bugs!
	 */
	public java.lang.Long getId() {
		return id;
	}

	/**
	 * Don't remove this method
	 * This is related to some Lombok bugs!
	 */
	public void setId(java.lang.Long id) {
		this.id = id;
	}
	@Transient
	public java.lang.Long getPk() {
		return this.id;
	}
	public void setPk(java.lang.Long pk) {
		this.id = pk;
	}

	/*PROTECTED REGION ID(MyPostEntity Methods) ENABLED START*/

	/*PROTECTED REGION END*/
}
