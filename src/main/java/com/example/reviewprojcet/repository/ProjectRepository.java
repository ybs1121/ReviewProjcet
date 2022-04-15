package com.example.reviewprojcet.repository;

import com.example.reviewprojcet.entity.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepository extends JpaRepository<Project,Long> {
}
