Feature: Saccager les livres
  En tant que Auteur Pégase
  Je vais saccager tous les livres
  Car j'ai des problèmes mentaux

  Scenario Outline: Le cheval n'a plus de livres
    Given Un cheval
    And deux livres de <titre1> et <titre2> et leurs <prixVente1> <prixVente2>
    When le cheval saccage ses livres
    Then le nombre de livres est de <nbLivres>

    Examples: 
      | titre1        | prixVente1 | titre2              | prixVente2 | nbLivres |
      | "Livre Agile" | 15.0       | "Livre des jungles" | 50.0       |        0 |
