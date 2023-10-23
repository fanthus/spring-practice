package com.fanthus.springpractice.model.request;

import lombok.Data;

@Data
public class PageGetRequest {

    private Integer pageNo;

    private Integer pageSize;

}
