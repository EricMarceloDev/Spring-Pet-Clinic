package com.spc.models;

import java.time.LocalDate;
import java.util.Set;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name="visits")
public class Visit extends BaseEntity {

	private static final long serialVersionUID = 1L;
	
	@Column(name="date")
	private LocalDate date;
	
	@Column(name="description")
	private String description;
	
	@ManyToOne
	@JoinColumn(name="pet_id")
	private Pet pet;
	

}
