package in.shambhavi.serviceImpl;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import in.shambhavi.Dto.UserDto;
import in.shambhavi.entity.User;
import in.shambhavi.enu.AccountStatus;
import in.shambhavi.exception.UserException;
import in.shambhavi.repo.UserRepository;
import in.shambhavi.request.UserRegisterRequest;
import in.shambhavi.service.IUserService;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Service 

public class IUserServiceImpl implements IUserService {
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private PasswordEncoder passwordEncoder;
	
	

	@Override
	public void registerUser(UserRegisterRequest request) {
		User user=new User();
		
		user.setUName(request.getUName());
		user.setEmail(request.getEmail());
		user.setPassword(passwordEncoder.encode(request.getPassword()));
		user.setCreatedAt(LocalDateTime.now());
		user.setStatus(AccountStatus.ACTIVE);
		userRepository.save(user);
	}

	

	@Override
	public UserDto getUserById(Integer userId) {
		User user=userRepository.findById(userId)
				.orElseThrow(()->new UserException("user Not Found", HttpStatus.NOT_FOUND));
		
		UserDto userDto=new UserDto();
		userDto.setUId(user.getUId());
		userDto.setStatus(user.getStatus());
		userDto.setUName(user.getUName());
		
		return userDto;
		
	}

	@Override
	public void blockUser(Integer userId) {
		
		User user=userRepository.findById(userId)
				.orElseThrow(()->new UserException("Not Found", HttpStatus.NOT_FOUND));
		user.setStatus(AccountStatus.BLOCKED);
		userRepository.save(user);
		
	}

}
