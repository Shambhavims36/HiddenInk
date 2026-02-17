package in.shambhavi.Dto;

import java.time.LocalDateTime;

import in.shambhavi.entity.AccessRequest;
import lombok.Data;

@Data
public class RequestMessageDto {
	
	private Integer messageId;
	
	private String message;
	
	private LocalDateTime sentAt;
	
	private AccessRequest request_id;

}
