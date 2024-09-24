package com.dbp.demopc1.date.infrastructure;

import com.dbp.demopc1.date.domain.Date;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DateRepository extends JpaRepository<Date, Long> {

}
