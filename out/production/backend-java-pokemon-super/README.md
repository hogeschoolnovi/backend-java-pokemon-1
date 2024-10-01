## Inleiding

Je hebt inmiddels geleerd hoe je relaties, overerving en abstracte klassen moet toepassen. In het backend landschap
worden deze concepten vaak uitgelegd aan de hand van dieren of andere levende wezens. Dus in plaats van de standaard
hond of kat te kiezen, passen wij deze concepten toe op het onderwerp Pokèmon!

### Wat is een pokemon?

Mischien word je al nostalgisch als je het woord "pokemon" hoort en kan je nog steeds alle 152 originele pokemon uit je hoofd opnoemen in alfabetische volgorde, maar mischien ook niet. We zullen hier kort de belangrijkste aspecten van pokemon uitleggen die je nodig hebt voor de context van deze opdracht en de volgende.

Pokemon is een japanse animatie serie. Op deze serie zijn inmiddels tal van computer en kaart spellen gebaseerd. In deze opdracht gaan we zo'n spel nabootsen. In de spellen is het zo dat jij, de speler, een pokemon trainer bent. Je doel is om pokemons te verzamelen en te trainen om uiteindelijk de beste pokemontrainer ter wereld te worden. Een pokemon is dus eigenlijk een soort dier, maar dan één die speciale krachten/aanvallen heeft. Er zijn een heleboel pokemon, hierboven zag je al dat er 152 originele pokemon zijn, maar inmiddels is daar al wel een vijfvoud van. Gelukkig zijn deze pokemon onder te verdelen in types, voor deze opdracht gebruiken we 4 verschillende types, maar er zijn er veel meer. Er zijn zelfs subtypes en nog veel meer variabelen, maar dat is voor deze opdrachten allemaal niet nodig.
Een leuk feitje over pokemons is dat ze altijd één raar geluidje maken. Zo zegt een Pikachu "pika pika" en verder niks.

### Het spel element
voor het spel element zijn een aantal dingen belangrijk om te begrijpen:
- hp (health points)
- aanvallen
- type

Het is dus de bedoeling dat je de beste pokemontrainer ter wereld wordt, dit kun je bereiken door competities te winnen en je pokemons te trainen. Een pokemon kun je trainen door deze te laten vechten met andere pokemons, na elk gewonnen gevecht wordt je pokemon iets sterker. In zo'n gevecht laat je jou pokemon(s) vechten met de andere. Elke pokemon kan unieke aanvallen doen waarmee ze schade kunnen doen aan een andere pokemon. 
Elke pokemon heeft een x aantal "health points" of "hp" en elke keer wanneer deze pokemon schade ontvangt, dan verliest deze een beetje hp. De pokemon die als eerste al zijn hp kwijt is, heeft verloren. Hoe sterker een pokemon is, hoe meer schade een aanval doet. Ook is het elke pokemon effectiever vecht tegen pokemons van een bepaald type en minder effectief tegen pokemons van een ander type, dit verschilt per pokemon. Wanneer  Vaak krijgt de winnende pokemon of pokemontrainer ook een soort van beloning. In de meeste spellen is het ook zo dat je als pokemontrainer mee doet aan een grote competitie waarvan je uiteindelijk de winnaar moet proberen te worden.

## Opdrachtbeschrijving

Je gaat een applicatie programmeren die meerdere nieuwe Pokèmon kan aanmaken. Degenen die bekend zijn met Pokèmon weten
dat deze altijd een _type_ hebben (sterker nog: Pokèmon kunnen meerdere types tegelijk zijn, maar om het niet te moeilijk
te maken, maken we gebruik van één type per Pokèmon). Voorbeelden van deze typen zijn: Fire 🔥, Water 🌊, Grass 🌿 en
Electric ⚡.

Naast hun type, hebben Pokèmon natuurlijk bepaalde eigenschappen met elkaar gemeen. Daarom maken we gebruik van een
Super klasse. 

![Pokemon!](./Assets/pokemon.JPG)

## Randvoorwaarden

De applicatie moet voldoen aan het volgende:

- Een Super klasse waarvan minimaal 2 `private` variabelen, 1 constructor, 2 methodes, 2 getters en 2 setters;
- 4 subklassen die, naast alles dat ze erven, zelf ook minimaal 2`private` variabelen, 1 constructor, 2 methodes, 1 `override` methode, 2 getters en 2
  setters bevatten. _Tip_: wil je wat inspiratie bij het bedenken van variabelen en methodes op het gebied van Pokèmon? Bekijk de
  inspiratie-sectie hieronder eens.
- Een `src.Main`-klasse met een `src.Main`-methode;
- In de `src.Main`-methode worden vier verschillende Pokèmon-objecten van verschillende klassen geïnstantieerd- en gedeclareerd. Met behulp van deze objectnamen kunnen de methodes van de verschillende klassen worden uitgevoerd;

Deze methodes mogen `void` teruggeven en een `system.out.println` uitvoeren.

### Inspiratie en tips

Weet je niet wat voor variabelen je jouw klassen kunt meegeven? Denk eens aan:

- `name`
- `level`
- `hp` (health points)
- `xp` (experience points)
- `height`
- `weight`
- `food`
- `sound`
- `defence`
- `attack`
- `special`
- `accuracy`

Pokèmon kunnen ook ontzettend veel verschillende acties uitvoeren. Zo kun je denken aan de volgende methodes:

- `eats()`
- `speaks()`
- `thunderPunch()`
- `cometPunch()`
- `surf()`
- `leafStorm()`
- `inferno()`
- `electroBall()`
- `pyroBall*()`
- `solarBeam()`
- `hydroPump()`
- `thunder()`
- `hydroCanon()`
- `fireLash()`
- `leechSeed()`
- `voltTackle()`
- `rainDance()`
- `leaveBlade()`
- `flameThrower()`
- `pound()`
- `scratch()`
- `gust()`
- `hornAttack()`
- `psyBeam()`

## Stappenplan
Het is uitdagender om jouw eigen stappenplan te maken, maar als je niet weet waar je wil beginnen kun je dit stappenplan volgen.
1. Maak een `src.Main`-klasse aan in de `src`-map.
2. Maak vervolgens binnen de `src.Main`-klasse een `src.Main`-methode aan. Anders kun je de applicatie immers niet draaien!
3. Maak een Pokèmon Super klasse aan en zorg ervoor dat deze voldoet aan de gestelde randvoorwaarden (
   zie: [randvoorwaarden](#randvoorwaarden))
5. Maak de volgende subklassen aan en laat deze voldoen aan de gestelde randvoorwaarden (
   zie: [randvoorwaarden](#randvoorwaarden)):

- `FirePokemon`
- `WaterPokemon`
- `GrassPokemon`
- `ElectricPokemon`

5. Instantieer in de `src.Main` methode jouw 4 verschillende Pokèmon met de verschillende attributen.

6. Voer in de `src.Main methode` verschillende methodes uit van verschillende `Pokemons`, uit zowel de `subklassen` als uit
   de `super klasse`.

## Bonusopdrachten

1. Bedenk of het mogelijk zou zijn om een abstracte klasse te implementeren in deze appplicatie. En zo ja, implementeer deze abstracte klasse dan in jouw project;
2. Bedenk of het mogelijk zou zijn om één of meer abstracte methodes te implementeren. En zo ja, implementeer deze!
3. Probeer een manier te vinden waardoor één Pokèmon twee verschillende types tegelijk zou kunnen zijn. Kun je dit implementeren?
