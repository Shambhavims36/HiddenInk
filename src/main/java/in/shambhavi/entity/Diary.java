package in.shambhavi.entity;

import java.time.LocalDateTime;

import in.shambhavi.enu.Visibility;
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
@Table(name="diaries")
public class Diary {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer dairyId;
	
	@Column(nullable=false,unique=true)
	private String diaryTitle;
	
	@Column(nullable=false,name="pdf_path")
	private String pdfPath;
	
	@Column(nullable=false)
	private LocalDateTime createdAt;
	
	@Enumerated(EnumType.STRING)
	@Column(nullable=false)
	private Visibility visible=Visibility.PRIVATE;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="Author_id",nullable=false)
	private User Author; //joining author column in user entity
	
	
	

}
