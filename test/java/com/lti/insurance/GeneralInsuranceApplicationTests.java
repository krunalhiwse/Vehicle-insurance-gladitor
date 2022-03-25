package com.lti.insurance;

import static org.junit.jupiter.api.Assertions.assertEquals;

import javax.transaction.Transactional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.lti.insurance.dao.ContactDAO;
import com.lti.insurance.pojo.Contactpojo;

@SpringBootTest
@Transactional
class GeneralInsuranceApplicationTests {
	@Autowired
	ContactDAO cdao;

	@Test
	void tastaddContact() {
		Contactpojo cp = new Contactpojo("anhsul","dashore","ansh19@gmail.com","good");
		boolean res =cdao.addContact(cp);
		assertEquals(true, res);
		
		
	}

}
