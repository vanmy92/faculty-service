package com.daiycodebuffer.faculty.service.controller;

import com.daiycodebuffer.faculty.service.entity.Faculty;
import com.daiycodebuffer.faculty.service.service.FacultyService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/facultys")

@Slf4j
public class FacultyController {

    @Autowired
    private FacultyService facultyService;
    @PostMapping("/")
    public Faculty saveFaculty(@RequestBody  Faculty faculty){
        log.info("inside saveFaculty in FacultyController");
        return facultyService.saveFaculty(faculty);
    }

    @GetMapping("/{id}")
    public Faculty findFacultyById(@PathVariable("id")  Long facultyId){
        log.info("inside findFacultyById in FacultyController");
        return facultyService.findFacultyById(facultyId);
    }
}
