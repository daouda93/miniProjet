package tab;


	public class Tabtrie {
		public boolean rechercheT(Object v, int tabTrie[])throws Exception{
			if(!(v instanceof java.lang.Integer)){
				throw new Exception();
				
			}
			int m = 0;
			int ifin = tabTrie.length;
			boolean x = false;
			int id = 0;
			while(x == false && (ifin - id) > 1){
			
				m = (id + ifin)/2;  //on détermine l'indice de milieu
			    
			    x = (tabTrie[m] == (Integer)v);  //on regarde si la valeur recherchée est à cet indice
			    
			    if(tabTrie[m] > (Integer)v) ifin = m;  //si la valeur qui est à la case "im" est supérieure à la valeur recherchée, l'indice de fin "ifin" << devient >> l'indice de milieu, ainsi l'intervalle de recherche est restreint lors du prochain tour de boucle
			    else id = m;  //sinon l'indice de début << devient >> l'indice de milieu et l'intervalle est de la même façon restrein
				
				
		}
		return x;
	}

	public void trieC(int tabTrie[]) throws Exception{
			if( tabTrie == null){
				throw new Exception();
			}

			if (tabTrie.length > 2){
		
			int i,j;
			int tmp = 0;
			//int min = tabTrie[0];
			
			for(i = 0; i < tabTrie.length; i++){
				for(j = 0; j < tabTrie.length; j++){
					if( tabTrie[i] < tabTrie[j]){
						tmp = tabTrie[i];
						tabTrie[i] = tabTrie[j];
						tabTrie[j] = tmp;
					}
				}
			}
		}	
		
	}
	
	public void trieD(int tabTrie[]){
		
		int i,j;
		int tmp = 0;
		//int min = tabTrie[0];
		
		for(i = 0; i < tabTrie.length; i++){
			for(j = 0; j < tabTrie.length; j++){
				if( tabTrie[i] > tabTrie[j]){
					tmp = tabTrie[i];
					tabTrie[i] = tabTrie[j];
					tabTrie[j] = tmp;
				}
			}
		}
		
	}
	
	public void afficher(int tabTrie[]){
		int i;
		for(i = 0; i < tabTrie.length; i++){
			System.out.print(" | " + tabTrie[i]);
		}
	}
}
