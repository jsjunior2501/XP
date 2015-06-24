package br.eng.rafaelsouza.dingdong;

import static org.junit.Assert.*;

import org.junit.Test;

public class DingDongTest {

	@Test
	public void VerificaRetornoDingEnviandoNumero3() {
		DingDong dingdong = new DingDong();
		String retorno = dingdong.calcular(3);
		assertEquals("Ding", retorno);
	}
	
	@Test
	public void VerificaRetornoDongEnviandoNumero5() {
		DingDong dingdong = new DingDong();
		String retorno = dingdong.calcular(5);
		assertEquals("Dong", retorno);
	}
	
	@Test
	public void VerificaRetornoDingDongEnviandoNumero15() {
		DingDong dingdong = new DingDong();
		String retorno = dingdong.calcular(15);
		assertEquals("DingDong", retorno);
	}
	
	
	@Test
	public void VerificaRetorno2EnviandoNumero2() {
		DingDong dingdong = new DingDong();
		String retorno = dingdong.calcular(2);
		assertEquals("2", retorno);
	}
	
	@Test
	public void VerificaRetornoDingDongEnviandoNumero0() {
		DingDong dingdong = new DingDong();
		String retorno = dingdong.calcular(0);
		assertEquals("DingDongDung", retorno);
	}
	
	@Test
	public void VerificaRetornoDingEnviandoNumero3Negativo() {
		DingDong dingdong = new DingDong();
		String retorno = dingdong.calcular(-3);
		assertEquals("", retorno);
	}

	@Test
	public void VerificaRetornoDungEnviandoNumero49() {
		DingDong dingdong = new DingDong();
		String retorno = dingdong.calcular(49);
		assertEquals("Dung", retorno);
	}
	
//	@Test
//	public void VerificaRetornoExcecaoEnviandoNumero109() {
//		DingDong dingdong = new DingDong();
//		String retorno = dingdong.calcular(109);
//		assertEquals(throw new IllegalArgumentException, retorno);
//	}	

}
