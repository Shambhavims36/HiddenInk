package in.shambhavi.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.shambhavi.entity.RequestMessage;

public interface RequestMessageRepository extends JpaRepository<RequestMessage, Integer> {

}
