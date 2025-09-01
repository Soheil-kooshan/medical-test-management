package com.soheil.test_management.mappers;

import com.soheil.test_management.dtos.request.AppointmentRequestDTO;
import com.soheil.test_management.dtos.response.AppointmentResponseDTO;
import com.soheil.test_management.entities.Appointment;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper
public interface AppointmentMapper {

    @Mapping(source = "doctor.id", target = "doctorId")
    @Mapping(source = "patient.id", target = "patientId")
    AppointmentResponseDTO toDTO(Appointment appointment);
    @Mapping(source = "doctorId",target = "doctor.id")
    @Mapping(source = "patientId", target = "patient.id")
    Appointment toEntity(AppointmentRequestDTO DTO);

    List<AppointmentResponseDTO> toDTOs(List<Appointment> appointments);
    List<Appointment> toEntityList(List<AppointmentRequestDTO> DTOs);
}
