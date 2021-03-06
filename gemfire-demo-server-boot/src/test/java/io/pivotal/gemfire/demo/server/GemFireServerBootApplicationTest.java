package io.pivotal.gemfire.demo.server;

import org.apache.geode.cache.Cache;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = { GemFireServerBootApplication.class })
public class GemFireServerBootApplicationTest {
	@Autowired
	private Cache cache;

	@Test
	public void test() {
		Assert.assertNotNull(cache);
	}
}
