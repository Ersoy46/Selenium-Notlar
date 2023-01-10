Feature: US1001 Kullanici Datebase'e baglanip bilgileri okuyabilir
  @db
  Scenario: TC01 kullanici database'e baglanip istedigi bilgileri okuyabilmeli


    Given kullanıcı HMC veri tabanina baglanir
    And kullanici "tHOTELROOM" tablosundaki "Price" verilerini alir
    And kullanici "Price" sutunundaki verileri okur

