package com.example.Board;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by leesunghee on 2017. 3. 5..
 *
 * http://mudchobo.tistory.com/549
 * /sosi/1
 * /schedule/add/1?program=무한도전
 *
 */
@RestController
@RequestMapping("/sosi")
public class SosiController {

    @Autowired
    private SosiRepository sosiRepository;

    @RequestMapping("{sosiId}")
    public Sosi getSosi(@PathVariable Long sosiId) {
        Sosi sosi = sosiRepository.findOne(sosiId);
        return sosi;
    }
}