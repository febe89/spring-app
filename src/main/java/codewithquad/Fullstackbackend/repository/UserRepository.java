package codewithquad.Fullstackbackend.repository;

import codewithquad.Fullstackbackend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
