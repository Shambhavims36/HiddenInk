package in.shambhavi.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="request_messages")
public class RequestMessage {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer messageId;
	
	@Column(nullable=false,length = 1000)
	private String message;
	
	@Column(nullable=false)
	private LocalDateTime sentAt;
	
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="request_id",nullable=false)
	private AccessRequest request_id;
	
	

}
