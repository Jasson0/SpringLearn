package com.leon;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by leon on 2018/2/24.
 */
@Service
public class GirlService {
    @Autowired
    GirlRepository girlRepository;

    @Transactional
    public void insertTwo() {
        Girl girlA = new Girl();
        girlA.setAge(18);
        girlA.setCupSize("A");
        girlRepository.save(girlA);

        Girl girlB = new Girl();
        girlB.setAge(19);
        girlB.setCupSize("BBBBBB");
        girlRepository.save(girlB);
    }
}
