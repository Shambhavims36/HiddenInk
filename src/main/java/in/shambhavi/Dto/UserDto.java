package in.shambhavi.Dto;

import java.time.LocalDateTime;

import in.shambhavi.enu.AccountStatus;
import lombok.Data;

@Data
public class UserDto {
	
	private Integer uId;
	
	private String uName;
	
	private AccountStatus status;

}
