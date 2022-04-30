package com.example.reviewprojcet.dto;


import com.example.reviewprojcet.entity.Project;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

@Getter
@AllArgsConstructor
@Setter
@ToString
public class ProjectDto {


    String projectName;

    String[] groupMember;


    public Project toEntity(String id){

        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date date = new Date();
        String dateToStr = dateFormat.format(date);
        String groupMemberArrayToString = String.join(",", groupMember);;


        return new Project(null,projectName,groupMemberArrayToString,id,dateToStr);
    }


}
