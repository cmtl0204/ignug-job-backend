package com.bolsaempleo.backend.app.dto;

import java.sql.Timestamp;

public class LanguageResponseDto {
    private Long id;
    private Long idiomId;
    private Long readLevelId;
    private Long spokenLevelId;
    private Long writtenLevelId;
    private Long professionalId;
    private Timestamp createdAt;
    private Timestamp updatedAt;

    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getIdiomId() {
        return idiomId;
    }

    public void setIdiomId(Long idiomId) {
        this.idiomId = idiomId;
    }

    public Long getReadLevelId() {
        return readLevelId;
    }

    public void setReadLevelId(Long readLevelId) {
        this.readLevelId = readLevelId;
    }

    public Long getSpokenLevelId() {
        return spokenLevelId;
    }

    public void setSpokenLevelId(Long spokenLevelId) {
        this.spokenLevelId = spokenLevelId;
    }

    public Long getWrittenLevelId() {
        return writtenLevelId;
    }

    public void setWrittenLevelId(Long writtenLevelId) {
        this.writtenLevelId = writtenLevelId;
    }

    public Long getProfessionalId() {
        return professionalId;
    }

    public void setProfessionalId(Long professionalId) {
        this.professionalId = professionalId;
    }

    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }

    public Timestamp getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Timestamp updatedAt) {
        this.updatedAt = updatedAt;
    }
}
