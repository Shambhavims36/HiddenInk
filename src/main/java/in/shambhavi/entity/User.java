package in.shambhavi.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;

import in.shambhavi.enu.AccountStatus;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name="users")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer uId;
	
	@Column(nullable=false,unique=true)
	private String uName;
	
	@Column(nullable=false,unique=true)
	private String Email;
	
	@Column(nullable=false)
	private String Password;
	
	@Column(nullable=false)
	private LocalDateTime createdAt;
	
	@Enumerated(EnumType.STRING)
	@Column(nullable=false)
	private AccountStatus status=AccountStatus.ACTIVE;
	
	
	

}
