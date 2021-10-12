package knb.dinsdag.olc.controller;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import knb.dinsdag.olc.domein.Lesdag;

@Component
public interface LesdagRepository extends CrudRepository<Lesdag, Long>{

}
