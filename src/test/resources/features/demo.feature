#Author: your.email@your.domain.com

@Regresion
Feature: Acceso Aplicativo Metis
Como usuario
Quiero autenticarme en Metis
A través de la pagina de acceso a la aplicación.

	@Autenticacion
	Scenario: Realizar la Autenticación en Metis.
	Given que Yeison quiere acceder a Metis
	When en escribe el usuario "demo" y la clave "demo"
	Then el ve el mensaje de "Hola"