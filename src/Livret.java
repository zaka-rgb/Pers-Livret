
public class Livret {
	
	private int dim;
	private int der=-1;
	private Personne[] cont;
	
	public Livret(){}
	public Livret(int dim){
		this.dim=dim;
		this.cont=new Personne[dim];
		}
	
	public boolean estplein(){
		
		if(this.dim==this.der+1)
			return true;
		
		return false;
		
	}
	
	public void redim(){
		Livret l=new Livret(this.dim+1);
		for(int i=0;i<this.der;i++)
			l.ajouter(new Personne(this.cont[i]));
		l.dim=this.dim+1;
		this.cont=l.cont;
		
		}
	
	public boolean ajouter(Personne p){
		if(p==null)
			return false;
		
		if(this.estplein())
		this.redim();
		
		else 
			this.cont[der+1]=p;
		der++;
		return true;
		
		
		
		
	}
	public Livret(Livret l){
		this(l.dim);
		for(int i=0;i<=l.der;i++){
			{Personne p=new Personne(l.cont[i]);
		this.ajouter(p);
			}
		}
	}
		
		public int local(Personne p){
			
			for(int i=0;i<=der;i++){
			Personne p1=new Personne(this.cont[i]);
			if(Personne.compnom(p1, p)==true)
				return i;
			}
			
			return -1; 
			
			}
		
		public Livret[] Catalog(){
			
			
int cont=1;
boolean deja=false;
Livret [] cata = null;


for(int i=0; i<=this.der;i++){
	
	for(int d=i-1;i>der;d--){
		
		if(Personne.compage(this.cont[i],this.cont[d] )==0)
			deja=true;
		break;
		
		}
	if(deja=false){
		for(int j=i+1;i<=der;j++)
		{
			if(Personne.compage(this.cont[i],this.cont[j] )==0)
				cont++;
		}
		int k=0,kk=0;
		
		Livret aux=new Livret(cont);
		cata[kk]=aux;
		cata[kk].cont[0]=this.cont[i];
		
		
		
		for(int j=i+1;i<=der;j++)
		{
			if(Personne.compage(this.cont[i],this.cont[j] )==0)
				{cata[kk].cont[k]=this.cont[j];
				 k++;
				}
			
		}
		kk++;
	}
		
}
	
return cata;	
	
			
			
		}
		
		
		
	/*	public String afficherp(){
			String s = null;
			
			for(int i=0;i<=this.der;i++)
				{s=s+this.cont[i].toString();
				s=s+"";
				}
			return s;
			
		}*/
		
		
		
	@Override
	public String toString(){
		
		
		String s= "la dimention est "+this.dim+ " le dernier est "+this.der+
				" les personnes de livret sont " ;
		for(int i=0;i<=der;i++)
		s+=this.cont[i];
		
	
		return s;
				
					
		
		
		
		
	}
		
	}
	


