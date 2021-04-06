package com.cg.fda.service;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.BDDMockito;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.cg.fda.domain.DeliveryBoy;
import com.cg.fda.exception.DeliveryBoyException;
import com.cg.fda.repository.DeliveryBoyRepository;

/**
 * A class to test the various methods of the delivery boy service layer.
 * @author amansoni
 *
 */
class DeliveryBoyServiceTest {
	
	@Mock
	DeliveryBoyRepository deliveryBoyRepostiory;
	
	@InjectMocks
	DeliveryBoyService deliveryBoyService;
	
	@BeforeEach
	public void setUp() {
		MockitoAnnotations.openMocks(this);
	}
	
	/**
	 * Testing the saveOrUpdate method of service class by giving correct inputs.
	 */
	@Test
	void test1_saveOrUpdate() {
		DeliveryBoy deliveryBoy = new DeliveryBoy("Db02","Aarush","89123456789","db02@gmail.com");
		BDDMockito.given(deliveryBoyRepostiory.save(deliveryBoy)).willReturn(deliveryBoy);
		DeliveryBoy deliveryBoyGot = deliveryBoyService.saveOrUpdate(deliveryBoy);
		assertNotNull(deliveryBoyGot);
	}
	
	/**
	 * Testing the saveOrUpdate method of service class by giving incorrect input.
	 */
	@Test
	void test2_saveOrUpdate() {
		DeliveryBoy deliveryBoy = new DeliveryBoy("Db2","Aarush","89123456789","db02@gmail.com");
		BDDMockito.given(deliveryBoyRepostiory.save(deliveryBoy)).willThrow(new DeliveryBoyException("Delivery boy identifier"));
		assertThrows(DeliveryBoyException.class, ()->deliveryBoyService.saveOrUpdate(deliveryBoy));
	}

}
