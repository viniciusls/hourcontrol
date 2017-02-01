package br.com.viniciusls.hourcontrol.rest.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.viniciusls.hourcontrol.models.TimeTrackingItem;

/**
 * Created by vinicius.silva on 01/02/2017.
 */
@Repository
public interface TimeTrackingItemRepository extends JpaRepository<TimeTrackingItem, Long> {

}
