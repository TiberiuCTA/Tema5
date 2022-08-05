package com.example.tema5.Mapper;

import com.example.tema5.DTO.PointDTO;
import com.example.tema5.Model.Point;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PointMapper {
    PointDTO toPointDTO(Point point);
}
