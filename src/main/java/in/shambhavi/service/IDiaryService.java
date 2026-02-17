package in.shambhavi.service;

import java.util.List;

import in.shambhavi.entity.Diary;
import in.shambhavi.request.DiaryCreateRequest;
import in.shambhavi.response.DiaryContentResponse;
import in.shambhavi.response.DiaryTitleResponse;

public interface IDiaryService {
	
	public void createDiary(DiaryCreateRequest request);

    public List<DiaryTitleResponse> getPublicDiaryTitles();

    public DiaryContentResponse getDiaryContentIfApproved(Integer diaryId);

    public List<DiaryTitleResponse> getUserDiaries();
	
	

}
