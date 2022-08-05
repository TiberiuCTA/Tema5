package com.example.tema5.Controller;

import com.example.tema5.DTO.PointDTO;
import com.example.tema5.Model.Point;
import com.example.tema5.Service.PointService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequiredArgsConstructor
@RequestMapping("point")
public class PointController {
    private final PointService pointService;

    @GetMapping
    public List<PointDTO> getPoint() {
        return pointService.getPoint();
    }

    @PostMapping
    public Point savePoint(@RequestBody Point point) {
        return pointService.savePoint(point);
    }

    @PutMapping
    public Point updatePoint(@RequestBody Point point) {
        return pointService.updatePoint(point);
    }

    @GetMapping("/{id}")
    public PointDTO getPointById(@PathVariable("id") Integer id) {
        return pointService.getPointById(id);
    }
}
