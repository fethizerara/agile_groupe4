Feature: Une personne essaie de créer une deuxième librairie de chevaux
  En tant que Personne
  Je vais créer une deuxième librairie
  Car je veux vérifier qu'il existe qu'une seule librairie de chevaux

  Scenario Outline: 
    Given une HorseLibrary
    When on crée une deuxième HorseLibrary
    Then l'application nous renvoie un <messageErreur>

    Examples: 
      | messageErreur |
      | "existe déjà" |
