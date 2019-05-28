package com.example.demoMultiplePostgres;

import com.example.demoMultiplePostgres.first.domain.LimitEntity;
import com.example.demoMultiplePostgres.first.repository.LimitRepository;
import com.example.demoMultiplePostgres.second.domain.FiatEntity;
import com.example.demoMultiplePostgres.second.repository.FiatRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoMultiplePostgresApplicationTests {

	@Autowired
	private FiatRepository fiatRepository;

	@Autowired
	private LimitRepository limitRepository;

	@Test
	public void contextLoads() {

//		LimitEntity limitEntity = new LimitEntity();
//		limitEntity.setName("firstLimit");
//		limitRepository.save(limitEntity);

		FiatEntity fiatEntity = new FiatEntity();
		fiatEntity.setName("firstFiat");
		fiatRepository.save(fiatEntity);
	}

}
