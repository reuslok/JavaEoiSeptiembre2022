package Enums;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainEnums {
	final static int NUMERODEALUMNOS= 10;
	static List<AlumnosEnums> alumnos=new ArrayList();
	
	public static void main(String[] args) {
		InitData();

		MenuEnums.Menu();
		
	}

	private static void InitData() {

		Double random;
		for(int i=1;i<NUMERODEALUMNOS+1;i++){
			random=Math.random()*1000;
			random=(double) Math.round(random)/100;
		alumnos.add(new AlumnosEnums("alumno "+i,CalificacionesEnums.getCalificacionesEnums(random),random));
		System.out.println("");
	}

	

	
		
}
}
