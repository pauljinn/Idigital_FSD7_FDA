package com.cg.fda.web;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.fda.service.DeliveryBoyService;
import com.cg.fda.service.MapValidationErrorService;
import com.cg.fda.domain.DeliveryBoy;

/**
 * A rest controller which handles all the URL request given by the application for the various services.
 * @author amansoni
 *
 */
@RestController
@RequestMapping("/api/delivery")
@CrossOrigin
public class DeliveryBoyController {
	@Autowired
	private DeliveryBoyService deliveryBoyService;
	
	@Autowired
	private MapValidationErrorService mapValidationErrorservice;
	
	@PostMapping("")
	public ResponseEntity<?> createNewDeliveryBoy(@Valid @RequestBody DeliveryBoy deliveryBoy, BindingResult result){
		ResponseEntity<?> errorMap = mapValidationErrorservice.mapValidationError(result);
		if(errorMap!=null) return errorMap;
		DeliveryBoy newDeliveryBoy = deliveryBoyService.saveOrUpdate(deliveryBoy);
		return new ResponseEntity<DeliveryBoy>(newDeliveryBoy,HttpStatus.CREATED);
	}

}
