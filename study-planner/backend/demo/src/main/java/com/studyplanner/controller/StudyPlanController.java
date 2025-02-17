package com.studyplanner.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.studyplanner.model.StudyPlan;
import com.studyplanner.repository.StudyPlanRepository;

@RestController
@RequestMapping("/api/study")
@CrossOrigin(origins = "http://localhost:3000")
public class StudyPlanController {
    @Autowired
    private StudyPlanRepository studyPlanRepository;

    @GetMapping("/plans")
    public List<StudyPlan> getStudyPlans() {
        return studyPlanRepository.findAll();
    }

    @PostMapping("/add")
    public StudyPlan addStudyPlan(@RequestBody StudyPlan studyPlan) {
        return studyPlanRepository.save(studyPlan);
    }
}
