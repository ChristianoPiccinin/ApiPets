package br.com.univille.petsapi.controller;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;
import static org.springframework.web.bind.annotation.RequestMethod.DELETE;
import static org.springframework.web.bind.annotation.RequestMethod.PUT;
import org.springframework.web.bind.annotation.PathVariable;
import java.util.List;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import br.com.univille.petsapi.dao.PetsDAO;
import br.com.univille.petsapi.model.Pets;

import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class PetsController {
	
	@ResponseBody
	@RequestMapping(value = "/pets",method = GET, produces = "application/json")
	public List<Pets> getAll() {
		PetsDAO dao = new PetsDAO();
		
		return dao.getAll();
	}
	
	@ResponseBody
	@RequestMapping(value = "/pets/{id}",method = GET, produces = "application/json")
	public Pets get(@PathVariable int id) {
		PetsDAO dao = new PetsDAO();
		
		return dao.get(id);
	}
	
	@ResponseBody
	@RequestMapping(value = "/pets",method = POST, produces = "application/json")
	public ResponseEntity<?> add(@RequestBody Pets Pets) {
		System.out.println(Pets);
		PetsDAO dao = new PetsDAO();
		dao.insert(Pets);
		return ResponseEntity.ok().build();
	}
	
	@ResponseBody
	@RequestMapping(value = "/pets/{id}",method = DELETE, produces = "application/json")
	public ResponseEntity<?> deleteEmployee(@PathVariable int id) {
		PetsDAO dao = new PetsDAO();
		try {
			dao.deleteById(id);
		}catch(Exception e) {
			return ResponseEntity.notFound().build();
		}
		return ResponseEntity.ok().build();
	}
	
	@ResponseBody
	@RequestMapping(value = "/pets/{id}",method = PUT, produces = "application/json")
	public ResponseEntity<?> putPet(@PathVariable int id, Pets pet) {
		PetsDAO dao = new PetsDAO();
		try {
			dao.putByPet(pet);
		}catch(Exception e) {
			return ResponseEntity.notFound().build();
		}
		return ResponseEntity.ok().build();
	}

}
