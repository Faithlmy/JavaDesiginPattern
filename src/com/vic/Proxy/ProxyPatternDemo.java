package com.vic.Proxy;

public class ProxyPatternDemo {

	 public static void main(String[] args) {
	      Image image = new ProxyImage("test_10mb.jpg");
	 
	      // ͼ�񽫴Ӵ��̼���
	      image.display(); 
	      System.out.println("");
	      // ͼ����Ҫ�Ӵ��̼���
	      image.display();  
	   }
}
