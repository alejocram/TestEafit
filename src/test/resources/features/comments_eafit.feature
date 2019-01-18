
@Regresion
Feature: Contactenos Universidad EAFIT
Como estudiante Quiero enviar un comentario a la Universidad EAFIT A través de la pagina de Contáctenos

	@Comentario
	Scenario: Envio comentario Universidad EAFIT
	Given que Yeison quiere escribir un comentario a la Universidad EAFIT
	When el envia el comentario
	|nombre |correo |telefono |ciudad |comentario |
	|Yeison Arias |yarias@correo.com |2222222 |Medellin |Excelente universidad |
	|Alejandro Carmona |jcarmon4@correo.com |2222222 |Medellin |Pruebas del portal |
	|Jason Carcamo |jcarcam1@correo.com |2222222 |Medellin |Pruebas del portal |
	Then el visualiza el pantalla el mensaje "Muchas gracias por su comentario."