package com.avroconverter.controller;

import com.avroconverter.models.ModelSchema;
import com.avroconverter.service.ProcessService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProcessController {

    private final ProcessService processService;

    public ProcessController(ProcessService processService) {
        this.processService = processService;
    }

    @PostMapping("/consume")
    public ResponseEntity<String> processList(@RequestBody List<ModelSchema> modelSchemas) {
        if (modelSchemas == null) {
            return new ResponseEntity<>("nothing to process", HttpStatus.NOT_FOUND);
        }
            processService.processFile(modelSchemas);

        return new ResponseEntity<>("all files processed successfully", HttpStatus.OK);
    }
}
