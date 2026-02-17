package in.shambhavi.response;

import java.time.LocalDateTime;

import in.shambhavi.enu.RequestStatus;
import lombok.Data;

@Data
public class AccessRequestViewResponse {
	
	private Integer requestId;
	
	private RequestStatus status;
	
	private String diaryTitle;
	
	private String message;
	
	private LocalDateTime requestAt;
	
	private String requesterUserName;

}
