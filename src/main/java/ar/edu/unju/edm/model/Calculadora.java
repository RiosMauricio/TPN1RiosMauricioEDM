package ar.edu.unju.edm.model;

import org.springframework.stereotype.Component;

@Component
public class Calculadora {
	private int a, b; 
	
	public Calculadora() {
		// TODO Auto-generated constructor stub
	}

	public Calculadora(int a, int b) {
		super();
		this.a = a;
		this.b = b;
	}
	
	public int sumar(){
		return a+b; 
	}
	
	public int restar() {
		return a-b; 
	}
	
	public int multiplicar() {
		return a*b; 
	}
	
	public int dividir() {
		return a/b; 
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}
	
	
}
