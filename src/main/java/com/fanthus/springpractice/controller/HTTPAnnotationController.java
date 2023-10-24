package com.fanthus.springpractice.controller;

import com.fanthus.springpractice.model.request.PageGetRequest;
import com.fanthus.springpractice.model.request.PagePostRequest;
import com.fanthus.springpractice.model.request.ValidRequest;
import com.fanthus.springpractice.model.response.PersonResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.*;

@Slf4j
@RestController
public class HTTPAnnotationController {

    @RequestMapping(method = RequestMethod.GET, path = {"requestMapping/get", "requestMapping/get2"} , params = {"id=1"}, headers = "Content-Type=application/json")
    public String reqestMapping() {
        return "request mapping";
    }

    @GetMapping("get/pure")
    public String queryData() {
        log.info("http {}", "queryData");
        return "query";
    }

    @GetMapping("get/person")
    public PersonResponse queryPerson() {
        PersonResponse personResponse = new PersonResponse();
        personResponse.setName("fanthus");
        personResponse.setId(1);
        return personResponse;
    }

    @GetMapping("get/persons")
    public List<PersonResponse> queryPersons() {
        PersonResponse personResponse = new PersonResponse();
        personResponse.setName("fanthus");
        personResponse.setId(1);
        return  Arrays.asList(personResponse);
    }

    @GetMapping("get/params")
    public HashMap<String, Integer> queryData(@RequestParam(name = "pageStart") Integer pageNo, @RequestParam Integer pageSize) {
        log.info("pageNo {}, pageSize {}", pageNo, pageSize);
        HashMap<String,Integer> info = new HashMap<>();
        info.put("pageNo",pageNo);
        info.put("pageSize", pageSize);
        return info;
    }

    @GetMapping("get/paramArray")
    public String queryParamArray(@RequestParam List<String > params) {
        log.info("params {}", params);
        return "queryParamsArray";
    }

    @GetMapping("get/paramNoAnnotation")
    public String getParamNoAnnotation(String page) {
        log.info("params {}", page);
        return "queryParamNoAnnotation";
    }

    @PostMapping("post/paramNoAnnotation")
    public String postParamNoAnnotation(String page) {
        log.info("params {}", page);
        return "queryParamNoAnnotation";
    }

    @GetMapping("get/paramModel")
    public HashMap<String, Integer> queryData(@RequestParam PageGetRequest requestGetModel) {
        log.info("pageNo {}, pageSize {}", requestGetModel.getPageNo(), requestGetModel.getPageSize());
        HashMap<String,Integer> info = new HashMap<>();
        info.put("pageNo",requestGetModel.getPageNo());
        info.put("pageSize", requestGetModel.getPageSize());
        return info;
    }

    @PostMapping("post/json")
    public String postJSON(@RequestBody String jsonStr) {
        log.info("content {}", jsonStr);
        return "hello";
    }

    @PostMapping("post/form")
    public String postFORM(@RequestBody String formStr) {
        log.info("content {}", formStr);
        return "hello";
    }

    @PostMapping("post/jsonModel")
    public String postJSONModel(@RequestBody PagePostRequest jsonRequest) {
        log.info("request {}, name {}", jsonRequest, jsonRequest.getName());
        return "hello";
    }

    @PostMapping("post/formModel")
    public String postFORMModel(@RequestBody PagePostRequest formRequest) {
        log.info("request {}, name {}", formRequest, formRequest.getName());
        return "hello";
    }

    @GetMapping("get/requestHeader")
    public String getRequestHeader(@RequestHeader HashMap<String, Object> header) {
        log.info("getRequestHeader {}",header);
        return "hello";
    }
    @GetMapping("get/requestHeader/onlyHost")
    public String getRequestHeaderOnlyHost(@RequestHeader("host") String host) {
        log.info("getRequestHeader host {}",host);
        return "hello";
    }

    @GetMapping("get/valid")
    public String getValid(@Valid ValidRequest requst) {
        log.info("request {}", requst);
        return "hello";
    }

    @PostMapping("post/valid")
    public String postValid(@RequestBody @Valid ValidRequest requst) {
        log.info("request {}", requst);
        return "hello";
    }

}
