# Prisoner's Dilemma

## Beschreibung
Bei diesem Spiel treten immer sind 2 Gefangene bei einem
Verhör. Die Gefangenen werden unabhängig 400 mal zu einem Tathergang befragt, an dem beide beteiligt waren. 

## Szenarien
1. Gefangener g1 verrät den g2 tut dies nicht.	$rightarrow$	2 Pkte für g1
2. Gefangener g1 und g2 verraten beide nicht.	$rightarrow$	1 Pkt für Beide
3. Beide Gefangenen verraten					$rightarrow$	0 Pkte für Beide

# Aufgabe
Entwickeln sie einen einen Algorithmus welcher `true` oder `false` zurückgibt.
Dabei steht `true` für Verrat. Als Entscheidungsgrundlage verwenden Sie ein bool'sches Array aller Entscheidungen von g1 (Sie selbst) und g2.

```java
class Prisoner_MEINNAME{
	public static boolean entscheidung(pIch[]:boolean, pGegner[]:boolean){
		boolean meineEntscheidung = true;

		//... Ihr Algorithmus
		
		return meineEntscheidung;
	}
}
```

# Auswertung
Für die Auswertung treten immer 2 Algorithmen gegeneinander an. Kopieren Sie dafür Ihre Klasse in das Tauschlaufwerk. Der Moderator am Lehrer-PC fügt die Klassen zusammen, so dass getestet werden kann.

