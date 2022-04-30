package com.example.reviewprojcet.controller;

import com.example.reviewprojcet.dto.ProjectDto;
import com.example.reviewprojcet.dto.ProjectSearchDto;
import com.example.reviewprojcet.entity.Project;
import com.example.reviewprojcet.repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.Banner;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class PersonalController {
    @Autowired
    ProjectRepository projectRepository;


    @GetMapping("/{id}")
    public String PersonalPage(@PathVariable String id, Model model){
        model.addAttribute("id",id);

        List<Project> projectList = projectRepository.findAll();
        List<Project> personalList = new ArrayList<>();


        for(Project project:projectList){
            String creater = project.getCreater();
            try {
                if (project.getCreater().equals(id)){
                    personalList.add(project);

                }

            }catch (Exception e){}


        }
        model.addAttribute("personalList",personalList);
        return "personal";

    }



    @GetMapping("/create/{id}")
    public String ProjectEdit(@PathVariable String id, Model model){
        model.addAttribute("id",id);
        return "create_project";
    }



    @PostMapping("/create/project/{id}")
    public String ProjectSave(@PathVariable String id, ProjectDto projectDto){
        System.out.println(projectDto.toString());


        Project project = projectDto.toEntity(id);
        projectRepository.save(project);

        return "redirect:/{id}";
    }

    @PostMapping("/search/project/{id}")
    public String ProjectSearch(@PathVariable String id, ProjectSearchDto projectSearchDto){
        System.out.println(projectSearchDto.toString());
        String projectName = projectSearchDto.getProjectName();
        if (projectName.equals("")){
            System.out.println("if null print");
            System.out.println(id);
            return "redirect:/{id}/";
        }

        return "redirect:/{id}/"+projectName;
    }

    @GetMapping("{id}/{projectName}")
    public String ProjectSearchPage(Model model,@PathVariable String projectName){
        List<Project> searchProject = projectRepository.findProjectByProjectName(projectName);
        System.out.println(projectName);
        for(Project project:searchProject){
            System.out.println(project.toString());
        }
        model.addAttribute("searchProject",searchProject);
        return "personal_search";
    }
}
