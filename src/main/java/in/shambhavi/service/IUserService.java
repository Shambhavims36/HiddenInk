package in.shambhavi.service;

import in.shambhavi.Dto.UserDto;
import in.shambhavi.request.UserRegisterRequest;

public interface IUserService {
	
	public void registerUser(UserRegisterRequest request);

    public UserDto getUserById(Integer userId);

    public void blockUser(Integer userId);

}
