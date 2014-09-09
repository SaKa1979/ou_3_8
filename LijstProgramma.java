import java.util.ArrayList;
import verkiezingen.Stemmachine;
import verkiezingen.Partij;
import verkiezingen.Kandidaat;

public class LijstProgramma {
  public static void main(String[] args) {	        

Stemmachine stemmachine = new Stemmachine(); //create an object of type Stemmachine

//Elections 2006
Partij cda = new Partij("CDA"); //create an object of type Partij
Partij pvda = new Partij("PvdA");
Partij vvd = new Partij("VVD");

//Add party to stemmachine
stemmachine.voegPartijToe(cda);
stemmachine.voegPartijToe(pvda);
stemmachine.voegPartijToe(vvd);

//Create ArrayList of party's
ArrayList<Partij> partijlijst = stemmachine.getPartijen();

//CDA
Kandidaat janPeterBalkenende = new Kandidaat("Jan Peter Balkenende","Capelle aan den IJsel");
Kandidaat maximeVerhagen = new Kandidaat("Maxime Verhagen","Voorburg");
//PvdA
Kandidaat wouterBos = new Kandidaat("Wouter Bos","Amsterdam");
Kandidaat tonHeerts = new Kandidaat("Ton Heerts","Apeldoorn");
//VVD
Kandidaat markRutte = new Kandidaat("Mark Rutte","Den Haag");
Kandidaat ritaVerdonk = new Kandidaat("Rita Verdonk","Nootdorp");

//Add candidate to party
cda.voegKandidaatToe(janPeterBalkenende);
cda.voegKandidaatToe(maximeVerhagen);
pvda.voegKandidaatToe(wouterBos);
pvda.voegKandidaatToe(tonHeerts);
vvd.voegKandidaatToe(markRutte);
vvd.voegKandidaatToe(ritaVerdonk);

//Create ArrayList of candidates
ArrayList<Kandidaat> kandidatenlijstCDA = cda.getKandidaten();
ArrayList<Kandidaat> kandidatenlijstPvdA = pvda.getKandidaten();
ArrayList<Kandidaat> kandidatenlijstVVD = vvd.getKandidaten();

for(int i=0; i<3;i++){
  Partij p = partijlijst.get(i);
  System.out.println(p.getNaam());
  for(int j=0;j<2;j++){
    Kandidaat k = kandidatenlijstCDA.get(j);
    System.out.println(k.getNaam());
    }
  }
  

  }
}
