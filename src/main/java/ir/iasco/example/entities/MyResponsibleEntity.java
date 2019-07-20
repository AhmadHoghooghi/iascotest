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

/*PROTECTED REGION ID(MyResponsibleEntity : Imports) ENABLED START*/

/*PROTECTED REGION END*/

@Entity
@Table(name = "MY_RESPONSIBLE")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id", doNotUseGetters = true, callSuper = false)
@EntityGenDirective(menuParent = "root", securityParent = "root")
public class MyResponsibleEntity extends AbstractBaseEntity<java.lang.Long>
		implements
			Comparable<MyResponsibleEntity> {
	private static final long serialVersionUID = 1L;

	/*PROTECTED REGION ID(MyResponsibleEntity Attributes) ENABLED START*/

	/*PROTECTED REGION END*/

	// primary key
	@Id
	@Column(name = "MY_RESPONSIBLE_ID")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private java.lang.Long id;

	// fields
	@Basic
	@Column(name = "ACTIVE", nullable = true, unique = false)
	@PropertyGenDirective(searchMethod = SearchMethod.EQUAL, editorType = EditorType.AUTO)
	private java.lang.Boolean active;

	@Basic
	@Column(name = "TITLE", nullable = true, unique = false)
	@PropertyGenDirective(searchMethod = SearchMethod.LIKE, editorType = EditorType.TEXT)
	private java.lang.String title;

	// many to one
	@ManyToOne(targetEntity = ir.iasco.example.entities.MyPostEntity.class, optional = false, cascade = {}, fetch = FetchType.LAZY)
	@JoinColumn(name = "FK_POST", nullable = false)
	@RelationGenDirective(searchable = true, editorType = RelationEditorType.SUGGEST)
	private ir.iasco.example.entities.MyPostEntity post;
	@ManyToOne(targetEntity = ir.iasco.example.entities.MyRequestEntity.class, optional = false, cascade = {}, fetch = FetchType.LAZY)
	@JoinColumn(name = "FK_REQUEST", nullable = false)
	@RelationGenDirective(editorType = RelationEditorType.MASTER)
	private ir.iasco.example.entities.MyRequestEntity request;

	public int compareTo(ir.iasco.example.entities.MyResponsibleEntity obj) {
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

	/*PROTECTED REGION ID(MyResponsibleEntity Methods) ENABLED START*/

	/*PROTECTED REGION END*/
}
