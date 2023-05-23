
public class test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

Date dt=new Date(12,12,2010);
Livret l=new Livret (5);
Personne p=new Personne("zakaria",dt);
l.ajouter(p);




System.out.print("\n");



System.out.print(l.toString());
		
		
	}

}
