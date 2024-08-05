Feature: Netflix

  Scenario: Netflix Kosumlari
    Given SearchCode sayfasina gidilir
    And netflix
    And Search butonuna tiklanir
    And Yeni sekme acilir
    Given SearchCode sayfasina gidilir
