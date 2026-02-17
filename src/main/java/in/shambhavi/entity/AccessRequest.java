package in.shambhavi.entity;

import java.time.LocalDateTime;



import in.shambhavi.enu.RequestStatus;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="access_requests")
public class AccessRequest {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer requestId;
	
	@Enumerated(EnumType.STRING)
	@Column(nullable=false)
	private RequestStatus status=RequestStatus.PENDING;
	
	@Column(nullable=false)
	private LocalDateTime requestAt;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="diary_id",nullable=false)
	private Diary diary_id;// many requests can send to one diary
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="Author_id",nullable=false)
	private User Author_id;//multiple requests can send to one author
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="requester_id",nullable=false)
	private User requester_id;//many requests can send by one user

}
