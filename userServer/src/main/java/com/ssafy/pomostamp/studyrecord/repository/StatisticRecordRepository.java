package com.ssafy.pomostamp.studyrecord.repository;

import com.ssafy.pomostamp.studyrecord.dto.StatisticRecord;
import com.ssafy.pomostamp.studyrecord.dto.StatisticRecordId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.time.LocalDate;
import java.util.List;

public interface StatisticRecordRepository extends JpaRepository<StatisticRecord, StatisticRecordId> {

      List<StatisticRecord> findAllByStatisticRecordId_User_UserIdAndStatisticRecordId_StudyDateBetween(String userId, LocalDate startDate , LocalDate endDate );
}
