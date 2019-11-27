package Strings;

//bimport java.util.Scanner;

public class fun_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer name=new StringBuffer("Abin ");
		name.append(" Baby");
		name.replace(4,4,"a");
		name.insert(6, "gand");
		name.reverse();
		System.out.println(name);
	}

}
