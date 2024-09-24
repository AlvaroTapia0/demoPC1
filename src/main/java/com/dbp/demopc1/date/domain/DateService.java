package com.dbp.demopc1.date.domain;

import com.dbp.demopc1.date.infrastructure.DateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DateService {
    @Autowired
    private DateRepository dateRepository;





}
