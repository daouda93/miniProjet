package tab;

import java.io.FileInputStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;


import org.junit.After;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;


@FixMethodOrder(MethodSorters.NAME_ASCENDING)

public class TestTabtrie {
	@Test (expected = Exception.class) 
	public void mainTa() throws Exception{
		int tab[] = null;
		Tabtrie tab2 = new Tabtrie();
		tab2.trieC(tab);
		//tab2.afficher(tab);
		System.out.print("hhh");
		
	}
	
	
}
