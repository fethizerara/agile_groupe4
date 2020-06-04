Feature: mettre les chevaux du box dans la bibliothèque
  En tant que Responsable de Box
  Je vais mettre mes chevaux dans la bibiothèque
  Car je veux augmenter leur vitesse

  Scenario Outline: 
    Given une HorseLibrary
    When on crée une deuxième HorseLibrary
    Then l'application nous renvoie un <messageErreur>

    Examples: 
      | messageErreur |
      | "existe déjà" |
