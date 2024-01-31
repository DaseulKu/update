package chap07.sec02.exam02pack2;

import chap07.sec02.exam02pack1.A;

public class D extends A{
	public D() {
		super();
		this.field = "value";
		this.method();
	}
	public void method() {
		this.field = "value";
		this.method();
	}
}