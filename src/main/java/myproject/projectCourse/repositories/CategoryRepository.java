package myproject.projectCourse.repositories;


import org.springframework.data.jpa.repository.JpaRepository;

import myproject.projectCourse.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
