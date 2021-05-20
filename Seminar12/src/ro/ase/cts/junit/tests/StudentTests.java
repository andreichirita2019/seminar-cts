package ro.ase.cts.junit.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import ro.ase.cts.junit.clase.Student;

public class StudentTests {

	@Test
	public void testConstructorCuParametru() {
		String nume = "Gigel";
		Student student  = new Student(nume);
		
		assertEquals("Numele nu a fost initializat",nume,student.getNume());
		//assertNotEquals(student.getNote(),null);
		assertNotNull("Lista nu a fost initializata",student.getNote());
	}
	
	@Test
	public void testSetterNume() {
		String nume = "Gigel";
		Student student  = new Student();
		student.setNume(nume);
		assertEquals(nume,student.getNume());
		
	}
	
	@Test
	public void testConstructorFaraParametri() {
		String nume = "Gigel";
		Student student  = new Student();
		
		//de preferat sa nu folosim doua asertii
		assertNotNull("Numele nu a fost initializat",student.getNume());
		assertNotNull("Lista nu a fost initializata",student.getNote());
	}
	
	@Test
	public void testAdaugareNotainLista() {
		Student student = new Student();
		int nota = 8;
		student.adaugaNota(nota);
		assertEquals(nota,student.getNota(0));
	}
	
	@Test
	public void testDimensiuneLista() {
		Student student = new Student();
		int nota = 8;
		student.adaugaNota(nota);
		assertEquals(1,student.getNote().size());
	}
	
	
	@Test
	public void testCalculeazaMedie() {
		Student student = new Student();
		int nota1 = 10;
		int nota2 = 9;
		int nota3 = 5;
		student.adaugaNota(nota1);
		student.adaugaNota(nota2);
		student.adaugaNota(nota3);
		float medie = (nota1+nota2+nota3)/3;
		//assertequals nu poate compara valori reale
		//ii dam cel de-al treilea parametru numit marja de eroare
		assertEquals(medie,student.calculeazaMedie(),0.01);
	}
	
	@Test
	public void testCalculeazaMediePentruONota() {
		Student student = new Student();
		int nota1 = 10;
		student.adaugaNota(nota1);
		//assertequals nu poate compara valori reale
		//ii dam cel de-al treilea parametru numit marja de eroare
		assertEquals(nota1,student.calculeazaMedie(),0.01);
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testCalculeazaMediePentruNicioNota() {
		Student student = new Student();
		student.calculeazaMedie();
		
	}
	
	
	@Test
	public void testAreRestante() {
		Student student = new Student();
		int nota1 = 8;
		int nota2 = 3;
		int nota3 = 2;
		student.adaugaNota(nota1);
		student.adaugaNota(nota2);
		student.adaugaNota(nota3);
		assertTrue(student.areRestante());
	}
	
	@Test
	public void testNuAreRestante() {
		Student student = new Student();
		int nota1 = 8;
		int nota2 = 9;
		int nota3 = 10;
		student.adaugaNota(nota1);
		student.adaugaNota(nota2);
		student.adaugaNota(nota3);
		assertFalse(student.areRestante());
	}
	
	@Test
	public void testGetNotaPozitieIncorecta() {
		Student student = new Student();
		int nota1 = 8;
		int nota2 = 9;
		int nota3 = 10;
		student.adaugaNota(nota1);
		student.adaugaNota(nota2);
		student.adaugaNota(nota3);
		
		//1
		try {
			//2
			student.getNota(3);
			//3
			fail("Metoda nu arunca exceptie");
		}catch(IndexOutOfBoundsException ex) {
			//4
			System.out.println(ex);
		}
		//5
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testAdaugaNotaIncorecta() {
		Student student = new Student();
		int nota =11;
		student.adaugaNota(nota);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}