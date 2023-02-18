package dev.be.logbackpractice.controller;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class QueryController2 {

    public static final Logger queryLogger = LoggerFactory.getLogger("SQL_LOG2");

    @GetMapping("/query2")
    public String query2() {
        queryLogger.trace("log --> TRACE");
        queryLogger.debug("log --> DEBUG");
        queryLogger.info("log --> INFO");
        queryLogger.warn("log --> WARN");
        queryLogger.error("log --> ERROR");
        return "query2";
    }
}
