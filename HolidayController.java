package com.example.demo.common.controller;

import com.example.demo.common.service.HolidayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;


@RestController
@RequestMapping("/common")
public class HolidayController {
    @Autowired
    private HolidayService holidayService;

    @RequestMapping("date/{year}/{holiday}")
    public List<String> date(@PathVariable String year, @PathVariable String holiday) {
        return holidayService.date(year, holiday);
    }
}
