package P5_ReflexiveAssoziation;

import java.util.ArrayList;
 
public class Fahrzeuginsasse {
   
    ArrayList<Fahrzeuginsasse> beifahrerListe = new ArrayList<Fahrzeuginsasse>();
   
    public void addBeifahrer(Fahrzeuginsasse insasse){
        //bei insase null ist abrechen
        if (insasse == null) return;
        //wenn insasse man selbst ist abrechen
        if (insasse==this) return;
        //wenn insasse schon beifahrer ist abrechen
        if (beifahrerListe.contains(insasse)) return;
        //wenn schon 4 beifahrer existieren, abrechen
        if (beifahrerListe.size()>=4) return;
       
        beifahrerListe.add(insasse);
    }
}