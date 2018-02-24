package com.leon;

import com.sun.org.apache.regexp.internal.RE;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by leon on 2018/2/24.
 */
@RestController
public class GirlController {
    @Autowired
    private GirlRepository girlRepository;
    @Autowired
    private GirlService girlService;

    /**
     * 查询所有女生列表
     *
     * @return
     */
    @GetMapping(value = "/girls")
    public List<Girl> getGirls() {
        return girlRepository.findAll();
    }

    /**
     * 添加一个新的女生信息
     *
     * @param cupSize
     * @param age
     * @return
     */
    @PostMapping(value = "/girls")
    public Girl insertGirl(@RequestParam("cupSize") String cupSize,
                           @RequestParam("age") Integer age) {
        Girl girl = new Girl();
        girl.setAge(age);
        girl.setCupSize(cupSize);

        return girlRepository.save(girl);
    }

    /**
     * 根据id查询一个女生信息
     *
     * @param id
     * @return
     */
    @GetMapping(value = "/girls/{id}")
    public Girl getGirl(@PathVariable Integer id) {
        return girlRepository.findOne(id);
    }

    /**
     * 通过id更新一个女生信息
     *
     * @param id
     * @param cupSize
     * @param age
     * @return
     */
    @PutMapping(value = "/girls/{id}")
    public Girl updateGirl(@PathVariable Integer id,
                           @RequestParam("cupSize") String cupSize,
                           @RequestParam("age") Integer age) {
        Girl girl = new Girl();
        girl.setId(id);
        girl.setCupSize(cupSize);
        girl.setAge(age);

        return girlRepository.save(girl);
    }

    @DeleteMapping(value = "/girls/{id}")
    public void updateGirl(@PathVariable Integer id) {
        girlRepository.delete(id);
    }

    @GetMapping(value = "/girls/age/{age}")
    public List<Girl> getGirlByAge(@PathVariable Integer age) {
        return girlRepository.findByAge(age);
    }

    @GetMapping(value = "/girls/two")
    public void insertTwoGirls() {
        girlService.insertTwo();
    }
}
