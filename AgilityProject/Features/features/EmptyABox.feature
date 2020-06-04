Feature: En tant que responsable de Box
  Je veux faire sortir tout les chevaux
  Afin de les préparer pour la course

  Scenario Outline: Empty the box
    Given A box with <numero> and <capacity>
    When An user empties the box
    Then Application returns <feedback>

    Examples: 
      | numero | capacity | feedback                    |
      |      4 |        5 | "Le box vient d'être vidée" |
