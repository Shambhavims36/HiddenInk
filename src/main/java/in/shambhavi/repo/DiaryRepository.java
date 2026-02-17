package in.shambhavi.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.shambhavi.entity.Diary;

public interface DiaryRepository extends JpaRepository<Diary, Integer>{

}
