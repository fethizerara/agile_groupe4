Feature: mettre les chevaux du box dans la bibliothèque
  En tant que Responsable de Box
  Je vais mettre mes chevaux dans la bibiothèque
  Car je veux augmenter leur vitesse
  
  
  Scenario Outline: 
    Given Une Blibliothèque
    And un box
    When le box est rempli
    Then mettre les chevaux dans la bibliothèque

    Examples: 
      | titre1        | prixVente1 | titre2              | prixVente2 | nbLivres |
      | "Livre Agile" | 15.0       | "Livre des jungles" | 50.0       |        0 |
