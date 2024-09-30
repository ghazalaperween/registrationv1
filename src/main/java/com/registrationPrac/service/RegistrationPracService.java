package com.registrationPrac.service;

import com.registrationPrac.entity.RegistrationPrac;
import com.registrationPrac.exception.ResourceNotFoundException;
import com.registrationPrac.payload.RegistrationPracDto;
import com.registrationPrac.repositroy.RegistrationPracRepository;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class RegistrationPracService {

    private RegistrationPracRepository registrationPracRepository;

    private ModelMapper modelMapper;

    public RegistrationPracService(RegistrationPracRepository registrationPracRepository, ModelMapper modelMapper) {
        this.registrationPracRepository = registrationPracRepository;
        this.modelMapper = modelMapper;
    }

    public List<RegistrationPracDto> getRegistration(){
        List<RegistrationPrac> registrationPrac = registrationPracRepository.findAll();
        List<RegistrationPracDto> dtos = registrationPrac.stream().map(r -> mapTODto(r)).collect(Collectors.toList());
        return dtos;
    }


    public RegistrationPracDto createRegistration(RegistrationPracDto registrationPracDto) {

        // This part of code Copy dto to entity
        RegistrationPrac registrationPrac = mapToEntity(registrationPracDto);
//        RegistrationPrac registrationPrac = new RegistrationPrac();
//        registrationPrac.setName(registrationPracDto.getName());
//        registrationPrac.setEmail(registrationPracDto.getEmail());
//        registrationPrac.setMobile(registrationPracDto.getMobile());
        RegistrationPrac savedEntity = registrationPracRepository.save(registrationPrac);

       //This part of code  Copy entity to dto
        RegistrationPracDto dto = mapTODto(savedEntity);
//        RegistrationPracDto dto = new RegistrationPracDto();
//        dto.setName(savedEntity.getName());
//        dto.setEmail(savedEntity.getEmail());
//        dto.setMobile(savedEntity.getMobile());
            return dto;

    }


    RegistrationPrac mapToEntity(RegistrationPracDto registrationPracDto){
        RegistrationPrac registrationPrac = modelMapper.map(registrationPracDto, RegistrationPrac.class); // all data is copy in one line

//        RegistrationPrac registrationPrac = new RegistrationPrac();
//        registrationPrac.setName(registrationPracDto.getName());
//        registrationPrac.setEmail(registrationPracDto.getEmail());
//        registrationPrac.setMobile(registrationPracDto.getMobile());
        return registrationPrac;
    }


    RegistrationPracDto mapTODto(RegistrationPrac registrationPrac){
      RegistrationPracDto dto = modelMapper.map(registrationPrac, RegistrationPracDto.class);
      // all data is copy in one line
//        RegistrationPracDto dto = new RegistrationPracDto();
//        dto.setName(registrationPrac.getName());
//        dto.setEmail(registrationPrac.getEmail());
//        dto.setMobile(registrationPrac.getMobile());
        return dto;
    }


//    public RegistrationPracDto getRegistrationBYId(long id) {
//        RegistrationPrac registrationPrac = registrationPracRepository.findById(id).get();
//            return mapTODto(registrationPrac);
//
//    }

    public RegistrationPracDto getRegistrationBYId(long id) {
        RegistrationPrac registrationPrac = registrationPracRepository.findById(id).orElseThrow(
                ()->new ResourceNotFoundException("Record not found")
        );
            return mapTODto(registrationPrac);

    }
}
