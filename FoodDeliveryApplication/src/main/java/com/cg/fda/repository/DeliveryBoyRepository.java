package com.cg.fda.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.fda.domain.DeliveryBoy;

/**
 * Repository interface implemented by Spring itself for providing various CRUD operations on DeliveryBoy POJO.
 * @author amansoni
 *
 */
@Repository
public interface DeliveryBoyRepository extends JpaRepository<DeliveryBoy, Long> {
	/**
	 * A method to find the delivery boy inside the repository based on delivery boy identifier.
	 * @param deliveryBoyIdentifier
	 * @return the delivery boy instance if delivery boy with particular delivery boy identifier exist otherwise return null.
	 */
	DeliveryBoy findByDeliveryBoyIdentifier(String deliveryBoyIdentifier);

}
