package com.example.expenseTracker.Entity;

import java.time.LocalDate;

import jakarta.annotation.Nullable;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.PrePersist;
import jakarta.persistence.SequenceGenerator;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Transactional
public class Expenses {
	
	
	@Id
	@SequenceGenerator(
			
			name = "expense_id_sequence",
			sequenceName = "expense_id_sequence",
			allocationSize = 1
			
			)
	
	@GeneratedValue(
			strategy = GenerationType.SEQUENCE,
			generator = "expense_id_sequence"
			
			)
	private Long id;
	
	@Column(
			nullable = false
			)
	private LocalDate date;
	
	@PrePersist
    public void prePersist() {
        this.date = LocalDate.now();
    }
	@Column(
			nullable = false
			)
	private Double	amount;
	
	
	@Column(
			nullable = false
			)
	private String descriptions;
	
	
	@ManyToOne(
			
			cascade = CascadeType.ALL,
			fetch = FetchType.LAZY
			)
	
	@JoinColumn(
			
			name = "expense_category_id",
			nullable = false
		
			)
	private ExpenseCategory expenseCategory;
	
	
	@ManyToOne(
			
			cascade = CascadeType.ALL,
			fetch = FetchType.LAZY
			
			)
	@JoinColumn(
			
			name = "user_id",
			nullable = false
		
			)
	private User user;
	
	
	

}
