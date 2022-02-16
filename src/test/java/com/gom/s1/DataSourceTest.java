package com.gom.s1;

import static org.junit.Assert.*;

import javax.sql.DataSource;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class DataSourceTest extends MyJunitTest {
	
	@Autowired
	private DataSource dataSourcce;
	
	
	@Test
	public void connectionTest() {
		assertNotNull(dataSourcce);
	}

}
