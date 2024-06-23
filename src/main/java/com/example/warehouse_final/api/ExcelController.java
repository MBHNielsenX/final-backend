package com.example.warehouse_final.api;

import com.example.warehouse_final.dto.users.request.ShiftRequest;
import com.example.warehouse_final.service.shift.ShiftService;
import com.example.warehouse_final.service.ExcelService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/api/excel")
public class ExcelController {

    private final ExcelService excelService;
    private final ShiftService shiftService;

    public ExcelController(ExcelService excelService, ShiftService shiftService) {
        this.excelService = excelService;
        this.shiftService = shiftService;
    }

    @PostMapping("/upload")
    public ResponseEntity<List<ShiftRequest>> uploadExcel(@RequestParam("file") MultipartFile file) {
        List<ShiftRequest> data = excelService.readExcelFile(file);
        shiftService.createShifts(data);

        return ResponseEntity.ok(data);
    }



}
