package com.example.warehouse_final.api.shift;

import com.example.warehouse_final.dto.users.request.ShiftRequest;
import com.example.warehouse_final.dto.users.response.ShiftResponse;
import com.example.warehouse_final.service.shift.ShiftService;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/api/shifts")
public class ShiftController {

    private final ShiftService shiftService;

    public ShiftController (ShiftService shiftService) {
        this.shiftService = shiftService;
    }

    @GetMapping
    List<ShiftResponse> getAllShifts() {
        return shiftService.getAllShifts();
    }

    @GetMapping("/employee/{id}")
    public List<ShiftResponse> getShiftsByEmployeeId(@PathVariable Long id) {
        return shiftService.getShiftsByEmployeeId(id);
    }

    @GetMapping("/employee/{id}/date")
    public List<ShiftResponse> getShiftByEmployeeIdAndDate(@PathVariable Long id,@RequestParam LocalDate date) {
        return shiftService.getShiftsByEmployeeIdAndDate(id, date);
    }

    @GetMapping("/{id}")
    public ShiftResponse getShiftById(@PathVariable Long id) {
        return shiftService.getShiftById(id);
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ShiftResponse createShift(@RequestBody ShiftRequest shiftRequest) {
        return shiftService.createShift(shiftRequest);
    }

    @DeleteMapping("/{id}")
    public void deleteShift(@PathVariable Long id) {
        shiftService.deleteShift(id);
    }

    @PutMapping
    public void updateShift(@RequestBody ShiftRequest shiftRequest) {
        shiftService.updateShift(shiftRequest);
    }


}
