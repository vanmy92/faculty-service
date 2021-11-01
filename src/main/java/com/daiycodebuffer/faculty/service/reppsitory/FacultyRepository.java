package com.daiycodebuffer.faculty.service.reppsitory;

import com.daiycodebuffer.faculty.service.entity.Faculty;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FacultyRepository extends JpaRepository<Faculty,Long> {

    Faculty findByFacultyId(Long facultyId);
}
