package com.bolsaempleo.backend.app.dto;

import java.sql.Timestamp;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class ReferenceResponseDto {
    
    private Long id;
    private String contactEmail;
    private String contactName;
    private String contactPhone;
    private String institution;
    private String position;
    private Timestamp createdAt;
    private Timestamp updatedAt;
}