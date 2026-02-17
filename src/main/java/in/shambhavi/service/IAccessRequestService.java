package in.shambhavi.service;

import java.util.List;
import in.shambhavi.request.MessageRequestCreate;
import in.shambhavi.response.AccessRequestViewResponse;

public interface IAccessRequestService {
	
	public void createRequest(Integer diaryId); 
	
	public void addMessageToRequest(Integer requestId, MessageRequestCreate request);
	
	public List<AccessRequestViewResponse> getRequestsForAuthor();
	
	public void approveRequest(Integer requestId);

	public void rejectRequest(Integer requestId);

    public boolean hasApprovedAccess(Integer diaryId);
	
	

}
