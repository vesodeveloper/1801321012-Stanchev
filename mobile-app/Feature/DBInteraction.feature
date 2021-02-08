#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: Взаимодействие с базата данни
 

  
  Scenario: Добавяне на Любими места в базата данни
    Given Потребителя от началния екран навигира до екрана с любими места
    When Въвежда заглавие на любимото място "Ancient Theater Plovdiv"
    And Въвежда описание на любимото място "Ancient Roman Theater Plovdiv"
    And Натиска бутона за добавяне на мястото към базата данни
    Then Вижда във записите в базата данни добавеното ново място
    

 