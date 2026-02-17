package in.shambhavi.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.shambhavi.entity.AccessRequest;

public interface AccessRequestRepository extends JpaRepository<AccessRequest, Integer> {

}
