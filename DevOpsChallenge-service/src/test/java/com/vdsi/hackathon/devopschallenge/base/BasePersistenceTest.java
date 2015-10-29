package com.vdsi.hackathon.devopschallenge.base;

import org.dbunit.DatabaseTestCase;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:testconfig/test-persistence.xml")
public abstract class BasePersistenceTest extends DatabaseTestCase {

}
