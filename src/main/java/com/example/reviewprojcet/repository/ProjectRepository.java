package com.example.reviewprojcet.repository;

import com.example.reviewprojcet.entity.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ProjectRepository extends JpaRepository<Project,Long> {
    @Query(value = "select * from project where project_name like %:project_name% ", nativeQuery=true)
    List<Project> findProjectByProjectName(@Param("project_name") String project_name);
}
