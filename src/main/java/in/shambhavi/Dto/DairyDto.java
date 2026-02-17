package in.shambhavi.Dto;

import java.time.LocalDateTime;

import in.shambhavi.enu.Visibility;
import lombok.Data;

@Data
public class DairyDto {
	
	private Integer dairyId;
	
	private String title;
	
	private String pdfPath;
	
	private LocalDateTime createdAt;
	
	private Visibility visible;
	

}
