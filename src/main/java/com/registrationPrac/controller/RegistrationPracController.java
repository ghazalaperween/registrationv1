package com.registrationPrac.controller;

import com.registrationPrac.entity.RegistrationPrac;

import com.registrationPrac.payload.RegistrationPracDto;
import com.registrationPrac.service.RegistrationPracService;

import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/registrationprac")
public class RegistrationPracController {

    private RegistrationPracService registrationPracService;

    public RegistrationPracController(RegistrationPracService registrationPracService) {
        this.registrationPracService = registrationPracService;
    }

//    @GetMapping
//    public List<RegistrationPrac> getAllRegiatration(){
//        List<RegistrationPrac> registrationPrac = registrationPracService.getRegistration();
//        return registrationPrac;
//
//    }

    @GetMapping
    public ResponseEntity<List<RegistrationPracDto>> getAllRegiatration(){
        List<RegistrationPracDto> dtos = registrationPracService.getRegistration();
        return new ResponseEntity<>(dtos, HttpStatus.OK);

    }



//    @PostMapping
//    public ResponseEntity<RegistrationPracDto> createRegistration(
//            @RequestBody RegistrationPracDto registrationPracDto
//    ){
//       RegistrationPracDto regPracDto = registrationPracService.createRegistration(registrationPracDto);
//        return new ResponseEntity<>(regPracDto, HttpStatus.CREATED);
//    }

    @PostMapping
    public ResponseEntity<?> createRegistration(
          @Valid @RequestBody RegistrationPracDto registrationPracDto,
          BindingResult  result

    ){
        if(result.hasErrors()){
            return new ResponseEntity<>(result.getFieldError().getDefaultMessage(), HttpStatus.CREATED);
        }
        RegistrationPracDto regPracDto = registrationPracService.createRegistration(registrationPracDto);
        return new ResponseEntity<>(regPracDto, HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<RegistrationPracDto> getRegistrationById(
       @PathVariable long id
    ) {
        RegistrationPracDto dto = registrationPracService.getRegistrationBYId(id);
        return new ResponseEntity<>(dto, HttpStatus.OK);
    }
}
