package myproject.projectCourse.repositories;


import org.springframework.data.jpa.repository.JpaRepository;

import myproject.projectCourse.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
