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
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ExpenseCategory {
	
	
	@Id
	@SequenceGenerator(
			
			name = "expense_category_id_sequence",
			sequenceName = "expense_category_id_sequence",
			allocationSize = 1
			
			)
	
	@GeneratedValue(
			strategy = GenerationType.SEQUENCE,
			generator = "expense_category_id_sequence"
			
			)
	private Long id;
	@Column(
			nullable = false
			)
	private String category;
	

}
