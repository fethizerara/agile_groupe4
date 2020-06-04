Feature: Augmenter la capacité du Box
  En tant que proprétaire de l'installation 
  Je veux augmenter la capacité des chevaux que je peux prendre 
  Afin d'avoir de nombreux chevaux soit plus de choix

  Scenario Outline: La capacité a été augmentée
    Given Une box et sa capacité de base <capacity1>
    When on souhaite augmenter la nouvelle <newCapacity>
    Then la nouvelle box a une capacité supérieure

    Examples: 
      | capacity1 | newCapacity |
      |        10 |        20 |
