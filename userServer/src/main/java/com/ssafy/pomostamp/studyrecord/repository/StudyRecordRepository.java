package com.ssafy.pomostamp.studyrecord.repository;

import com.ssafy.pomostamp.studyrecord.dto.StudyRecord;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.sql.Timestamp;
import java.util.List;

public interface StudyRecordRepository extends JpaRepository<StudyRecord, Long> {

    StudyRecord findByRecordId(Long recordId);

    List<StudyRecord> findAllByUser_UserIdAndStartRecordBetween(String userId, Timestamp st,  Timestamp ed);
}
