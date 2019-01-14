package com.test.boot;

import com.test.dao.DataStorage;
import com.test.data.Data;
import com.test.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@SpringBootApplication(scanBasePackages = {"com.*"})
public class MainApplication {
    @Autowired
    private Logger logger;
    @Autowired
    private DataStorage storage;

    @RequestMapping(value = "/")
    public String health() {
        return "App OK!";
    }

    @RequestMapping(value = "/submit/{id}", method = RequestMethod.GET)
    public Data fetch(@PathVariable Integer id) {
        logger.log("Fetching Data with ID :" + id);
        return storage.fetch(id);
    }

    @RequestMapping(value = "/submit", method = RequestMethod.POST)
    public void save(Data data) {
        boolean success = storage.save(storage.getCurrentId(), data);
        if (success) {
            logger.log("Successfully Saved Data");
        } else {
            logger.log("An Error has Occurred");
        }
    }

    public static void main(String[] args) {
        SpringApplication.run(MainApplication.class, args);
    }
}
