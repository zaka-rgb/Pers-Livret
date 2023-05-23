
public class Personne {
	
	private String nom;
	private Date dt;
	//1
	public Personne(){}
	public Personne(String nom,Date dt){
		this.nom=nom;
		this.dt=dt;
	}
	public Personne(Personne p){
		this(p.nom,p.dt);
	}
	//2
	public static boolean compnom(Personne p1,Personne p2){
		if(p1.nom.equals(p2.nom))
			return true;
		
		return false;
		
	} 
	
	//3
	public static int compage(Personne p1,Personne p2){
		if(Date.comp(p1.dt,p2.dt)==1)
			return 1;
		else if(Date.comp(p1.dt,p2.dt)==2)
			return 2;
		
		else
		return 0;
	}
	//4
	public static boolean verif(Personne p1,Personne p2){
		if(compage(p1,p2)==0)
			return true;
		
		return false;
		
	} 
	//5
	@Override
	public String toString(){
		
		return " peronne "+this.nom+" né á "+ this.dt ;
		
	}
	
	

}
