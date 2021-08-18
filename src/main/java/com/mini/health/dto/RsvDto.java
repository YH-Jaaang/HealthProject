package com.mini.health.dto;

import lombok.Data;

@Data
public class RsvDto {
    private String reserveUserId;
    private String reserveTrainerName;
    private String reserveComment;
    private String reserveDate;
    private String reserveCancel;
}
