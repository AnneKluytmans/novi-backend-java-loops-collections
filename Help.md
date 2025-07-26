## Inleiding
Welkom bij de derde huiswerkopdracht die jullie gaan maken voor de Backend leerlijn! Je hebt als het goed is de hoofdstukken gelezen op EdHub en je hebt de derde les van de cursus Java gevolgd. In deze opdracht ga je oefenen met arrays, collecties en loops. Dit ga je doen door het maken van een nummer-vertaler.

## Clonen van dit project
1. Clone dit project naar je eigen computer door een nieuw project te maken met de optie `Project from version control` of `get from VCS`, zoals je in de git-workshop geleerd hebt.
2. Ontkoppel de remote met `git remote remove origin`.
3. Maak een nieuwe repository op je eigen github pagina en koppel die aan dit project met `git remote add origin [link naar jou github repo]`
4. Zorg dat je main-branch ook echt "main" heet met `git branch -M main`.
5. Push vervolgens je de (originele) main branch naar je eigen github met `git push -u origin main`.
6. Maak nu een nieuwe huiswerk-branch aan om je huiswerk op te maken met `git checkout -b [naam van je nieuwe branch]`


## Opdrachtbeschrijving

Je gaat een applicatie bouwen die getallen vertaalt van numeriek (1, 2, 3, etc.) naar alfabetisch (een, twee, drie, etc.).
Je gaat die getallen vertalen door gebruik te maken van een HashMap.
Je zet de numerieke getallen als sleutel (key) en de alfabetische getallen als waarde (value) in de HashMap.
Vervolgens vraag je de gebruiker om een input van 0 t/m 9 te geven en ga je dat "vertalen" door simpelweg de waarde uit de HashMap te vragen met de bijbehorende sleutel
en dat terug te geven aan de gebruiker.


## Randvoorwaarden
De opdracht moet voldoen aan de volgende voorwaarden:
- In je main methode staan twee arrays (1 numeriek en 1 alfabetisch), een boolean variabele, een Translator object en een Scanner object;
- Je project bevat 1 Translator class met daarin een HashMap variabele, een constructor met 2 arrays als parameter en een translate functie;
- De logica van de applicatie wordt gedraaid in een while(boolean)-loop in je main methode.


## Mastermind (Mastermind)

Deze opdracht is los staand van de vorige opdracht. Mastermind is een spel waarbij je 4 verschillende random nummers moet raden. Als je een getal goed raadt en deze staat op de juiste plek krijg je + als feedback. Is het nummer goed maar niet op de juiste plek dan krijg je o als feedback. Komt het nummer helemaal niet voor dan krijg je X als feedback. Bij deze opdracht krijg je een stuk code en is het aan jou om hem verder werkend te krijgen en uit te breiden.

1. maak een methode genaamd "randomNumberGenerator" die een hashset met 4 random nummers returned. _Tip:_ Gebruik een while-loop en de java.util.Random class om random nummers aan de set toe te voegen, zolang de set korter is dan 4.
2. maak een methode die een HashSet als parameter inneemt en een string van 4 nummers returned. _Tip:_ Maak een lege String variable (of StringBuilder). Gebruik een for-loop om door de HashSet te loopen om zo elke element uit de Set toe te voegen aan de String (of StringBuilder).
3. voeg de string van 4 nummers als parameter toe bij het aanroepen van de methode "feedback".
   **Mastermind-bonus:** maak de methode zo dat je vaker kan raden.
4. Zet onderaan een comment erbij waarom de Hashset eigenlijk geen goede keuze is geweest voor deze opdracht.
 