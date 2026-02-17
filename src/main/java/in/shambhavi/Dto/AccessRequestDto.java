package in.shambhavi.Dto;

import java.time.LocalDateTime;

import in.shambhavi.entity.Diary;
import in.shambhavi.entity.User;
import in.shambhavi.enu.RequestStatus;
import lombok.Data;

@Data
public class AccessRequestDto {
	
	private Integer requestId;
	
	private RequestStatus status;
	
	private LocalDateTime requestAt;
	
	private Diary diary_id;
	
	private User Author_id;
	
	private User requester_id;

}
