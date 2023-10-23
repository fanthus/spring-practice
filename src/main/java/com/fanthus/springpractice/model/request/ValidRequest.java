package com.fanthus.springpractice.model.request;

import lombok.Data;

import javax.validation.constraints.AssertFalse;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
public class ValidRequest {
    @NotNull
    private String name;
    @AssertFalse
    private  boolean hasVote;
    @Min(1)
    private  Integer voteNumber;
    @NotBlank(message="原因不能为空")
    private  String reason;
}

