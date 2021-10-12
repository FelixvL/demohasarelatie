package knb.dinsdag.olc.view;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import knb.dinsdag.olc.controller.LesdagRepository;
import knb.dinsdag.olc.domein.Leraar;
import knb.dinsdag.olc.domein.Lesdag;

@RestController
public class LesdagEndpoint {
	@Autowired
	LesdagRepository lr;
	
	@Autowired
	LeraarRepository leraarr;
	
	@GetMapping("hoera")
	public void go() {
		System.out.println("yes");
		Lesdag l = new Lesdag();
		Leraar temp = leraarr.save(l);
		l.setLeraar(temp);
		lr.save(l);
	}
}
