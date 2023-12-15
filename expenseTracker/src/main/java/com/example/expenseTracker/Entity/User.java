package com.example.expenseTracker.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class User {
	
	@Id
	@SequenceGenerator(
			
			name = "user_id_sequence",
			sequenceName = "user_id_sequence",
			allocationSize = 1
			
			)
	
	@GeneratedValue(
			strategy = GenerationType.SEQUENCE,
			generator = "user_id_sequence"
			
			)
	private Long id;
	
	@Column(
			nullable = false
			)
	private String userName;

}
