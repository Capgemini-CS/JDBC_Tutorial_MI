package com.example.capgemini.demo.mapper;

import com.example.capgemini.demo.model.Tutorial;
import com.example.capgemini.demo.model.dto.TutorialDTO;
import org.dozer.DozerBeanMapper;

public class TutorialMapper {

    public static TutorialDTO toTutorialDTO (Tutorial tutorial){
        TutorialDTO tutorialDTO = new DozerBeanMapper().map(tutorial,TutorialDTO.class);
        return tutorialDTO;
    }

    public static Tutorial toTutorial (TutorialDTO tutorialDTO){
        Tutorial tutorial = new DozerBeanMapper().map(tutorialDTO,Tutorial.class);
        return tutorial;
    }
}
