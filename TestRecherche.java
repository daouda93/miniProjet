package tab;

import static org.junit.Assert.*;

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

public class TestRecherche {
	@Test
	public void main() throws Exception {
		int tab[] = {0,1,15,4,5,12,7,11,12};
		Tabtrie tab2 = new Tabtrie();
		tab2.trieC(tab);
		assertTrue(tab2.rechercheT("11", tab));

		
		
	}
}
