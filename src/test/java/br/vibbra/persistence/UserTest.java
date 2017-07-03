package br.vibbra.persistence;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import br.vibbra.basic.dao.UserDao;

/**
 * 
 * @author Brunno de Almeida Santos
 *
 */
@Ignore
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:application-context-test.xml" })
@Transactional
public class UserTest {

	@Autowired
	private UserDao userDao;

	@Before
	public void setup() {

	}

	@Test
	public void saveAndDeleteTest() {
		userDao.findAll();
	}
}
