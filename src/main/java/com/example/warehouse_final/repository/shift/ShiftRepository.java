package com.example.warehouse_final.repository.shift;

import com.example.warehouse_final.entity.shift.Shift;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface ShiftRepository extends JpaRepository<Shift, Long> {

    boolean existsByEmployeeIdAndDate(Long id, LocalDate date);

    List<Shift> findShiftsByEmployeeId(Long id);

    List<Shift> findShiftsByEmployeeIdAndDate(Long employee_id, LocalDate date);

    /*
    @Query("SELECT s FROM Shift s WHERE s.employee.id = :employeeId AND s.date = :date")
    List<Shift> findShiftsByEmployeeIdAndDate(@Param("employeeId") Long employeeId, @Param("date") LocalDate date);

     */
}
