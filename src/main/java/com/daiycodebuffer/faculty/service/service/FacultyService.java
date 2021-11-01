package com.daiycodebuffer.faculty.service.service;

import com.daiycodebuffer.faculty.service.entity.Faculty;
import com.daiycodebuffer.faculty.service.reppsitory.FacultyRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class FacultyService {

    @Autowired
    private FacultyRepository facultyRepository;

    public Faculty saveFaculty(Faculty faculty) {
        log.info("inside saveFaculty in FacultyService");
        return facultyRepository.save(faculty);
    }

    public Faculty findFacultyById(Long facultyId) {
        log.info("inside findFacultyById in FacultyService");
        return facultyRepository.findByFacultyId(facultyId);

    }
}
