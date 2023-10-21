package model.repositories;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ArticuloRepositorioTest {

	@Test
	void test() {
		ArticuloRepositorio repo = new ArticuloRepositorio();
		System.out.println(repo.findById(3).isPresent());
	}

}
