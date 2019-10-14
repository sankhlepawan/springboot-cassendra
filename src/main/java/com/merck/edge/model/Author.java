package com.merck.edge.model;



import javax.persistence.Transient;

import org.springframework.data.cassandra.core.cql.PrimaryKeyType;
import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKeyColumn;
import org.springframework.data.cassandra.core.mapping.Table;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Table("edge_author")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class Author {
	
	@PrimaryKeyColumn(name = "author_id", ordinal = 0, type = PrimaryKeyType.PARTITIONED)
	private String authorid;

	@Column("first_name")
	private String firstName;

	@Column("second_name")
	private String secondName;

	@Column("h_index")
	private String h_index;
	
	@Column("department")
	private String affilationsDepartment;
	
	@Column("affiliations_current")
	private String affilationsCurrent;
	
	@Column("subject_area")
	private String subjectArea;

	@Column("total_impact_factor")
	private String totalImpact;

	@Column("total_publications")
	private String totalPublications;
	
	@Column("score")
	private String score;
	
	@Column("country")
	private String country;
	
	@Transient
    private String instituteRank;
	
	@Transient
	private String globalRank;
	
	
//	@Transient
//	private ResearchAreaModel researchArea;

}
