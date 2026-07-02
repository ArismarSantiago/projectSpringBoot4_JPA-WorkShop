package myproject.projectCourse.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import myproject.projectCourse.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
