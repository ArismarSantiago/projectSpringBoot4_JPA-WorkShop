package myproject.projectCourse.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import myproject.projectCourse.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
	
}
