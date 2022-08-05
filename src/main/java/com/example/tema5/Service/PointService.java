package com.example.tema5.Service;

import com.example.tema5.DTO.CustomerDTO;
import com.example.tema5.DTO.PointDTO;
import com.example.tema5.Mapper.CustomerMapper;
import com.example.tema5.Mapper.PointMapper;
import com.example.tema5.Model.Customer;
import com.example.tema5.Model.Point;
import com.example.tema5.Repository.CustomerRepository;
import com.example.tema5.Repository.PointRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class PointService {
    private final PointRepository pointRepository;

    private final PointMapper pointMapper;

    public List<PointDTO> getPoint() {
        return pointRepository.findAll().stream().map(pointMapper::toPointDTO).collect(Collectors.toList());
    }

    public Point savePoint(Point point) {
        return pointRepository.save(point);
    }

    public Point updatePoint(Point point) {
        return pointRepository.save(point);
    }

    public PointDTO getPointById(Integer id) {
        return pointMapper.toPointDTO(pointRepository.findById(id).get());
    }



}
