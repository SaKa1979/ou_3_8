import java.util.ArrayList;
import verkiezingen.Stemmachine;
import verkiezingen.Partij;
import verkiezingen.Kandidaat;

public class LijstProgramma {
  public static void main(String[] args) {	        

  int aantalPartijen;
  int aantalKandidaten;
    
  Stemmachine stemmachine = new Stemmachine(); //create an object of type Stemmachine
  stemmachine.zetAan(); //Creates partijen en kandidaten objects automatically

  //Create ArrayList of partij
  ArrayList<Partij> partijlijst = stemmachine.getPartijen();
  //Get amount of partijen in partijlijst
  aantalPartijen=partijlijst.size();
  //Get laatste partij from partijlijst 
  Partij laatstepartij = partijlijst.get(aantalPartijen-1);//just an index number
  
  //Create ArrayList of the candidates in the last (3d) partij
  ArrayList<Kandidaat> kandidatenlijst = laatstepartij.getKandidaten();
  //Get amount of kandidaten
  aantalKandidaten=kandidatenlijst.size();
  //Get laatste kandidaat from kandidatenlijst
  Kandidaat laatsteKandidaat = kandidatenlijst.get(aantalKandidaten-1);
  
  System.out.println("De laatste kandidaat is "+ laatsteKandidaat.getNaam());

  for(Partij p: partijlijst){//For the size of arrayList partijlijst do
    p.stemOpNummer(1);//call method of object p. Object p only known in this scope.    
    }
  System.out.println("De uitslag per kandidaat van de laatste partij is ");
  System.out.println(laatstepartij.geefUitslagPerKandidaat());
  System.out.println("De uitslag per kandidaat is :"); 
  System.out.println(stemmachine.geefUitslagPerKandidaat());
  }
}
