package Atividadeppi;


import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)

public class testePais {
	Pais pais, copia;
	static int id = 0;

	
	@Before
	public void setUp() throws Exception {
		System.out.println("Setup");
		pais = new Pais(id, "Chile", 18050000, 759650);
		copia = new Pais(id, "Chile", 18050000, 759650);
		System.out.println(pais);
		System.out.println(copia);
		System.out.println(id);
	}

	@Test
	public void teste00Carregar() {
		System.out.println("Carregar");
		Pais fixture = new Pais(1, "Brasil", 210147125, 8515000);
		Pais novo = new Pais(1, null, 0, 0);
		novo.carregar();
		assertEquals("testa inclusao", novo.getId(), fixture.getId());
	}

	@Test
	public void teste01Criar() {
		System.out.println("Criar");
		pais.criar();
		id = pais.getId();
		System.out.println(id);
		copia.setId(id);
		assertEquals("testa criacao", pais.getId(), copia.getId());
	}

	@Test
	public void teste02Atualizar() {
		System.out.println("Atualizar");
		pais.setPopulacao(9999990);
		copia.setPopulacao(999999);
		pais.atualizar();
		pais.carregar();
		assertEquals("testa atualizacao", pais.getId(), copia.getId());
	}

	@Test
	public void teste03Excluir() {
		System.out.println("Excluir");
		copia.setId(-1);
		copia.setNome(null);
		copia.setPopulacao(0);
		copia.setArea(0);
		pais.excluir();
		pais.carregar();
		assertEquals("testa exclusao", pais.getId(), copia.getId());
	}
	
	
	
}


