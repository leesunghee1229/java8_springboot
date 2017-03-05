package com.example.Board;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by leesunghee on 2017. 3. 5..
 * 소스 내용을 보면 Repository클래스를 통해 Autowired하면 기본 인터페이스를 해당 모델기반 구현체를 만듭니다.
 * 그 구현체에서 save, findOne 등 함수를 통해 데이터 삽입 및 가져올 수 있습니다.
 */
@RestController
@RequestMapping("/schedule")
public class ScheduleController {

    @Autowired
    private ScheduleRepository scheduleRepository;

    @Autowired
    private SosiRepository sosiRepository;

    @RequestMapping("{scheduleId}")
    public Schedule getSchedule(@PathVariable Long scheduleId) {
        Schedule schedule = scheduleRepository.findOne(scheduleId);
        Sosi sosi = schedule.getSosi();
        return schedule;
    }

    @RequestMapping("add/{sosiId}")
    public Schedule addSchedule(@PathVariable Long sosiId, @RequestParam(value="program") String program) {
        Sosi sosi = sosiRepository.findOne(sosiId);
        Schedule schedule = scheduleRepository.save(new Schedule(sosi, program));

        return schedule;
    }
}